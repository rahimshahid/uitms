package com.university.rahim.uitms;

import android.content.SharedPreferences;

import static android.content.Context.MODE_PRIVATE;

/**
 * Created by Rahim on 3/27/2018.
 */

public class Prefs {
    public static final String MY_PREFS_NAME = "UITMS_CONSTANTS";


    public static void putInt(String name, int value){
        SharedPreferences.Editor editor = App.getContext().getSharedPreferences(MY_PREFS_NAME, MODE_PRIVATE).edit();
        editor.putInt(name, value);
        editor.apply();
    }
    public static void putFloat(String name, float value){
        SharedPreferences.Editor editor = App.getContext().getSharedPreferences(MY_PREFS_NAME, MODE_PRIVATE).edit();
        editor.putFloat(name, value);
        editor.apply();
    }
    public static int getInt(String name){
        SharedPreferences prefs = App.getContext().getSharedPreferences(MY_PREFS_NAME, MODE_PRIVATE);
        return prefs.getInt(name, -1);
    }
    public static float getFloat(String name){
        SharedPreferences prefs = App.getContext().getSharedPreferences(MY_PREFS_NAME, MODE_PRIVATE);
        return prefs.getFloat(name, -1);
    }
}
