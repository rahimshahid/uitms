package com.university.rahim.uitms;

import android.os.Handler;
import android.os.Looper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.university.rahim.uitms.Accelerometer_Module.AccSubscription;
import com.university.rahim.uitms.Microphone_Module.AudioClassifier;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class
MainActivity extends AppCompatActivity {
    private static final String TAG = "DBG_mainActivity";
    AccSubscription tapDetectorSub = null;

    //TODO
    AudioClassifier ac = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();

        //TODO
        if(ac == null){
            ac = new AudioClassifier();
        }
        ac.start();

        tapDetectorSub = AccSubscription.subscribe(this, new AccSubscription.TapListener() {
            @Override
            public void onTap(AccSubscription.TapListener.DIRECTION dir) {
                // TODO
                new Timer().schedule(new TimerTask() {
                    @Override
                    public void run() {
                        ArrayList<String> res = ac.onTapDetected();
                        for(String e: res){
                            switch(e) {
                                case "left":
                                    UiOnTapDetected(DIRECTION.LEFT);
                                    break;
                                case "right":
                                    UiOnTapDetected(DIRECTION.RIGHT);
                                    break;
                                case "top":
                                    UiOnTapDetected(DIRECTION.TOP);
                                    break;
                                case "bottom":
                                    UiOnTapDetected(DIRECTION.BOTTOM);
                                    break;
                            }
                        }
                    }
                }, AudioClassifier.listeningDelay);

            }
        });

    }

    @Override
    protected void onPause() {
        super.onPause();
        tapDetectorSub.unsubscribe();
        tapDetectorSub = null;

        //TODO
        ac.pause();
        ac = null;
    }

    void UiOnTapDetected(final AccSubscription.TapListener.DIRECTION dir) {
        MainActivity.this.runOnUiThread(new Runnable() {
            public void run() {
                if (dir == AccSubscription.TapListener.DIRECTION.RIGHT) {
                    MainActivity.this.findViewById(R.id.bt_stableRight).setVisibility(View.GONE);
                    MainActivity.this.findViewById(R.id.bt_tapRight).setVisibility(View.VISIBLE);
                }
                else if (dir == AccSubscription.TapListener.DIRECTION.LEFT) {
                    MainActivity.this.findViewById(R.id.bt_stableLeft).setVisibility(View.GONE);
                    MainActivity.this.findViewById(R.id.bt_tapLeft).setVisibility(View.VISIBLE);
                }
                else if (dir == AccSubscription.TapListener.DIRECTION.BOTTOM) {
                    MainActivity.this.findViewById(R.id.bt_stableBottom).setVisibility(View.GONE);
                    MainActivity.this.findViewById(R.id.bt_tapBottom).setVisibility(View.VISIBLE);
                }
                else if (dir == AccSubscription.TapListener.DIRECTION.TOP) {
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
