package com.university.rahim.uitms;

/**
 * Created by rahim on 3/23/2018.
 */

public class Constants {
    public enum DIRECTION{LEFT, RIGHT, TOP, BOTTOM}; // Possible results
    public static int listeningDelay = 100;  // Listen for x msec between tap detected and announcing result
    public static double LeftMicMagnification = 2; // Left Mic is weak on most phones. This will be a magnification factor
    public static int SamplingRateToBufferSizeRatio = 12;  // BufferSize = Sampling Rate / x
}
