package com.university.rahim.uitms.Microphone_Module;

import android.util.Log;

import com.university.rahim.uitms.Constants;
import com.university.rahim.uitms.Microphone_Module.Classifier.Evaluate;
import com.university.rahim.uitms.Microphone_Module.Classifier.ModelMicRandomForestPlasticThin;
import com.university.rahim.uitms.Microphone_Module.Classifier.ModelMicRandomForestRahimsTable;
import com.university.rahim.uitms.Microphone_Module.Classifier.ModelMicRandomForestWoodThin;
import com.university.rahim.uitms.Microphone_Module.Classifier.RandomForest;
import com.university.rahim.uitms.Microphone_Module.SoundFeatures.Feature;
import com.university.rahim.uitms.Microphone_Module.SoundFeatures.SoundFeatureExtractor;
import com.university.rahim.uitms.TapSubscription;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import static com.university.rahim.uitms.Constants.listeningDelay;
import static com.university.rahim.uitms.Constants.leftRightThreshold;

/**
 * Created by rahim on 3/17/2018.
 */

public class AudioClassifierManager {
    private static final String TAG = "dbg_AudioClassifier";
    RandomForest rf = null;
    AudioProcessor audioProcessor = null;

    public AudioClassifierManager(){
        audioProcessor = new AudioProcessor();
    }

    public void pause(){
        audioProcessor.stopRecording();
        audioProcessor = null;
        rf = null;
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

        ArrayList<Feature> features = null;
        try {
            features = SoundFeatureExtractor.getTimeDomainFeatures(mem, true);
            ArrayList<Feature> toFile = new ArrayList<>();
            for (Feature f:features) {
                toFile.add(new Feature(f.name, f.val));
            }
            resultListener.onFeaturesReady(toFile);

            if (Constants.active_model.compareTo(Constants.ACTIVE_MODEL.ANALYTICAL) == 0) {
                this.tempAnalyticalClassifier(features, resultListener);
            } else if (Constants.active_model.compareTo(Constants.ACTIVE_MODEL.WOOD_THICK) == 0) {
                // If the model is not instantiated or instantiated with the
                // wrong random Forest Child class, re-instantiate it
                if (rf == null ||
                        !rf.getClass().getSimpleName().matches(ModelMicRandomForestRahimsTable.class.getSimpleName())) {
                    rf = new ModelMicRandomForestRahimsTable();
                }
                String res = Evaluate.evalMicClassifier(rf, features);
                announceResult(res,resultListener);
            } else if (Constants.active_model.compareTo(Constants.ACTIVE_MODEL.WOOD_THIN) == 0) {
                // If the model is not instantiated or instantiated with the
                // wrong random Forest Child class, re-instantiate it
                if (rf == null ||
                        !rf.getClass().getSimpleName().matches(ModelMicRandomForestWoodThin.class.getSimpleName())) {
                    rf = new ModelMicRandomForestRahimsTable();
                }
                String res = Evaluate.evalMicClassifier(rf, features);
                announceResult(res,resultListener);
            } else if (Constants.active_model.compareTo(Constants.ACTIVE_MODEL.PLASTIC_THIN) == 0) {
                // If the model is not instantiated or instantiated with the
                // wrong random Forest Child class, re-instantiate it
                if (rf == null ||
                        !rf.getClass().getSimpleName().matches(ModelMicRandomForestPlasticThin.class.getSimpleName())) {
                    rf = new ModelMicRandomForestRahimsTable();
                }
                String res = Evaluate.evalMicClassifier(rf, features);
                announceResult(res,resultListener);
            }
            resultListener.onAudioReady(mem);
        } catch (Exception e) {
            Log.d(TAG, "triangulate: EXCEPTION " + e.toString());
            this.pause();
            this.start();
        }
    }

    public void triangulateDelayed(final TapSubscription.ResultCallback resultlistener){
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                triangulate(resultlistener);
            }
        }, listeningDelay);
    }

    private void tempAnalyticalClassifier(ArrayList<Feature> features, TapSubscription.ResultCallback resultListener) {
        int topPoints = 0;
        int bottomPoints = 0;
        int leftPoints = 0;
        int rightPoints = 0;
        boolean vertical = false;
        boolean horizontal = false;

        // First Detection
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

        double ampDelta = getFeatureValAbs(features, SoundFeatureExtractor.FEATURES.AMP_DELTA);
        double dx2Delta = getFeatureValAbs(features, SoundFeatureExtractor.FEATURES.DX2_DELTA);

        // LEFT, RIGHT Decision
        if(ampDelta >= leftRightThreshold){
            rightPoints += 60;
        } else if (ampDelta < 7000){
            leftPoints += 60;
        }

        if (mampl + mampr <= 9000){
            leftPoints += 30;
        } else {
            rightPoints += 30;
        }

        if (aampl + aampr <= 30){
            leftPoints += 10;
        } else {
            rightPoints += 10;
        }

        double detectionDelta = getFeatureValAbs(features, SoundFeatureExtractor.FEATURES.DETECTION_DELTA);

        /*
        if (((detectionDelta >= 9 && ampDelta> 12000) || (mdx2r > 7000)) || (mdx2l > 6000)){
            vertical = true;
        } else {
            //horizontal = true;
        }
        */

        if (vertical) {
            if (topPoints >= bottomPoints) {
                //Log.d(TAG, "tempAnalyticalClassifier: TOP");
                resultListener.onResultReady(Constants.DIRECTION.TOP);
            } else {
                //Log.d(TAG, "tempAnalyticalClassifier: BOTTOM");
                resultListener.onResultReady(Constants.DIRECTION.BOTTOM);
            }
        } else if (horizontal) {
            if (leftPoints >= rightPoints) {
                //Log.d(TAG, "tempAnalyticalClassifier: LEFT");
                resultListener.onResultReady(Constants.DIRECTION.LEFT);
            } else {
                //Log.d(TAG, "tempAnalyticalClassifier: RIGHT");
                resultListener.onResultReady(Constants.DIRECTION.RIGHT);
            }
        } else {
            if (topPoints >= bottomPoints) {
                //Log.d(TAG, "tempAnalyticalClassifier: TOP");
                resultListener.onResultReady(Constants.DIRECTION.TOP);
            } else {
                //Log.d(TAG, "tempAnalyticalClassifier: BOTTOM");
                resultListener.onResultReady(Constants.DIRECTION.BOTTOM);
            }

            if (leftPoints >= rightPoints) {
                //Log.d(TAG, "tempAnalyticalClassifier: LEFT");
                resultListener.onResultReady(Constants.DIRECTION.LEFT);
            } else {
                //Log.d(TAG, "tempAnalyticalClassifier: RIGHT");
                resultListener.onResultReady(Constants.DIRECTION.RIGHT);
            }
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

    private void announceResult(String res, TapSubscription.ResultCallback resultListener){
        if (res.toLowerCase().contains("left".toLowerCase())){
            resultListener.onResultReady(Constants.DIRECTION.LEFT);
        }else if (res.toLowerCase().contains("right".toLowerCase())){
            resultListener.onResultReady(Constants.DIRECTION.RIGHT);
        }else if (res.toLowerCase().contains("top".toLowerCase())){
            resultListener.onResultReady(Constants.DIRECTION.TOP);
        }else if (res.toLowerCase().contains("bottom".toLowerCase())){
            resultListener.onResultReady(Constants.DIRECTION.BOTTOM);
        }
    }
}
