package com.university.rahim.uitms.Microphone_Module.SoundFeatures;

import android.util.Log;

import com.university.rahim.uitms.Microphone_Module.AudioMem;

import java.util.ArrayList;

/**
 * Created by rahim on 3/24/2018.
 */

public class SoundFeatureExtractor {
    private static final String TAG = "dbg_SoundFeatExtr: ";

    public enum FEATURES{AVG_DX2_RIGHT, AVG_DX2_LEFT, MAX_DX2_RIGHT, MAX_DX2_LEFT, FIRST_LEFT_DETECTION, FIRST_RIGHT_DETECTION,
        MAX_AMP_LEFT, MAX_AMP_RIGHT, AVG_AMP_RIGHT, AVG_AMP_LEFT, DX2_DELTA, AMP_DELTA};

    public static ArrayList<Feature> getTimeDomainFeatures(AudioMem mem, boolean applyTapFilter) throws Exception {
        ArrayList<Feature> features = DX2.getFeatures(mem, applyTapFilter);
        features.addAll(Amplitude.getFeatures(mem));

        double maxDx2L = getAbsFeature(features, FEATURES.MAX_DX2_LEFT);
        double maxDx2R = getAbsFeature(features, FEATURES.MAX_DX2_RIGHT);
        double maxAmpL = getAbsFeature(features, FEATURES.MAX_AMP_LEFT);
        double maxAmpR = getAbsFeature(features, FEATURES.MAX_AMP_RIGHT);

        features.add(new Feature(FEATURES.DX2_DELTA, Math.abs(maxDx2L - maxDx2R)));
        features.add(new Feature(FEATURES.AMP_DELTA, Math.abs(maxAmpL - maxAmpR)));

        for(Feature f: features){
            //if (f.name.toString().contains("AMP"))
                Log.d(TAG, "getTimeDomainFeatures: " + f.name.toString() + " -> " + f.val);
        }

        return features;
    }

    public static double getAbsFeature(ArrayList<Feature> features, FEATURES name){
        for(Feature f: features){
            if (f.name.toString().contentEquals(name.toString())) {
                return Math.abs(f.val);
            }
        }
        return 0.0;
    }
}
