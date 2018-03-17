package com.university.rahim.uitms;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.university.rahim.uitms.UITMS_module.Subscription;

public class
MainActivity extends AppCompatActivity {
    private static final String TAG = "DBG_mainActivity";
    Subscription tapDetectorSub = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();
        tapDetectorSub = Subscription.subscribe(this, new Subscription.TapListener() {
            @Override
            public void onTap(Subscription.TapListener.DIRECTION dir) {
                tapDetected(dir);
            }
        });

    }

    @Override
    protected void onPause() {
        super.onPause();
        tapDetectorSub.unsubscribe();
        tapDetectorSub = null;
    }

    void tapDetected(Subscription.TapListener.DIRECTION dir) {
        if (dir == Subscription.TapListener.DIRECTION.RIGHT) {
            this.findViewById(R.id.bt_stableRight).setVisibility(View.GONE);
            this.findViewById(R.id.bt_tapRight).setVisibility(View.VISIBLE);
        }
        else if (dir == Subscription.TapListener.DIRECTION.LEFT) {
            this.findViewById(R.id.bt_stableLeft).setVisibility(View.GONE);
            this.findViewById(R.id.bt_tapLeft).setVisibility(View.VISIBLE);
        }
        else if (dir == Subscription.TapListener.DIRECTION.BOTTOM) {
            this.findViewById(R.id.bt_stableBottom).setVisibility(View.GONE);
            this.findViewById(R.id.bt_tapBottom).setVisibility(View.VISIBLE);
        }
        else if (dir == Subscription.TapListener.DIRECTION.TOP) {
            this.findViewById(R.id.bt_stableTop).setVisibility(View.GONE);
            this.findViewById(R.id.bt_tapTop).setVisibility(View.VISIBLE);
        }

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                resetTapStateAll();
            }
        }, 250);
    }

    private void resetTapStateAll() {
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
