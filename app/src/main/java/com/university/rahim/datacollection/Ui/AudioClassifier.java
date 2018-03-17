package com.university.rahim.datacollection.Ui;

import android.util.Log;

import com.university.rahim.datacollection.Utils.AudioMem;
import com.university.rahim.datacollection.Utils.AudioProcessor;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by rahim on 3/17/2018.
 */

public class AudioClassifier {
    private static final String TAG = "dbg_AudioClassifier";
    AudioProcessor audioProcessor = null;
    int listeningDelay = 100;  // Listen for x seconds between tap detected and announcing result
    public static int LeftMicMagnification = 2;

    public AudioClassifier(){
        audioProcessor = new AudioProcessor();
        audioProcessor.startRecording();
    }

    public void pause(){
        audioProcessor.stopRecording();
    }

    public void resume(){
        if (audioProcessor == null) {
            audioProcessor = new AudioProcessor();
        }
        audioProcessor.startRecording();
    }

    public void onTapDetected(){
       findDirectionDelayed();
    }

    private void findDirectionDelayed(){
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                AudioMem mem = audioProcessor.retrieveTapInfo();
                double right, left;
                left = LeftMicMagnification * AudioProcessor.getMaxLeft(mem);
                right = AudioProcessor.getMaxRight(mem);
                Log.d(TAG, "onTapDetected: Top: " + left + ", Bottom: " + right);
                if (Math.abs(left) >= Math.abs(right)) {
                    Log.d(TAG, "run: TOP !!");
                } else {
                    Log.d(TAG, "run: BOTTOM !!");
                }
            }
        }, listeningDelay);
    }
}
