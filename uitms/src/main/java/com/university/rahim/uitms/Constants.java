package com.university.rahim.uitms;

/**
 * Created by rahim on 3/23/2018.
 */

public class Constants {
    public enum DIRECTION{LEFT, RIGHT, TOP, BOTTOM}; // Possible results
    public static int listeningDelay = 100;  // Listen for 'x' msec between tap detected and triangulating result
    public static int SamplingRateToBufferSizeRatio = 12;  // BufferSize = Sampling Rate / SamplingRateToBufferSizeRatio

    public static int rightSensitivity = 13000; // 15000 optimum, increasing this will result in higher prob for RIGHT

    public static int noiseThreshold = 850; // 450 optimum, increase if atmosphere has noise
    public static int outlierThreshold = 650; // 550 optimum, increase if noise is high
    public static int surroundingSize = 100; // 100 optimum, increase if noise is high
}
