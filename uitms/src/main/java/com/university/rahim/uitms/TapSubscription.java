package com.university.rahim.uitms;

import android.content.Context;

import com.university.rahim.uitms.Accelerometer_Module.AccelerometerSubscription;
import com.university.rahim.uitms.Microphone_Module.AudioClassifierManager;

/**
 * Created by rahim on 3/23/2018.
 */

public class TapSubscription {
    private static final String TAG = "dbg_TapSubscription";
    private Context context;
    private AccelerometerSubscription accSub = null;
    private Result finalResultListener = null;
    private AudioClassifierManager micClassifierMngr;


    private TapSubscription(Context c, final Result finalResultListener, final AudioClassifierManager.AudioReady tempResultListener) {
        context = c;
        this.finalResultListener = finalResultListener;

        micClassifierMngr = new AudioClassifierManager();
        micClassifierMngr.start();

        accSub = AccelerometerSubscription.subscribe(context, new AccelerometerSubscription.TapListener() {
            @Override
            public void onTap(Constants.DIRECTION dir) {
                micClassifierMngr.triangulateDelayed(tempResultListener);
                // TODO: Make this work eventually
                //micClassifierMngr.triangulateDelayed(finalResultListener);
            }
        });
    }

    public static TapSubscription subscribe(Context context, Result resultListener, AudioClassifierManager.AudioReady tempResLis){
        return new TapSubscription(context, resultListener, tempResLis);
    }

    public void unSubscribe(){
        this.accSub.unsubscribe();
    }

    public interface Result{
        void onResultReady(Constants.DIRECTION dir);
    }
}
