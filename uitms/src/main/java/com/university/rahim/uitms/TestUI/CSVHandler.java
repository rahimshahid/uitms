package com.university.rahim.uitms.TestUI;

import android.os.Environment;
import android.util.Log;

import com.opencsv.CSVWriter;
import com.university.rahim.uitms.Microphone_Module.SoundFeatures.Feature;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by rahim on 4/30/2018.
 */


public class CSVHandler {
    private static final String TAG = "dbg_CSV: ";
    private File file;
    private CSVWriter writer;


    public CSVHandler(String fileName)
    {
        File exportDir = new File(Environment.getExternalStorageDirectory(), "");
        if (!exportDir.exists()) {
            exportDir.mkdirs();
        }
        this.file = new File(exportDir, fileName + ".csv");
    }

    public void writeAudioFeaturesTofile(ArrayList<Feature> features, String currentDir) {
        Log.d(TAG, "writeAudioFeaturesTofile: ");
        if(!file.exists())
        {
            try {
                writer = new CSVWriter(new FileWriter(file, true));        //  'true' means it will append to the file instead of overwriting it.
            } catch (IOException e) {
                e.printStackTrace();
            }

            ArrayList<String> names = new ArrayList<>();
            for (Feature f: features) {
                names.add(f.name.toString());
            }
            names.add("DIRECTION");

            writer.writeNext(names.toArray(new String[names.size()]));

            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        ArrayList<String> vals = new ArrayList<String>();
        try {
            writer = new CSVWriter(new FileWriter(file, true)); //  'true' means it will append to the file instead of overwriting it.
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (Feature f: features) {
            vals.add("" + f.val);
        }
        vals.add(currentDir);

        writer.writeNext(vals.toArray(new String[vals.size()]));

        try {
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}