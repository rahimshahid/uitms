package com.university.rahim.datacollection.Ui;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.university.rahim.datacollection.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final int PERMISSION_REQUEST_CODE = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.initView();

        //COde to obtain permission of external storage

        if (Build.VERSION.SDK_INT >= 23)              //to check wether ot not the OS is marshamallow or above
        {                                             //in 23 and above permissions need to be granted by user/phone using 23 in the emulator
            if (!checkPermission())
            {
                requestPermission(); // Code for permission
            }
        }
        else
        {
            // Code for Below 23 API Oriented Device
            // Do next code
        }

    }

    private boolean checkPermission() {
        int result = ContextCompat.checkSelfPermission(this, android.Manifest.permission.WRITE_EXTERNAL_STORAGE);
        if (result == PackageManager.PERMISSION_GRANTED) {
            return true;
        } else {
            return false;
        }
    }

    private void requestPermission() {

        if (ActivityCompat.shouldShowRequestPermissionRationale(this, android.Manifest.permission.WRITE_EXTERNAL_STORAGE)) {
            Toast.makeText(this, "Write External Storage permission allows us to do store images. Please allow this permission in App Settings.", Toast.LENGTH_LONG).show();
        } else {
            ActivityCompat.requestPermissions(this, new String[]{android.Manifest.permission.WRITE_EXTERNAL_STORAGE}, PERMISSION_REQUEST_CODE);
        }
    }

    private void initView() {
        this.findViewById(R.id.bt_acc).setOnClickListener(this);
        this.findViewById(R.id.bt_gyr).setOnClickListener(this);
        this.findViewById(R.id.bt_mic).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.bt_acc:
                Intent myIntent = new Intent(MainActivity.this, SensorActivity.class);
                myIntent.putExtra("sensor", "acc");
                MainActivity.this.startActivity(myIntent);
                break;
            case R.id.bt_gyr:
                Intent myIntent2 = new Intent(MainActivity.this, SensorActivity.class);
                myIntent2.putExtra("sensor", "gyro");
                MainActivity.this.startActivity(myIntent2);
                break;
            case R.id.bt_mic:
                Intent myIntent3 = new Intent(MainActivity.this, MicActivity.class);
                MainActivity.this.startActivity(myIntent3);
                break;
        }
    }
}
