package com.university.rahim.uitms.Microphone_Module;

import android.util.Log;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by rahim on 3/17/2018.
 */

public class AudioClassifier {
    private static final String TAG = "dbg_AudioClassifier";
    AudioProcessor audioProcessor = null;
    public static int listeningDelay = 100;  // Listen for x seconds between tap detected and announcing result
    public static double LeftMicMagnification = 2;

    public AudioClassifier(){
        audioProcessor = new AudioProcessor();
    }

    public void pause(){
        audioProcessor.stopRecording();
    }

    public void start(){
        if (audioProcessor == null) {
            audioProcessor = new AudioProcessor();
        }
        audioProcessor.startRecording();
    }

    public ArrayList<String> onTapDetected(){
        AudioMem mem = audioProcessor.retrieveTapInfo();
        double right, left;
        left = LeftMicMagnification * AudioProcessor.getMaxLeft(mem);
        right = AudioProcessor.getMaxRight(mem);
        Log.d(TAG, "onTapDetected: Top: " + left + ", Bottom: " + right);

        ArrayList arr = new ArrayList<String>();

        if (Math.abs(left) + Math.abs(right) < 10000){
            Log.d(TAG, "run: LEFT !!");
            arr.add("left");
        } else {
            Log.d(TAG, "run: RIGHT !!");
            arr.add("right");

        }

        if (Math.abs(left) >= Math.abs(right)) {
            Log.d(TAG, "run: TOP !!");
            arr.add("top");

        } else {
            Log.d(TAG, "run: BOTTOM !!");
            arr.add("bottom");
        }
        return arr;
    }

    private void findDirectionDelayed(){
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {

            }
        }, listeningDelay);
    }
}
