package com.university.rahim.uitms;

import android.content.Context;

import com.university.rahim.uitms.Accelerometer_Module.AccelerometerSubscription;
import com.university.rahim.uitms.Microphone_Module.AudioClassifierManager;
import com.university.rahim.uitms.Microphone_Module.AudioMem;

/**
 * Created by rahim on 3/23/2018.
 */

public class TapSubscription {
    private static final String TAG = "dbg_TapSubscription";
    private Context context;
    private AccelerometerSubscription accSub = null;
    private ResultCallback finalResultListener = null;
    private AudioClassifierManager micClassifierMngr;


    private TapSubscription(Context c, final ResultCallback finalResultListener) {
        context = c;
        this.finalResultListener = finalResultListener;

        micClassifierMngr = new AudioClassifierManager();
        micClassifierMngr.start();

        accSub = AccelerometerSubscription.subscribe(context, new AccelerometerSubscription.TapListener() {
            @Override
            public void onTap(Constants.DIRECTION dir) {
                finalResultListener.onTapDetected();
                micClassifierMngr.triangulateDelayed(finalResultListener);
            }
        });
    }

    public static TapSubscription subscribe(Context context, ResultCallback resultListener){
        return new TapSubscription(context, resultListener);
    }

    public void unSubscribe(){
        this.accSub.unsubscribe();
        micClassifierMngr.pause();
        accSub = null;
    }

    public interface ResultCallback {
        void onTapDetected();
        void onAudioReady(AudioMem mem);
        void onResultReady(Constants.DIRECTION dir);
    }
}
