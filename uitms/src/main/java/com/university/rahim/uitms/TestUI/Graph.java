package com.university.rahim.uitms.TestUI;

import android.app.Activity;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.util.Log;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;
import com.university.rahim.uitms.Microphone_Module.AudioMem;
import com.university.rahim.uitms.Microphone_Module.AudioValue;
import com.university.rahim.uitms.R;

import java.util.ArrayList;

/**
 * Created by rahim on 3/23/2018.
 */

public class Graph {
    private static final String TAG = "dbg_GraphActExt: ";
    private Activity activity;

    private GraphView graph;
    private LineGraphSeries<DataPoint> series_left = new LineGraphSeries<DataPoint>(new DataPoint[] {});
    private LineGraphSeries<DataPoint> series_right = new LineGraphSeries<DataPoint>(new DataPoint[] {});
    double time = 0d;

    void createView(Activity activity) {
        this.activity = activity;

        graph = (com.jjoe64.graphview.GraphView) activity.findViewById(R.id.graph);

        Paint paint = new Paint();
        paint.setColor(activity.getResources().getColor(R.color.colorRed));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(5);
        paint.setPathEffect(new DashPathEffect(new float[]{8, 5}, 0));
        series_left.setCustomPaint(paint);
        series_left.setTitle("LEFT");

        paint = new Paint();
        paint.setColor(activity.getResources().getColor(R.color.colorGreen));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(5);
        paint.setPathEffect(new DashPathEffect(new float[]{8, 5}, 0));
        series_right.setCustomPaint(paint);
        series_right.setTitle("RIGHT");

        graph.addSeries(series_left);
        graph.addSeries(series_right);

        graph.getViewport().setYAxisBoundsManual(true);
        graph.getViewport().setMinY(-1500);
        graph.getViewport().setMaxY(1500);
    }

    private void resetSeries() {
        graph.removeAllSeries();

        series_left = new LineGraphSeries<DataPoint>(new DataPoint[] {});
        series_right = new LineGraphSeries<DataPoint>(new DataPoint[] {});

        Paint paint = new Paint();
        paint.setColor(activity.getResources().getColor(R.color.colorRed));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(5);
        paint.setPathEffect(new DashPathEffect(new float[]{8, 5}, 0));
        series_left.setCustomPaint(paint);
        series_left.setTitle("LEFT");

        paint = new Paint();
        paint.setColor(activity.getResources().getColor(R.color.colorGreen));
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

    void updateGraph(AudioMem mem) {
        //resetSeries();

        /*
        for (AudioValue val : mem.q){
            series_left.appendData(new DataPoint(time,  1 * val.left), true, mem.maxSize);
            series_right.appendData(new DataPoint(time, val.right), true, mem.maxSize);
            time++;
        }
        */

        ///*

        ArrayList<AudioValue> dx = new ArrayList<>();

        for (int i = 0; i < mem.q.size() - 1; i++){
            int leftDx = mem.q.get(i).left - mem.q.get(i + 1).left;
            int rightDx = mem.q.get(i).right - mem.q.get(i + 1).right;
            if (Math.abs(leftDx) < 300)
                leftDx = 0;
            if (Math.abs(rightDx) < 300)
                rightDx = 0;
            //Log.d(TAG, "updateGraph: Left: " + leftDx + "Right: " + rightDx);
            AudioValue res = new AudioValue(leftDx, rightDx);
            dx.add(i, res);
        }

        for (AudioValue val : dx){
            series_left.appendData(new DataPoint(time,  1 * val.left), true, mem.maxSize);
            series_right.appendData(new DataPoint(time, val.right), true, mem.maxSize);
            time++;
        }
        //*/

        graph.onDataChanged(true, true);
    }
}
