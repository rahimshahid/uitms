package com.university.rahim.uitms.TestUI;

import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.university.rahim.uitms.Microphone_Module.SoundFeatures.Feature;
import com.university.rahim.uitms.R;

import java.util.ArrayList;
/**
 * Created by rahim on 4/30/2018.
 */

public class MicTraining {
    private static final String TAG = "dbg_MicTraiing: ";
    Activity activity;
    View labelWrapper;
    Button left, right, top, bottom;
    String currentLabel = "LABEL_NOT_SPECIFIED";
    Boolean isTraining = false;
    CSVHandler csvHandler;


    MicTraining(Activity activity){
        this.activity = activity;
        csvHandler = new CSVHandler("MicData");
        findViews();
        stop();
    }

    void findViews(){
        labelWrapper = activity.findViewById(R.id.training_labels);
        left = activity.findViewById(R.id.bt_training_left);
        right = activity.findViewById(R.id.bt_training_right);
        top = activity.findViewById(R.id.bt_training_top);
        bottom = activity.findViewById(R.id.bt_training_bottom);

        left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentLabel = "LEFT";
            }
        });
        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentLabel = "RIGHT";
            }
        });
        top.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentLabel = "TOP";
            }
        });
        bottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentLabel = "BOTTOM";
            }
        });
    }

    public void onTap(ArrayList<Feature> features){
        Log.d(TAG, "onTap: ");
        if (!isTraining)
            return;

        Log.d(TAG, "onTap: true");
        csvHandler.writeAudioFeaturesTofile(features, currentLabel);
    }

    public void stop(){
        labelWrapper.setVisibility(View.GONE);
        isTraining = false;
    }

    public void start(){
        labelWrapper.setVisibility(View.VISIBLE);
        isTraining = true;
    }

    public boolean isUiVisible(){
        if (labelWrapper.getVisibility() == View.VISIBLE && isTraining){
            return true;
        }
        return false;
    }
}
