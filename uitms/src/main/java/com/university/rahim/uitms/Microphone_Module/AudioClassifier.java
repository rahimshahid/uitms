package com.university.rahim.uitms.Microphone_Module;

import android.util.Log;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import static com.university.rahim.uitms.Constants.LeftMicMagnification;
import static com.university.rahim.uitms.Constants.listeningDelay;

/**
 * Created by rahim on 3/17/2018.
 */

public class AudioClassifier {
    private static final String TAG = "dbg_AudioClassifier";
    AudioProcessor audioProcessor = null;

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

    private
    void triangulate(){
        AudioMem mem = audioProcessor.retrieveTapInfo();
        double right, left;
        left = LeftMicMagnification * AudioProcessor.getMaxLeft(mem);
        right = AudioProcessor.getMaxRight(mem);
        Log.d(TAG, "triangulate: Top: " + left + ", Bottom: " + right);

        ArrayList arr = new ArrayList<String>();

        if (Math.abs(left) + Math.abs(right) < 10000){
            Log.d(TAG, "run: LEFT !!");
        } else {
            Log.d(TAG, "run: RIGHT !!");
        }

        if (Math.abs(left) >= Math.abs(right)) {
            Log.d(TAG, "run: TOP !!");
        } else {
            Log.d(TAG, "run: BOTTOM !!");
        }
    }

    public void triangulateDelayed(){
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                triangulate();
            }
        }, listeningDelay);
    }
}
