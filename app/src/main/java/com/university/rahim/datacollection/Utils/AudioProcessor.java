package com.university.rahim.datacollection.Utils;

import android.media.AudioFormat;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by RAHIM on 2/12/2018.
 */

public class AudioProcessor implements AudioRecorder.AudiRecorderListener {
    private static final String TAG = "dbg_AudioProcessor";

    private List leftChannelMem;
    private List rightChannelMem;
    private AudioRecorder recorder = null;

    public AudioProcessor() {
        recorder = new AudioRecorder();
        //TODO: decide mem length
        int memSize = recorder.getSamplingRate() / 4;
        leftChannelMem =  new LimitedSizeQueue<Integer>(memSize);
        rightChannelMem = new LimitedSizeQueue<Integer>(memSize);
    }
    public void startRecording() {
        if (recorder == null) {
            recorder = new AudioRecorder();
        }
        recorder.recordAudio(this);
    }
    public void stopRecording() {
        if (recorder != null) {
            recorder.stopRecording();
        }
    }

    public void retrieveTapInfo(){
        int leftMax = AudioProcessor.getMax(leftChannelMem);
        int rightMax = AudioProcessor.getMax(rightChannelMem);
        Log.d(TAG, "retrieveTapInfo: Left: " + leftMax + " Right: " + rightMax);
    }

    @Override
    public void getSamples(short[] arr, int channelConfig) {
        try {
            if (channelConfig != AudioFormat.CHANNEL_IN_STEREO) {
                throw new Exception("AudioProcessor->getSamples->Channel configuration not STEREO");
            }
            // The thread that calls this function should be kept free for recording work
            processAudio(arr);

        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
    }

    private void processAudio(short[] arr) {
        short[] leftChannelAudioData = new short[arr.length / 2];
        short[] rightChannelAudioData = new short[arr.length / 2];
        for (int i = 0; i < arr.length / 2; i = i + 2) {
            leftChannelAudioData[i] = arr[2 * i];
            leftChannelMem.add((int) arr[2 * i]);
            rightChannelAudioData[i] = arr[2 * i + 1];
            rightChannelMem.add((int) arr[2 * i + 1]);
        }
    }

    public static int getMax(List<Integer> inputArray){
        int maxValue = inputArray.get(0);
        for(int i=1;i < inputArray.size();i++){
            if(inputArray.get(i) > maxValue){
                maxValue = inputArray.get(i);
            }
        }
        return maxValue;
    }
}
