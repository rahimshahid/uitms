package com.university.rahim.uitms;

import android.util.Log;

/**
 * Created by rahim on 3/23/2018.
 */

public class Constants {
    public enum DIRECTION {LEFT, RIGHT, TOP, BOTTOM}

    ; // Possible results

    // Accelerometer Params (Detection)

    static double minTapThreshold = 0.1; // Decrease if you want higher sensitivity
    static int delayBtwTaps = 250; // Delay in msec that should be given between detecting 2 consecutive taps

    // Microphone Params (Triangulation)

    public static int listeningDelay = 100;  // Listen for 'x' msec between tap detected and triangulating result
    public static int SamplingRateToBufferSizeRatio = 12;  // BufferSize = Sampling Rate / SamplingRateToBufferSizeRatio
    public static int leftRightThreshold = 8000; // 8000 optimum
    private static int noiseThreshold = 1000; // 850 optimum, increase if atmosphere has noise
    //public static int outlierThreshold = 850; // 650 optimum, increase if noise is high
    public static int surroundingSize = 100; // 100 optimum, increase if noise is high


    public static double getMinTapThreshold() {
        double x = Prefs.getFloat("A");
        if (x != -1) {
            return x;
        } else
            return minTapThreshold;
    }

    public static void setMinTapThreshold(double minTapThreshold) {
        Prefs.putFloat("A", (float) minTapThreshold);
    }

    public static int getdelayBtwTaps() {
        int x = Prefs.getInt("C");
        if (x != -1) {
            return x;
        } else
            return delayBtwTaps;
    }

    public static void setdelayBtwTaps(int delay) {
        Prefs.putInt("C", delay);
    }

    public static int getnoiseThreshold() {
        int x = Prefs.getInt("D");
        if (x != -1) {
            return x;
        } else
            return noiseThreshold;
    }

    public static void setnoiseThreshold(int t) {
        Prefs.putInt("D", t);
    }
}
