package com.university.rahim.uitms.Microphone_Module.SoundFeatures;

import android.util.Log;

import com.university.rahim.uitms.Constants;
import com.university.rahim.uitms.Microphone_Module.AudioMem;
import com.university.rahim.uitms.Microphone_Module.AudioValue;

import java.util.ArrayList;
import static com.university.rahim.uitms.Constants.surroundingSize;

/**
 * Created by rahim on 3/24/2018.
 */

public class DX2 {
    private static final String TAG = "dbg_DX2: ";

    private AudioMem input;

    private ArrayList<AudioValue> tapFilter;
    private double avg_dx_left, avg_dx_right, avg_dx2_left, avg_dx2_right;
    private double max_dx2_left, max_dx2_right;
    private int first_left_detection, first_right_detection;
    private int noiseThreshold = Constants.getnoiseThreshold();


    public static ArrayList<Feature> getFeatures(AudioMem mem, boolean applyFilter) throws Exception {
        DX2 machine = new DX2(mem);
        ArrayList<Feature> features = new ArrayList<>();
        // All features
        machine.getFirstDetections(machine.getDx2( machine.getDx(machine.input)));
        features.add(new Feature(SoundFeatureExtractor.FEATURES.AVG_DX2_LEFT, machine.avg_dx2_left));
        features.add(new Feature(SoundFeatureExtractor.FEATURES.AVG_DX2_RIGHT, machine.avg_dx2_right));
        features.add(new Feature(SoundFeatureExtractor.FEATURES.FIRST_LEFT_DETECTION, machine.first_left_detection));
        features.add(new Feature(SoundFeatureExtractor.FEATURES.FIRST_RIGHT_DETECTION, machine.first_right_detection));
        features.add(new Feature(SoundFeatureExtractor.FEATURES.MAX_DX2_LEFT, machine.max_dx2_left));
        features.add(new Feature(SoundFeatureExtractor.FEATURES.MAX_DX2_RIGHT, machine.max_dx2_right));

        if (applyFilter){
            machine.applyFilterToInput();
        }
        return features;
    }

    private DX2(AudioMem mem){
        input = mem;
        tapFilter = new ArrayList<>();
    }

    private ArrayList<AudioValue> getDx(AudioMem mem){
        ArrayList<AudioValue> dx = new ArrayList<>();
        double avgDxRight = 0;
        double avgDxLeft = 0;

        for (int i = 1; i < mem.q.size() - 1; i++){
            if (!(mem.q.get(i + 1) == null || mem.q.get(i - 1) == null || mem.q.get(i) == null)){
                int leftDx = mem.q.get(i - 1).left - mem.q.get(i + 1).left;
                int rightDx = mem.q.get(i - 1).right - mem.q.get(i + 1).right;
                if (Math.abs(leftDx) < noiseThreshold)
                    leftDx = 0;
                if (Math.abs(rightDx) < noiseThreshold)
                    rightDx = 0;
                avgDxLeft += leftDx;
                avgDxRight += rightDx;
                AudioValue res = new AudioValue(leftDx, rightDx);
                dx.add(res);
            }
        }

        avgDxLeft /= dx.size();
        avgDxRight /= dx.size();

        avg_dx_left = avgDxLeft;
        avg_dx_right = avgDxRight;

        return dx;
    }

    private ArrayList<AudioValue> getDx2(ArrayList<AudioValue> dx) {
        ArrayList<AudioValue> dx2 = new ArrayList<>();
        double avgDxRight = 0;
        double avgDxLeft = 0;

        for (int i = 1; i < dx.size() - 1; i++){
            int leftDx = dx.get(i - 1).left - dx.get(i + 1).left;
            int rightDx = dx.get(i - 1).right - dx.get(i + 1).right;
            if (Math.abs(leftDx) < noiseThreshold)
                leftDx = 0;
            if (Math.abs(rightDx) < noiseThreshold)
                rightDx = 0;
            avgDxLeft += leftDx;
            avgDxRight += rightDx;
            AudioValue res = new AudioValue(leftDx, rightDx);
            dx2.add(res);
        }
        avgDxLeft /= dx.size();
        avgDxRight /= dx.size();

        avg_dx2_left = avgDxLeft;
        avg_dx2_right = avgDxRight;

        return dx2;
    }

    private void getFirstDetections(ArrayList<AudioValue> dx2){
        boolean firstLeftFound = false;
        boolean firstRightFound = false;

        max_dx2_left = dx2.get(0).left;
        max_dx2_right = dx2.get(0).right;

        tapFilter.add(new AudioValue(0,0));
        tapFilter.add(new AudioValue(0,0));

        for (int i = 0 ; i < dx2.size(); i++){
            AudioValue val = dx2.get(i);

            // MAX
            if (val.left > max_dx2_left) {
                max_dx2_left = val.left;
            }

            if (val.right > max_dx2_right) {
                max_dx2_right = val.right;
            }

            // Filter
            int leftFilter = 0;
            int rightFilter = 0;
            if (val.left !=0) {
                leftFilter = 1;
            }
            if (val.right !=0) {
                rightFilter = 1;
            }
            tapFilter.add(new AudioValue(leftFilter,rightFilter));



            // First Detection

            if (!firstLeftFound) {
                if (val.left != 0){
                    boolean surroundedByData = true;
                    double avg =0;
                    int count = 0;
                    for (int j = i - surroundingSize; j < i + surroundingSize; j++) {
                        if ( j>=0 && j<dx2.size()) {
                            avg += dx2.get(i).left;
                            count++;
                        }
                    }
                    avg /= count;
                    if (Math.abs(avg) < noiseThreshold){
                        surroundedByData = false;
                    }

                    if(surroundedByData) {
                        first_left_detection = i;
                        firstLeftFound = true;
                    }
                }
            }
            if (!firstRightFound) {
                if (val.right != 0){
                    boolean surroundedByData = true;
                    double avg =0;
                    int count = 0;
                    for (int j = i - surroundingSize; j < i + surroundingSize; j++) {
                        if ( j>=0 && j<dx2.size()) {
                            avg += dx2.get(i).right;
                            count++;
                        }
                    }
                    avg /= count;
                    if (Math.abs(avg) < noiseThreshold){
                        surroundedByData = false;
                    }
                    if (surroundedByData) {
                        first_right_detection = i;
                        firstRightFound = true;
                    }
                }
            }
        }
        if (first_left_detection == 0){
            first_left_detection = dx2.size() - 1;
        }
        if (first_right_detection == 0){
            first_right_detection = dx2.size() - 1;
        }
        tapFilter.add(new AudioValue(0,0));
        tapFilter.add(new AudioValue(0,0));

        return;
    }

    private void applyFilterToInput() throws Exception{
        if (input.q.size() != tapFilter.size()){
            Log.d(TAG, "applyFilterToInput: Array Size Mismatch");
            throw new Exception("ArraySizeMismatch");
        }

        for (int i = 0; i < input.q.size(); i++) {
            input.q.get(i).left = input.q.get(i).left * tapFilter.get(i).left;
            input.q.get(i).right = input.q.get(i).right * tapFilter.get(i).right;
        }
    }
}
