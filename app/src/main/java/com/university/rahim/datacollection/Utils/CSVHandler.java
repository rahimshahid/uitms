package com.university.rahim.datacollection.Utils;

import android.graphics.Path;
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

            String[] columns = {"X1","X2","X3","X4","X5","X6","X7","X8","X9","X10","X11","X12","X13","X14","X15","X16","X17","X18","X19","X20","X21","X22","X23","X24","X25","X26","X27","X28","X29","X30","X31","X32"
                    ,"Y1","Y2","Y3","Y4","Y5","Y6","Y7","Y8","Y9","Y10","Y11","Y12","Y13","Y14","Y15","Y16","Y17","Y18","Y19","Y20","Y21","Y22","Y23","Y24","Y25","Y26","Y27","Y28","Y29","Y30","Y31","Y32"
                    ,"Z1","Z2","Z3","Z4","Z5","Z6","Z7","Z8","Z9","Z10","Z11","Z12","Z13","Z14","Z15","Z16","Z17","Z18","Z19","Z20","Z21","Z22","Z23","Z24","Z25","Z26","Z27","Z28","Z29","Z30","Z31","Z32",
                    "direction"};
            writer.writeNext(columns);
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }


    }

    public void writeWaveTofile(ArrayList<SensorValue> arr, int dir)
    {
        String[] values;
        ArrayList<String> List = new ArrayList<String>();

        try {
            writer = new CSVWriter(new FileWriter(file, true)); //  'true' means it will append to the file instead of overwriting it.
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Write all the axes
        for(int i=0; i<arr.size(); i++)
        {
            List.add(Double.toString(arr.get(i).getX()));
        }

        for(int i=0; i<arr.size(); i++)
        {
            List.add(Double.toString(arr.get(i).getY()));
        }

        for(int i=0; i<arr.size(); i++)
        {
            List.add(Double.toString(arr.get(i).getZ()));
        }

        if(dir == 1)
            List.add("Above");
        else if(dir == 2)
            List.add("Below");
        else if(dir == 3)
            List.add("Left");
        else if(dir == 4)
            List.add("Right");

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
