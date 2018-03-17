package com.university.rahim.datacollection.Ui;

import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.media.AudioFormat;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;
import com.university.rahim.datacollection.R;
import com.university.rahim.datacollection.Utils.AudioProcessor;
import com.university.rahim.datacollection.Utils.AudioRecorder;


public class MicActivity extends AppCompatActivity {
    private static final String TAG = "dbg_MicActivity";
    AudioRecorder rec;

    GraphView graph;
    LineGraphSeries<DataPoint> series_left = new LineGraphSeries<DataPoint>(new DataPoint[] {});
    LineGraphSeries<DataPoint> series_right = new LineGraphSeries<DataPoint>(new DataPoint[] {});
    double time = 0d;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mic);
        initView();
        rec = new AudioRecorder();
    }

    @Override
    protected void onResume() {
        super.onResume();
        startRecording();
    }

    private void startRecording(){
        rec.recordAudio(new AudioRecorder.AudiRecorderListener() {
            @Override
            public void getSamples(short[] arr, int channelConfig) {
                MicActivity.this.runOnUiThread(new Runnable() {
                    public void run() {
                        if (channelConfig == AudioFormat.CHANNEL_IN_STEREO)
                            MicActivity.this.updateGraphStereo(arr);
                        else
                            MicActivity.this.updateGraphMono(arr);
                    }
                });
            }
        });
    }

    @Override
    protected void onPause() {
        super.onPause();
        rec.stopRecording();
    }

    void initView() {
        graph = (GraphView) findViewById(R.id.graph);

        ((Button)findViewById(R.id.recordingButton)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button self = ((Button)findViewById(R.id.recordingButton));
                if (self.getText().charAt(0) == 'P') {
                    MicActivity.this.rec.stopRecording();
                    self.setText("Resume");
                } else {
                    MicActivity.this.startRecording();
                    self.setText("Pause");
                }
            }
        });

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

        graph.addSeries(series_left);
        graph.addSeries(series_right);

        graph.getViewport().setMinY(-1000);
        graph.getViewport().setMaxY(1000);

    }

    private void updateGraphStereo(short[] arr) {
        short[] leftChannelAudioData = new short[arr.length/2];
        short[] rightChannelAudioData = new short[arr.length/2];
        for(int i = 0; i < arr.length/2; i = i + 2)
        {
            leftChannelAudioData[i] = arr[2*i];
            rightChannelAudioData[i] = arr[2*i+1];
            //series_left.appendData(new DataPoint(time, leftChannelAudioData[i]), true, 500);
            //series_right.appendData(new DataPoint(time, rightChannelAudioData[i]), true, 500);
            //time++;
        }

        // since Top mic is weak, multiply it by 2
        series_left.appendData(new DataPoint(time, 2
                * (AudioRecorder.getMax(leftChannelAudioData))), true, 50);
        series_right.appendData(new DataPoint(time, AudioRecorder.getMax(rightChannelAudioData)), true, 50);
        time += 1d;
        graph.onDataChanged(true, true);
        count = 0;
    }

    private void updateGraphMono(short[] arr) {
        series_left.appendData(new DataPoint(time, AudioRecorder.getMax(arr)), true, 50);
        time += 1d;
        graph.onDataChanged(true, true);
        count = 0;
    }
}
