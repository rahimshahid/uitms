package com.university.rahim.uitms.Microphone_Module.SoundFeatures;

/**
 * Created by rahim on 3/24/2018.
 */

public class Feature {
    public SoundFeatureExtractor.FEATURES name;
    public double val;

    public Feature(SoundFeatureExtractor.FEATURES name, double val){
        this.name = name;
        this.val = val;
    }
}
