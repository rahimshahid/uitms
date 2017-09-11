package com.university.rahim.datacollection.Ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.university.rahim.datacollection.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.initView();
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
                break;
        }
    }
}
