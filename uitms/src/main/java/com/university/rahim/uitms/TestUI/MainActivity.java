package com.university.rahim.uitms.TestUI;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.university.rahim.uitms.Constants;
import com.university.rahim.uitms.Microphone_Module.AudioClassifier;
import com.university.rahim.uitms.Microphone_Module.AudioMem;
import com.university.rahim.uitms.R;
import com.university.rahim.uitms.TapSubscription;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "DBG_mainActivity";
    private TapSubscription subscription;
    private Graph graphView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();

        graphView = new Graph();
        graphView.createView(this);

        subscription = TapSubscription.subscribe(this, new TapSubscription.Result() {
            @Override
            public void onResultReady(Constants.DIRECTION dir) {
                Log.d(TAG, "onResultReady: " + dir.toString());
            }
        }, new AudioClassifier.AudioReady() {
            @Override
            public void AudioAfterTap(AudioMem mem) {
                graphView.updateGraph(mem);

            }
        });
    }

    @Override
    protected void onPause() {
        super.onPause();
        subscription.unSubscribe();
    }

    // Just Some UI Stuff Below

    void UiOnTapDetected(final Constants.DIRECTION dir) {
        MainActivity.this.runOnUiThread(new Runnable() {
            public void run() {
                if (dir == Constants.DIRECTION.RIGHT) {
                    MainActivity.this.findViewById(R.id.bt_stableRight).setVisibility(View.GONE);
                    MainActivity.this.findViewById(R.id.bt_tapRight).setVisibility(View.VISIBLE);
                }
                else if (dir == Constants.DIRECTION.LEFT) {
                    MainActivity.this.findViewById(R.id.bt_stableLeft).setVisibility(View.GONE);
                    MainActivity.this.findViewById(R.id.bt_tapLeft).setVisibility(View.VISIBLE);
                }
                else if (dir == Constants.DIRECTION.BOTTOM) {
                    MainActivity.this.findViewById(R.id.bt_stableBottom).setVisibility(View.GONE);
                    MainActivity.this.findViewById(R.id.bt_tapBottom).setVisibility(View.VISIBLE);
                }
                else if (dir == Constants.DIRECTION.TOP) {
                    MainActivity.this.findViewById(R.id.bt_stableTop).setVisibility(View.GONE);
                    MainActivity.this.findViewById(R.id.bt_tapTop).setVisibility(View.VISIBLE);
                }
                new Timer().schedule(new TimerTask() {
                    @Override
                    public void run() {
                        MainActivity.this.runOnUiThread(new Runnable() {
                            public void run() {
                                resetTapStateUiAll();
                            }
                        });
                    }
                }, 250);

            }
        });
    }

    private void resetTapStateUiAll() {
        MainActivity.this.findViewById(R.id.bt_stableRight).setVisibility(View.VISIBLE);
        MainActivity.this.findViewById(R.id.bt_tapRight).setVisibility(View.GONE);

        MainActivity.this.findViewById(R.id.bt_stableLeft).setVisibility(View.VISIBLE);
        MainActivity.this.findViewById(R.id.bt_tapLeft).setVisibility(View.GONE);

        MainActivity.this.findViewById(R.id.bt_stableBottom).setVisibility(View.VISIBLE);
        MainActivity.this.findViewById(R.id.bt_tapBottom).setVisibility(View.GONE);

        MainActivity.this.findViewById(R.id.bt_stableTop).setVisibility(View.VISIBLE);
        MainActivity.this.findViewById(R.id.bt_tapTop).setVisibility(View.GONE);
    }
}
