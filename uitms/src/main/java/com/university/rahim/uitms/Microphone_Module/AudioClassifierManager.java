package com.university.rahim.uitms.Microphone_Module;

import com.university.rahim.uitms.Microphone_Module.SoundFeatures.SoundFeatureExtractor;

import java.util.Timer;
import java.util.TimerTask;

import static com.university.rahim.uitms.Constants.listeningDelay;

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
    }

    public void start(){
        if (audioProcessor == null) {
            audioProcessor = new AudioProcessor();
        }
        audioProcessor.startRecording();
    }

    private void triangulate(AudioReady tempResultListener){
        AudioMem mem = audioProcessor.retrieveTapInfo();

        SoundFeatureExtractor.getTimeDomainFeatures(mem, true);

        tempResultListener.AudioAfterTap(mem);
    }

    public void triangulateDelayed(final AudioReady resultListener){
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                triangulate(resultListener);
            }
        }, listeningDelay);
    }

    public interface AudioReady{
        public void AudioAfterTap(AudioMem mem);
    }
}
