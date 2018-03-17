package com.university.rahim.datacollection.Utils;

import android.media.AudioFormat;
import android.media.AudioRecord;
import android.media.MediaRecorder;
import android.util.Log;

import java.util.Arrays;
import java.util.Collections;
import java.util.IntSummaryStatistics;
import java.util.List;

/**
 * Created by RAHIM on 2/11/2018.
 */

public class AudioRecorder {
    private static final String LOG_TAG = "dbg_AudioRecorder";
    private int audioSource = MediaRecorder.AudioSource.MIC;
    private static int sampleRateInHz = 8000;
    private static int channelConfig = AudioFormat.CHANNEL_IN_STEREO;
    private static int audioFormat = AudioFormat.ENCODING_PCM_16BIT;
    private int bufferSize = 0;
    private boolean mShouldContinue = false; // Indicates if recording / playback should stop

    public void recordAudio(AudiRecorderListener listener) {
        mShouldContinue = true;
        new Thread(new Runnable() {
            @Override
            public void run() {
                android.os.Process.setThreadPriority(android.os.Process.THREAD_PRIORITY_AUDIO);

                // buffer size in bytes
                bufferSize = AudioRecord.getMinBufferSize(sampleRateInHz, channelConfig, audioFormat);

                if (bufferSize == AudioRecord.ERROR || bufferSize == AudioRecord.ERROR_BAD_VALUE) {
                    bufferSize = sampleRateInHz * 2;
                }

                short[] audioBuffer = new short[bufferSize / 2];

                AudioRecord record = new AudioRecord(audioSource, sampleRateInHz, channelConfig,
                        audioFormat, bufferSize);

                if (record.getState() != AudioRecord.STATE_INITIALIZED) {
                    Log.e(LOG_TAG, "Audio Record can't initialize!");
                    return;
                }
                record.startRecording();

                Log.v(LOG_TAG, "Start recording");

                long shortsRead = 0;
                while (mShouldContinue) {
                    int numberOfShort = record.read(audioBuffer, 0, audioBuffer.length);
                    shortsRead += numberOfShort;
                    // Do something with the audioBuffer
                    listener.getSamples(audioBuffer, channelConfig);
                }

                record.stop();
                record.release();

                Log.v(LOG_TAG, String.format("Recording stopped. Samples read: %d", shortsRead));
            }
        }).start();
    }
    public void stopRecording(){
     mShouldContinue = false;
    }

    // Method for getting the maximum value
    public static short getMax(short[] inputArray){
        short maxValue = inputArray[0];
        for(int i=1;i < inputArray.length;i++){
            if(Math.abs(inputArray[i]) > Math.abs(maxValue)){
                maxValue = inputArray[i];
            }
        }
        return maxValue;
    }

    public interface AudiRecorderListener {
        void getSamples(short[] arr, int channelConfig);
    }

    public int getSamplingRate() {
        return sampleRateInHz;
    }
}
