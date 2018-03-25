package com.university.rahim.uitms.Microphone_Module;

import com.university.rahim.uitms.Constants;
import com.university.rahim.uitms.Microphone_Module.SoundFeatures.Feature;
import com.university.rahim.uitms.Microphone_Module.SoundFeatures.SoundFeatureExtractor;
import com.university.rahim.uitms.TapSubscription;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import static com.university.rahim.uitms.Constants.listeningDelay;
import static com.university.rahim.uitms.Constants.rightSensitivity;

/**
 * Created by rahim on 3/17/2018.
 */

public class AudioClassifierManager {
    private static final String TAG = "dbg_AudioClassifier";
    AudioProcessor audioProcessor = null;

    public AudioClassifierManager(){
        audioProcessor = new AudioProcessor();
    }

    public void pause(){
        audioProcessor.stopRecording();
        audioProcessor = null;
    }

    public void start(){
        if (audioProcessor == null) {
            audioProcessor = new AudioProcessor();
        }
        audioProcessor.startRecording();
    }

    private void triangulate(TapSubscription.ResultCallback resultListener){
        if (audioProcessor == null){
            return;
        }
        AudioMem mem = audioProcessor.retrieveTapInfo();

        ArrayList<Feature> features = SoundFeatureExtractor.getTimeDomainFeatures(mem, true);
        this.tempClassifier(features, resultListener);

        resultListener.onAudioReady(mem);
    }

    public void triangulateDelayed(final TapSubscription.ResultCallback resultlistener){
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                triangulate(resultlistener);
            }
        }, listeningDelay);
    }

    private void tempClassifier(ArrayList<Feature> features, TapSubscription.ResultCallback resultListener) {
        int topPoints = 0;
        int bottomPoints = 0;
        int leftPoints = 0;
        int rightPoints = 0;

        // First Left Detection
        double fld = getFeatureValAbs(features, SoundFeatureExtractor.FEATURES.FIRST_LEFT_DETECTION);    
        double frd = getFeatureValAbs(features, SoundFeatureExtractor.FEATURES.FIRST_RIGHT_DETECTION); 
        if (fld <= frd) {
            topPoints += 60;
        } else {
            bottomPoints += 60;
        }
        
        // MAX DX2
        double mdx2l = getFeatureValAbs(features, SoundFeatureExtractor.FEATURES.MAX_DX2_LEFT);
        double mdx2r = getFeatureValAbs(features, SoundFeatureExtractor.FEATURES.MAX_DX2_RIGHT);
        if (mdx2l >= mdx2r) {
            topPoints += 20;
        } else {
            bottomPoints += 20;
        }

        // AVG DX2
        double adx2l = getFeatureValAbs(features, SoundFeatureExtractor.FEATURES.AVG_DX2_LEFT);
        double adx2r = getFeatureValAbs(features, SoundFeatureExtractor.FEATURES.AVG_DX2_RIGHT);
        if (adx2l >= adx2r) {
            topPoints += 10;
        } else {
            bottomPoints += 10;
        }

        // MAX AMP
        double mampl = getFeatureValAbs(features, SoundFeatureExtractor.FEATURES.MAX_AMP_LEFT);
        double mampr = getFeatureValAbs(features, SoundFeatureExtractor.FEATURES.MAX_AMP_RIGHT);
        if (1.5 * mampl >= mampr) {
            topPoints += 20;
        } else {
            bottomPoints += 20;
        }

        // AVG AMP
        double aampl = getFeatureValAbs(features, SoundFeatureExtractor.FEATURES.AVG_AMP_LEFT);
        double aampr = getFeatureValAbs(features, SoundFeatureExtractor.FEATURES.AVG_AMP_RIGHT);
        if (1.5 * aampl >= aampr) {
            topPoints += 10;
        } else {
            bottomPoints += 10;
        }

        // LEFT, RIGHT Decision
        if (mampl + mampr <= rightSensitivity){
            leftPoints += 60;
        } else {
            rightPoints += 60;
        }

        if (aampl + aampr <= 30){
            leftPoints += 40;
        } else {
            rightPoints += 40;
        }

        if (topPoints >= bottomPoints) {
            //Log.d(TAG, "tempClassifier: TOP");
            resultListener.onResultReady(Constants.DIRECTION.TOP);
        } else {
            //Log.d(TAG, "tempClassifier: BOTTOM");
            resultListener.onResultReady(Constants.DIRECTION.BOTTOM);
        }

        if (leftPoints >= rightPoints) {
            //Log.d(TAG, "tempClassifier: LEFT");
            resultListener.onResultReady(Constants.DIRECTION.LEFT);
        } else {
            //Log.d(TAG, "tempClassifier: RIGHT");
            resultListener.onResultReady(Constants.DIRECTION.RIGHT);
        }
    }

    private double getFeatureValAbs(ArrayList<Feature> features, SoundFeatureExtractor.FEATURES name){
        for (Feature f: features) {
            if (f.name.toString().matches(name.toString())){
                return Math.abs(f.val);
            }
        }
        return -1;
    }
}
