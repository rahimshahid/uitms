package com.university.rahim.datacollection.Ui;

import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.media.AudioFormat;
import android.media.AudioRecord;
import android.media.MediaRecorder;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;
import com.university.rahim.datacollection.R;


public class MicActivity extends AppCompatActivity {
    private static final String TAG = "dbg_MicActivity";
    private int audioSource = MediaRecorder.AudioSource.MIC;
    private static int sampleRateInHz = 48000;
    private static int channelConfig = AudioFormat.CHANNEL_IN_STEREO;
    private static int audioFormat = AudioFormat.ENCODING_PCM_16BIT;
    private int bufferSize = 0;
    int readSize = 0;
    GraphView graph_left, graph_right;
    LineGraphSeries<DataPoint> series_left = new LineGraphSeries<DataPoint>(new DataPoint[] {});
    LineGraphSeries<DataPoint> series_right = new LineGraphSeries<DataPoint>(new DataPoint[] {});
    double time_left = 0d;
    double time_right = 0d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mic);
        initView();

        int bufferRead = 0;
        bufferSize = AudioRecord.getMinBufferSize(sampleRateInHz,
                channelConfig, audioFormat);
        AudioRecord audioRecord = new AudioRecord(audioSource,
                sampleRateInHz, channelConfig, audioFormat,
                bufferSize);
        audioRecord.startRecording();
        new Handler().postDelayed(() -> next(audioRecord),100);

        Log.d(TAG, "onCreate: " + audioRecord);
    }

    void next(AudioRecord audioRecord) {
        audioRecord.stop();
        short[] audiodata = new short[bufferSize];
        readSize = audioRecord.read(audiodata,0,bufferSize);

        short[] leftChannelAudioData = new short[readSize/2];
        short[] rightChannelAudioData = new short[readSize/2];
        for(int i = 0; i < readSize/2; i = i + 2)
        {
            leftChannelAudioData[i] = audiodata[2*i];
            leftChannelAudioData[i+1] = audiodata[2*i+1];
            rightChannelAudioData[i] =  audiodata[2*i+2];
            rightChannelAudioData[i+1] = audiodata[2*i+3];
        }
        for (int i=0; i<leftChannelAudioData.length; i++){
            updateGraphLeft(leftChannelAudioData[i]);
        }
        for (int i=0; i<rightChannelAudioData.length; i++){
            updateGraphRight(rightChannelAudioData[i]);
        }
    }

    void initView() {
        graph_left = (GraphView) findViewById(R.id.graph_left);
        graph_right = (GraphView) findViewById(R.id.graph_right);

        Paint paint = new Paint();
        paint.setColor(getResources().getColor(R.color.colorRed));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(5);
        paint.setPathEffect(new DashPathEffect(new float[]{8, 5}, 0));
        series_left.setCustomPaint(paint);
        series_left.setTitle("LEFT");

        paint = new Paint();
        paint.setColor(getResources().getColor(R.color.colorGreen));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(5);
        paint.setPathEffect(new DashPathEffect(new float[]{8, 5}, 0));
        series_right.setCustomPaint(paint);
        series_right.setTitle("RIGHT");

        graph_left.addSeries(series_left);
        graph_right.addSeries(series_right);
        //graph_left.getViewport().setXAxisBoundsManual(true);
        //graph_left.getViewport().setXAxisBoundsManual(true);
    }

    private void updateGraphLeft(short left) {
        //graph_left.getViewport().setMinX(time_left - 10);
        //graph_left.getViewport().setMaxX(time_left + 50);

        series_left.appendData(new DataPoint(time_left, left), true, bufferSize);
        graph_left.onDataChanged(true, true);
        time_left++;
    }

    private void updateGraphRight(short right) {
        //graph_right.getViewport().setMinX(time_right - 10);
        //graph_right.getViewport().setMaxX(time_right + 50);

        series_right.appendData(new DataPoint(time_right, right), true, bufferSize);
        graph_right.onDataChanged(true, true);
        time_right++;
    }
}
