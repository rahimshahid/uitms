package com.university.rahim.datacollection.Utils;

import android.os.Environment;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import com.opencsv.*;

/**
 * Created by Omer-PC on 10/6/2017.
 */

public class CSVHandler
{

    private File file;
    private CSVWriter writer;

    public CSVHandler(String fileName)
    {
        File exportDir = new File(Environment.getExternalStorageDirectory(), "");
        if (!exportDir.exists())
        {
            exportDir.mkdirs();
        }

        this.file = new File(exportDir, fileName + ".csv");

        if(!file.exists())
        {
            try {
                writer = new CSVWriter(new FileWriter(file, true));        //  'true' means it will append to the file instead of overwriting it.
            } catch (IOException e) {
                e.printStackTrace();
            }

            String[] columns = {"1","2","3","4","5","6","7", "8","9","10","11","12","13","14","direction"};
            writer.writeNext(columns);
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }


    }

    public void writeWaveTofile(ArrayList<SensorValue> arr)
    {
        String[] values;
        ArrayList<String> List = new ArrayList<String>();

        try {
            writer = new CSVWriter(new FileWriter(file, true)); //  'true' means it will append to the file instead of overwriting it.
        } catch (IOException e) {
            e.printStackTrace();
        }

        for(int i=0; i<arr.size(); i++)
        {
            List.add(Double.toString(arr.get(i).getZ()));
        }

        values = List.toArray(new String[0]);              //assign the list to a string array

        writer.writeNext(values);

        try {
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
