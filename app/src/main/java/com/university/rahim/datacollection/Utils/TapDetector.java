package com.university.rahim.datacollection.Utils;

import android.os.Handler;
import android.util.Log;

import com.university.rahim.datacollection.Ui.SensorActivity;

/**
 * Created by RAHIM on 9/9/2017.
 */

public class TapDetector {
    private static final String TAG = "dbg_TapDetector";
    private static final double x_flat = 0d;
    private static final double y_flat = 0d;
    private static final double z_flat = 9.8d;
    private int totalTaps = 0;

    private Callback listener;
    private LimitedSizeQueue q;
    private int qSize;
    private double abnormalityThresholdMin = 0.0d;
    private double abnormalityThresholdMax = 0.0d;
    private double tapProbability = 0.0d;
    private double tapProbabilityIncrement = 0.0d;
    private double flatPlacementMargin = 0.3d;
    private int ignoringperiodMilliSec = 0;
    private boolean ignoringPeriodActive = false;

    public TapDetector(SensorActivity activity, int size, double abnormalityThresholdMin,
                       double abnormalityThresholdMax, int wavePointsToDetect, int ignoringPeriodMilliSeconds) {
        listener = activity;
        qSize = size;
        q = new LimitedSizeQueue<SensorValue>(qSize);
        this.abnormalityThresholdMin = abnormalityThresholdMin;
        this.abnormalityThresholdMax = abnormalityThresholdMax;
        this.tapProbabilityIncrement = 1/wavePointsToDetect;
        this.ignoringperiodMilliSec = ignoringPeriodMilliSeconds;
        for (int i=0; i<qSize; i++) {
            q.add(new SensorValue());
        }
        this.ignoreTapDetectionFor(2000); //Do not detect taps for first 2 seconds
    }

    public void add(double x, double y, double z) {
        if (!phonePlacedFlat(x, y, z)) {
            return;
        }
        if (!ignoringPeriodActive) {
            if (this.isAbnormalInTapRange(x, y, z) || this.disturbanceOccuredPreviously()) {
                this.checkForTap(x, y, z);
            }
        }

        q.add(new SensorValue(x, y, z));
    }

    private boolean phonePlacedFlat(double x, double y, double z) {
        if (Math.abs(x - x_flat) <= flatPlacementMargin && Math.abs(y - y_flat) <= flatPlacementMargin
                && Math.abs(z - z_flat) <= flatPlacementMargin)
            return true;
        return false;
    }

    private boolean isAbnormalInTapRange(double x, double y, double z) {
        if (checkMinuteDisturbanceOnValue(x, this.getAvgX()) || checkMinuteDisturbanceOnValue(y, this.getAvgY()) ||
                checkMinuteDisturbanceOnValue(z, this.getAvgZ())) {
            return true;
        }
        return false;
    }

    private boolean isDifferent(double x, double y, double z) {
        if (checkMinuteDisturbanceOnValue(x, ((SensorValue)q.getYongest()).getX()) || checkMinuteDisturbanceOnValue(y, ((SensorValue)q.getYongest()).getY()) ||
                checkMinuteDisturbanceOnValue(z, ((SensorValue)q.getYongest()).getZ())) {
            return true;
        }
        return false;
    }

    private boolean disturbanceOccuredPreviously() {
        if (tapProbability > 0)
            return true;
        return false;
    }

    private void checkForTap(double x, double y, double z){
        if (isDifferent(x, y, z) || true) { //TODO: isDiffernt to be checked
            tapProbability += tapProbabilityIncrement;
        }
        if (tapProbability >= 0.99d) {
            Log.d(TAG, "checkForTap: " + "true" + totalTaps);
            tapProbability = 0.0d;
            totalTaps++;
            ignoreTapDetectionFor(ignoringperiodMilliSec);
            listener.tapDetectedCallback();
        }
    }

    private void ignoreTapDetectionFor(int timeMilliSec) {
        ignoringPeriodActive = true;

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                ignoringPeriodActive = false;
            }
        }, timeMilliSec);
    }

    private boolean checkMinuteDisturbanceOnValue(double value, double valueAvg){
        return (Math.abs(value - valueAvg)) >= abnormalityThresholdMin && (Math.abs(value - valueAvg)) <= abnormalityThresholdMax;
    }

    public double getAvgX() {
        double avg = 0.0d;
        for (int i=0; i<qSize; i++) {
            avg += ((SensorValue)q.get(i)).getX();
        }
        avg /= qSize;
        return  avg;
    }

    public double getAvgY() {
        double avg = 0.0d;
        for (int i=0; i<qSize; i++) {
            avg += ((SensorValue)q.get(i)).getY();
        }
        avg /= qSize;
        return  avg;
    }

    public double getAvgZ() {
        double avg = 0.0d;
        for (int i=0; i<qSize; i++) {
            avg += ((SensorValue)q.get(i)).getZ();
        }
        avg /= qSize;
        return  avg;
    }

    public interface Callback{
        void tapDetectedCallback();

    }
}
