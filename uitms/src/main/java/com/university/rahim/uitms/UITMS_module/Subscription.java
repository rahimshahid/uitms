package com.university.rahim.uitms.UITMS_module;

import android.app.Application;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.util.Log;
import android.widget.Toast;

import com.university.rahim.uitms.UITMS_module.Classifier.ModelRandomForest;
import com.university.rahim.uitms.UITMS_module.Classifier.RandomForest;
import com.university.rahim.uitms.UITMS_module.Detector.SensorValue;
import com.university.rahim.uitms.UITMS_module.Detector.TapDetector;

import java.util.ArrayList;

import static android.content.Context.SENSOR_SERVICE;
import static com.university.rahim.uitms.UITMS_module.Classifier.Evaluate.evalClassifier;

/**
 * Created by RAHIM on 1/25/2018.
 */

public class Subscription implements SensorEventListener {
    private static final String TAG = "DBG_UITMSsubscription";
    private TapDetector tapDetector;
    private SensorManager sensorManager;
    private static RandomForest rf;
    private TapListener tapListener;

    //TODO
    public static double []arrg = null;


    private Subscription(Context context, TapListener tapListener,TapDetector.Callback listener){
        this.tapListener = tapListener;
        sensorManager=(SensorManager) context.getSystemService(SENSOR_SERVICE);
        sensorManager.registerListener(this,
                sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER),
                SensorManager.SENSOR_DELAY_FASTEST);

        rf = new ModelRandomForest();

        tapDetector = new TapDetector(listener, 40, 0.1, 0.9,
                1, 250);
    }

    public void unsubscribe() {
        sensorManager.unregisterListener(this);
    }

    public static Subscription subscribe(Context context, final TapListener tapListener) {
        return new Subscription(context, tapListener, new TapDetector.Callback() {
            @Override
            public void tapDetected() {
                //Log.d(TAG, "tapDetected: ");
            }

            @Override
            public void getWaveOnTap(ArrayList<SensorValue> arr) {
                Log.d(TAG, "getWaveOnTap: ");
                double []wav = new double[96];

                for (int i = 0; i<arr.size();i++) {
                    wav[i] = (arr.get(i).getX());
                }
                for (int i = 0; i<arr.size();i++) {
                    wav[i + 32] = (arr.get(i).getY());
                }
                for (int i = 0; i<arr.size();i++) {
                    wav[i + 64] = (arr.get(i).getZ());
                }

                try {
                    String res = evalClassifier(rf, wav);
                    //Log.d(TAG, "result: " + res);
                    if (res.contains("Left"))
                        tapListener.onTap(TapListener.DIRECTION.LEFT);
                    else if (res.contains("Right"))
                        tapListener.onTap(TapListener.DIRECTION.RIGHT);
                    else if (res.contains("Up"))
                        tapListener.onTap(TapListener.DIRECTION.TOP);
                    else if (res.contains("Down"))
                        tapListener.onTap(TapListener.DIRECTION.BOTTOM);
                }
                catch (Exception e){
                    Log.d(TAG, "run: " + e.toString());
                }
            }
        });
    }

    @Override
    public void onSensorChanged(SensorEvent event) {
        if (event.sensor.getType() == Sensor.TYPE_ACCELEROMETER) {
            tapDetector.add(event.values[0], event.values[1], event.values[2]);
        }
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {

    }

    public interface TapListener {
        enum DIRECTION{LEFT, RIGHT, TOP, BOTTOM};
        void onTap(DIRECTION dir);
    }
}
