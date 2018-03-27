package com.university.rahim.uitms;

import android.app.Application;
import android.content.Context;

/**
 * Created by Rahim on 3/27/2018.
 */

public class App extends Application {
    private static Application instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }

    public static Context getContext() {
        return instance.getApplicationContext();
    }
}
