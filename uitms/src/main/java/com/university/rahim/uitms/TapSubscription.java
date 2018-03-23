package com.university.rahim.uitms;

import android.content.Context;

import com.university.rahim.uitms.Accelerometer_Module.AccelerometerSubscription;
import com.university.rahim.uitms.Microphone_Module.AudioClassifier;

/**
 * Created by rahim on 3/23/2018.
 */

public class TapSubscription {
    private static final String TAG = "dbg_TapSubscription";
    private Context context;
    private AccelerometerSubscription accSub = null;
    private Result resutListener = null;
    private AudioClassifier micClassifier;


    private TapSubscription(Context c, Result r, final AudioClassifier.AudioReady tempResultListener) {
        context = c;
        resutListener = r;

        micClassifier = new AudioClassifier();
        micClassifier.start();

        accSub = AccelerometerSubscription.subscribe(context, new AccelerometerSubscription.TapListener() {
            @Override
            public void onTap(Constants.DIRECTION dir) {
                //micClassifier.triangulateDelayed();
                micClassifier.temp(tempResultListener);
            }
        });
    }

    public static TapSubscription subscribe(Context context, Result resultListener, AudioClassifier.AudioReady tempResLis){
        return new TapSubscription(context, resultListener, tempResLis);
    }

    public void unSubscribe(){
        this.accSub.unsubscribe();
    }

    public interface Result{
        void onResultReady(Constants.DIRECTION dir);
    }
}
