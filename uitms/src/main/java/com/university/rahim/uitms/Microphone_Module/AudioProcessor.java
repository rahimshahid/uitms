package com.university.rahim.uitms.Microphone_Module;

import android.media.AudioFormat;
import android.util.Log;

import com.university.rahim.uitms.Constants;

/**
 * Created by RAHIM on 2/12/2018.
 */

public class AudioProcessor implements AudioRecorder.AudiRecorderListener {
    private static final String TAG = "dbg_AudioProcessor";
    private AudioRecorder recorder = null;
    private AudioMem mem;

    public AudioProcessor() {
        recorder = new AudioRecorder();
        //TODO: decide mem length
        int memSize = recorder.getSamplingRate() / Constants.SamplingRateToBufferSizeRatio;
        Log.d(TAG, "AudioProcessor: " + memSize);
        mem = new AudioMem(memSize);
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
        recorder = null;
    }

    public AudioMem retrieveTapInfo(){
        return new AudioMem(mem);
    }

    @Override
    public void getSamples(short[] arr, int channelConfig) {
        try {
            if (channelConfig != AudioFormat.CHANNEL_IN_STEREO) {
                throw new Exception("AudioProcessor->getSamples->Channel configuration not STEREO");
            }
            // The thread that calls this function should be kept free for recording work
            storeAudio(arr);

        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
    }

    private void storeAudio(short[] arr) {
        for (int i = 0; i < arr.length / 2; i = i + 2) {
            mem.q.add(new AudioValue((int) arr[2 * i], (int) arr[2 * i + 1]));
        }
    }
}
