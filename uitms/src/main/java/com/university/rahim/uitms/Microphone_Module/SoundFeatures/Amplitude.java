package com.university.rahim.uitms.Microphone_Module.SoundFeatures;

import com.university.rahim.uitms.Microphone_Module.AudioMem;

import java.util.ArrayList;

/**
 * Created by rahim on 3/24/2018.
 */

public class Amplitude {
    private AudioMem mem;
    private double max_left_amp, max_right_amp;
    private double avg_left_amp, avg_right_amp;

    public static ArrayList<Feature> getFeatures(AudioMem mem){
        ArrayList<Feature> features = new ArrayList<>();

        Amplitude machine  = new Amplitude(mem);
        machine.process(machine.mem);
        features.add(new Feature(SoundFeatureExtractor.FEATURES.MAX_AMP_LEFT, machine.max_left_amp));
        features.add(new Feature(SoundFeatureExtractor.FEATURES.MAX_AMP_RIGHT, machine.max_right_amp));
        features.add(new Feature(SoundFeatureExtractor.FEATURES.AVG_AMP_LEFT, machine.avg_left_amp));
        features.add(new Feature(SoundFeatureExtractor.FEATURES.AVG_AMP_RIGHT, machine.avg_right_amp));

        return features;
    }

    private Amplitude(AudioMem mem){
        this.mem = mem;
    }

    private void process(AudioMem param){
        int maxValueL = param.q.get(0).left;
        int maxValueR = param.q.get(0).right;

        int sumL = 0;
        int sumR = 0;

        for(int i=1;i < param.q.size();i++){
            if(Math.abs(param.q.get(i).left) > Math.abs(maxValueL)){
                maxValueL = param.q.get(i).left;
            }
            if(Math.abs(param.q.get(i).right) > Math.abs(maxValueR)){
                maxValueR = param.q.get(i).right;
            }
            sumL += param.q.get(i).left;
            sumR += param.q.get(i).right;
        }
        max_left_amp = maxValueL;
        max_right_amp = maxValueR;

        avg_left_amp = sumL / param.q.size();
        avg_right_amp = sumR / param.q.size();

        return;
    }
}
