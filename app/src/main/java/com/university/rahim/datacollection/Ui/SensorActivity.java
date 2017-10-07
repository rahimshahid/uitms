package com.university.rahim.datacollection.Ui;

import android.content.Intent;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;
import com.university.rahim.datacollection.R;
import com.university.rahim.datacollection.Utils.CSVHandler;
import com.university.rahim.datacollection.Utils.SensorValue;
import com.university.rahim.datacollection.Utils.TapDetector;

import java.util.ArrayList;

public class SensorActivity extends AppCompatActivity implements SensorEventListener , TapDetector.Callback, View.OnClickListener{
    public static final String TAG = "dbg_Sensor Activity";

    private SensorManager sensorManager;
    double ax,ay,az;
    TextView tv_x, tv_y, tv_z;
    static final String X = "X -> ", Y = "Y -> ", Z = "Z -> ";
    GraphView graph;
    TapDetector tapDetector;
    CSVHandler csvHandler;
    int direction;           //1: Above, 2:Below, 3:Left, 4:Right

    LineGraphSeries<DataPoint> series_x = new LineGraphSeries<DataPoint>(new DataPoint[] {});
    LineGraphSeries<DataPoint> series_y = new LineGraphSeries<DataPoint>(new DataPoint[] {});
    LineGraphSeries<DataPoint> series_z = new LineGraphSeries<DataPoint>(new DataPoint[] {});
    double time = 0d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sensor);

        direction = 1;
        csvHandler = new CSVHandler("WaveData");

        String sensorType = getIntent().getExtras().getString("sensor");
        Log.d(TAG, "onCreate: " + sensorType);

        sensorManager=(SensorManager) getSystemService(SENSOR_SERVICE);

        if (sensorType.equals("acc")) {
            sensorManager.registerListener(this, sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER),
                    SensorManager.SENSOR_DELAY_GAME);
        } else if(sensorType.equals("gyro")) {
            sensorManager.registerListener(this, sensorManager.getDefaultSensor(Sensor.TYPE_GYROSCOPE),
                    SensorManager.SENSOR_DELAY_GAME);
        } else return;

        // Created a TapDetector
        tapDetector = new TapDetector(this, 40, 0.1, 0.9, 1, 250);
        this.initView();
    }

    @Override
    protected void onPause() {
        super.onPause();
        sensorManager.unregisterListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.bt_above:
                direction = 1;
                Toast.makeText(this, "Recording Above.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.bt_below:
                direction = 2;
                Toast.makeText(this, "Recording below.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.bt_left:
                direction = 3;
                Toast.makeText(this, "Recording left.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.bt_right:
                direction = 4;
                Toast.makeText(this, "Recording right.", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    private void initView(){
        tv_x = (TextView) this.findViewById(R.id.tv_x);
        tv_y = (TextView) this.findViewById(R.id.tv_y);
        tv_z = (TextView) this.findViewById(R.id.tv_z);
        graph = (GraphView) findViewById(R.id.graph_acc);

        Paint paint = new Paint();
        paint.setColor(getResources().getColor(R.color.colorRed));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(5);
        paint.setPathEffect(new DashPathEffect(new float[]{8, 5}, 0));
        series_x.setCustomPaint(paint);
        series_x.setTitle("X");

        paint = new Paint();
        paint.setColor(getResources().getColor(R.color.colorGreen));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(5);
        paint.setPathEffect(new DashPathEffect(new float[]{8, 5}, 0));
        series_y.setCustomPaint(paint);
        series_y.setTitle("Y");

        series_z.setTitle("Z");

        graph.addSeries(series_x);
        graph.addSeries(series_y);
        graph.addSeries(series_z);
        graph.getViewport().setXAxisBoundsManual(true);
    }

    private void resetTapStateButton() {
        SensorActivity.this.findViewById(R.id.bt_stable).setVisibility(View.VISIBLE);
        SensorActivity.this.findViewById(R.id.bt_moving).setVisibility(View.GONE);
        SensorActivity.this.findViewById(R.id.bt_tap).setVisibility(View.GONE);
    }

    private void updateTextViews(double ax, double ay, double az) {
        tv_x.setText(X + ax);
        tv_y.setText(Y + ay);
        tv_z.setText(Z + az);
    }

    private void updateGraph(double ax, double ay, double az) {
        graph.getViewport().setMinX(time - 10);
        graph.getViewport().setMaxX(time + 50);

        series_x.appendData(new DataPoint(time, ax), true, 60);
        series_y.appendData(new DataPoint(time, ay), true, 60);
        series_z.appendData(new DataPoint(time, az), true, 60);
        graph.onDataChanged(true, true);
        time++;
    }

        @Override
    public void onSensorChanged(SensorEvent event) {
        if (event.sensor.getType() == Sensor.TYPE_ACCELEROMETER
                || event.sensor.getType() == Sensor.TYPE_GYROSCOPE) {
            ax=event.values[0];
            ay=event.values[1];
            az=event.values[2];
            // Giving information to the Tap Detector
            tapDetector.add(ax, ay, az);
            this.updateTextViews(event.values[0], event.values[1], event.values[2]);
            this.updateGraph(event.values[0], event.values[1], event.values[2]);
        }
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {
        // Do nothing
    }

    // Since this activity is using a TapDetector, it should implement these below functions

    @Override
    public void tapDetected() {
        this.findViewById(R.id.bt_stable).setVisibility(View.GONE);
        this.findViewById(R.id.bt_moving).setVisibility(View.GONE);
        this.findViewById(R.id.bt_tap).setVisibility(View.VISIBLE);

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                resetTapStateButton();
            }
        }, 250);
    }

    @Override
    public void fetchWaveRequest() {
        Log.d(TAG, "fetchWaveRequest: ");
        ArrayList arr = tapDetector.getWave();
        // At this point we have the wave in a ArrayList
        csvHandler.writeWaveTofile(arr, direction);

        // TODO: remove this print; its only for debugging
        for (int i=0; i< arr.size(); i++) {
            Log.d(TAG, ((SensorValue)arr.get(i)).getZ() + ", \n");
        }
    }
}
