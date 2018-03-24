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
        MAX_AMP_LEFT, MAX_AMP_RIGHT, AVG_AMP_RIGHT, AVG_AMP_LEFT};

    public static void getTimeDomainFeatures(AudioMem mem, boolean applyTapFilter){
        ArrayList<Feature> features = DX2.getFeatures(mem, applyTapFilter);
        features.addAll(Amplitude.getFeatures(mem));


        for(Feature f: features){
            Log.d(TAG, "getTimeDomainFeatures: " + f.name.toString() + " -> " + f.val);
        }
    }
}
