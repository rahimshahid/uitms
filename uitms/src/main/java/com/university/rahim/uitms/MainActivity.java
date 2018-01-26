package com.university.rahim.uitms;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.university.rahim.uitms.UITMS_module.Subscription;

public class MainActivity extends AppCompatActivity {
    Subscription tapDetectorSub = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();
        tapDetectorSub = Subscription.subscribe(this);

    }

    @Override
    protected void onPause() {
        super.onPause();
        tapDetectorSub.unsubscribe();
        tapDetectorSub = null;
    }
}
