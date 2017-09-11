package com.university.rahim.datacollection.Utils;

import android.app.Activity;
import android.content.Context;
import android.util.Log;

import com.university.rahim.datacollection.Ui.SensorActivity;

/**
 * Created by RAHIM on 9/9/2017.
 */

public class TapDetector {
    private static final String TAG = "dbg_TapDetector";
    private int totalTaps = 0;

    private Callback listener;
    private LimitedSizeQueue <Double> qX;
    private LimitedSizeQueue <Double> qY;
    private LimitedSizeQueue <Double> qZ;
    private int qSize;
    private double abnormalityThresholdMin = 0.0d;
    private double abnormalityThresholdMax = 0.0d;
    private double tapProbability = 0.0d;

    public TapDetector(SensorActivity activity, int size, double abnormalityThresholdMin,
                       double abnormalityThresholdMax) {
        listener = activity;
        qX = new LimitedSizeQueue<Double>(size);
        qY = new LimitedSizeQueue<Double>(size);
        qZ = new LimitedSizeQueue<Double>(size);
        qSize = size;
        this.abnormalityThresholdMin = abnormalityThresholdMin;
        this.abnormalityThresholdMax = abnormalityThresholdMax;
        for (int i=0; i<qSize; i++) {
            qX.add(0.0d);
            qY.add(0.0d);
            qZ.add(0.0d);
        }
    }

    public void add(double x, double y, double z) {
        if (this.isAbnormal(x, y, z) || tapProbability > 0) {
            this.checkForTap(x, y, z);
        }
        qX.add(x);
        qY.add(y);
        qZ.add(z);
    }

    private boolean isAbnormal(double x, double y, double z) {
        if (checkMinuteDisturbanceOnValue(z, this.getAvgZ()) || checkMinuteDisturbanceOnValue(x, this.getAvgX()) ||
                checkMinuteDisturbanceOnValue(y, this.getAvgY())) {
            return true;
        }
        return false;
    }

    private boolean isDifferent(double x, double y, double z) {
        if (checkMinuteDisturbanceOnValue(z, qZ.getYongest()) || checkMinuteDisturbanceOnValue(x, qX.getYongest()) ||
                checkMinuteDisturbanceOnValue(y, qY.getYongest())) {
            return true;
        }
        return false;
    }

    private void checkForTap(double x, double y, double z){
        if (isDifferent(x, y, z)) {
            tapProbability += 0.99d;
        } else {
            tapProbability = 0.0d;
        }
        if (tapProbability >= 0.90d) {
            Log.d(TAG, "checkForTap: " + "true" + totalTaps);
            tapProbability = 0.0d;
            totalTaps++;
            listener.tapDetectedCallback();
        }
    }

    private boolean checkMinuteDisturbanceOnValue(double xyz, double xyzAvg){
        return (Math.abs(xyz - xyzAvg)) >= abnormalityThresholdMin && (Math.abs(xyz - xyzAvg)) <= abnormalityThresholdMax;
    }

    public double getAvgX() {
        double avg = 0.0d;
        for (int i=0; i<qSize; i++) {
            avg += qX.get(i);
        }
        avg /= qSize;
        return  avg;
    }

    public double getAvgY() {
        double avg = 0.0d;
        for (int i=0; i<qSize; i++) {
            avg += qY.get(i);
        }
        avg /= qSize;
        return  avg;
    }

    public double getAvgZ() {
        double avg = 0.0d;
        for (int i=0; i<qSize; i++) {
            avg += qZ.get(i);
        }
        avg /= qSize;
        return  avg;
    }

    public interface Callback{
        void tapDetectedCallback();
    }
}
