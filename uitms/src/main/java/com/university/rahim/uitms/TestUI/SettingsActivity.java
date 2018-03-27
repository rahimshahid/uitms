package com.university.rahim.uitms.TestUI;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.SeekBar;

import com.university.rahim.uitms.Constants;
import com.university.rahim.uitms.R;

public class SettingsActivity extends AppCompatActivity {
    EditText et_sensitivity, et_dealy, et_noise;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        createView();
    }

    void createView() {
        et_sensitivity = this.findViewById(R.id.seekBarDetectionSensitivity);
        et_dealy = this.findViewById(R.id.seekBarDetectionDelay);
        et_noise = this.findViewById(R.id.seekBarNoiseThreshold);
        this.findViewById(R.id.applyBt).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Constants.setMinTapThreshold(Double.parseDouble(et_sensitivity.getText().toString()));
                Constants.setdelayBtwTaps(Integer.parseInt(et_dealy.getText().toString()));
                Constants.setnoiseThreshold(Integer.parseInt(et_noise.getText().toString()));

                SettingsActivity.this.onBackPressed();
            }
        });

        et_sensitivity.setText("" + Constants.getMinTapThreshold());
        et_dealy.setText("" + Constants.getdelayBtwTaps());
        et_noise.setText("" + Constants.getnoiseThreshold());
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent i = new Intent(SettingsActivity.this, HomeActivity.class);
        finish();
        startActivity(i);
    }

    @Override
    protected void onPause() {
        super.onPause();
    }
}
