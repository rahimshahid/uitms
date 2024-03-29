package com.university.rahim.uitms.TestUI;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.mikepenz.materialdrawer.AccountHeader;
import com.mikepenz.materialdrawer.AccountHeaderBuilder;
import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.DrawerBuilder;
import com.mikepenz.materialdrawer.model.DividerDrawerItem;
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem;
import com.mikepenz.materialdrawer.model.ProfileDrawerItem;
import com.mikepenz.materialdrawer.model.SecondaryDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IProfile;
import com.university.rahim.uitms.Constants;
import com.university.rahim.uitms.Microphone_Module.AudioMem;
import com.university.rahim.uitms.Microphone_Module.SoundFeatures.Feature;
import com.university.rahim.uitms.R;
import com.university.rahim.uitms.TapSubscription;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class HomeActivity extends AppCompatActivity {
    private static final String TAG = "DBG_HomeActivity";

    private Drawer drawer;
    private TapSubscription subscription;
    private MicGraph MicGraphView;
    private MicTraining micTrainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        createViews();
        micTrainer = new MicTraining(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        MicGraphView = new MicGraph();
        MicGraphView.createView(this);
        this.subscribeUITMS();
    }

    @Override
    protected void onPause() {
        super.onPause();
        this.unSubscribeUITMS();
    }

    private void subscribeUITMS(){
        subscription = TapSubscription.subscribe(this, new TapSubscription.ResultCallback() {
            @Override
            public void onTapDetected() {

            }

            @Override
            public void onAudioReady(AudioMem mem) {
                MicGraphView.updateGraph(mem);
            }

            @Override
            public void onFeaturesReady(ArrayList<Feature> features) {
                Log.d(TAG, "onFeaturesReady: ");
                micTrainer.onTap(features);
            }

            @Override
            public void onResultReady(Constants.DIRECTION dir) {
                Log.d(TAG, "onResultReady: " + dir.toString());
                HomeActivity.this.UiOnTapDetected(dir);
            }
        });
    }

    private void unSubscribeUITMS(){
        subscription.unSubscribe();
        subscription = null;
    }

    private void createViews(){
        NavDrawerInit();

        this.findViewById(R.id.hamIcon).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawer.openDrawer();
            }
        });
    }

    private void NavDrawerInit() {
        new DrawerBuilder().withActivity(this).build();

        PrimaryDrawerItem item1 = new PrimaryDrawerItem().withIdentifier(1).withName("HOME");
        SecondaryDrawerItem item2 = new SecondaryDrawerItem().withIdentifier(3).withName("Settings");
        SecondaryDrawerItem item3 = new SecondaryDrawerItem().withIdentifier(4).withName("Training Mode");

        SecondaryDrawerItem item4 = new SecondaryDrawerItem().withIdentifier(4).withName("Analytical Model");
        SecondaryDrawerItem item5 = new SecondaryDrawerItem().withIdentifier(4).withName("Wood Thin");
        SecondaryDrawerItem item6 = new SecondaryDrawerItem().withIdentifier(4).withName("Wood Thick");
        SecondaryDrawerItem item7 = new SecondaryDrawerItem().withIdentifier(4).withName("Plastic Thin");

        AccountHeader headerResult = new AccountHeaderBuilder()
                .withActivity(this)
                .withHeaderBackground(R.drawable.drawerback)
                .addProfiles(
                        new ProfileDrawerItem().withName("Rahim Shahid")
                                .withEmail("domain.rahim@gmail.com")
                                .withIcon(getResources().getDrawable(R.drawable.profile))
                )
                .withOnAccountHeaderListener(new AccountHeader.OnAccountHeaderListener() {
                    @Override
                    public boolean onProfileChanged(View view, IProfile profile, boolean currentProfile) {
                        return false;
                    }
                })
                .build();

        Drawer result = new DrawerBuilder()
                .withActivity(this)
                .withAccountHeader(headerResult)
                .withSelectedItem(1)
                .addDrawerItems(
                        item1,
                        new DividerDrawerItem(),
                        item2,
                        item3,
                        new DividerDrawerItem(),
                        item4,
                        item5,
                        item6,
                        item7
                        )
                .withOnDrawerItemClickListener(new Drawer.OnDrawerItemClickListener() {
                    @Override
                    public boolean onItemClick(View view, int position, IDrawerItem drawerItem) {
                        // do something with the clicked item :D
                        switch (position){
                            case 1:
                                HomeActivity.this.drawer.closeDrawer();
                                break;
                            case 2:
                                break;
                            case 3:
                                Intent i = new Intent(HomeActivity.this, SettingsActivity.class);
                                finish();
                                startActivity(i);
                                break;
                            case 4:
                                if (micTrainer.isUiVisible())
                                    micTrainer.stop();
                                else
                                    micTrainer.start();
                                HomeActivity.this.drawer.closeDrawer();
                                break;
                            case 5:
                                break;
                            case 6:
                                Constants.active_model = Constants.ACTIVE_MODEL.ANALYTICAL;
                                HomeActivity.this.drawer.deselect();
                                HomeActivity.this.drawer.closeDrawer();
                                break;
                            case 7:
                                Constants.active_model = Constants.ACTIVE_MODEL.WOOD_THICK;
                                HomeActivity.this.drawer.deselect();
                                HomeActivity.this.drawer.closeDrawer();
                                break;
                            case 8:
                                Constants.active_model = Constants.ACTIVE_MODEL.WOOD_THIN;
                                HomeActivity.this.drawer.deselect();
                                HomeActivity.this.drawer.closeDrawer();
                                break;
                            case 9:
                                Constants.active_model = Constants.ACTIVE_MODEL.PLASTIC_THIN;
                                HomeActivity.this.drawer.deselect();
                                HomeActivity.this.drawer.closeDrawer();
                                break;
                        }

                        return true;
                    }
                })
                .build();

        drawer = result;
    }

    /// Just Some ResultCallback Displaying UI Stuff Below
    void UiOnTapDetected(final Constants.DIRECTION dir) {
        HomeActivity.this.runOnUiThread(new Runnable() {
            public void run() {
                if (dir == Constants.DIRECTION.RIGHT) {
                    HomeActivity.this.findViewById(R.id.bt_stableRight).setVisibility(View.GONE);
                    HomeActivity.this.findViewById(R.id.bt_tapRight).setVisibility(View.VISIBLE);
                } else if (dir == Constants.DIRECTION.LEFT) {
                    HomeActivity.this.findViewById(R.id.bt_stableLeft).setVisibility(View.GONE);
                    HomeActivity.this.findViewById(R.id.bt_tapLeft).setVisibility(View.VISIBLE);
                } else if (dir == Constants.DIRECTION.BOTTOM) {
                    HomeActivity.this.findViewById(R.id.bt_stableBottom).setVisibility(View.GONE);
                    HomeActivity.this.findViewById(R.id.bt_tapBottom).setVisibility(View.VISIBLE);
                } else if (dir == Constants.DIRECTION.TOP) {
                    HomeActivity.this.findViewById(R.id.bt_stableTop).setVisibility(View.GONE);
                    HomeActivity.this.findViewById(R.id.bt_tapTop).setVisibility(View.VISIBLE);
                }
                new Timer().schedule(new TimerTask() {
                    @Override
                    public void run() {
                        HomeActivity.this.runOnUiThread(new Runnable() {
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
        HomeActivity.this.findViewById(R.id.bt_stableRight).setVisibility(View.VISIBLE);
        HomeActivity.this.findViewById(R.id.bt_tapRight).setVisibility(View.GONE);

        HomeActivity.this.findViewById(R.id.bt_stableLeft).setVisibility(View.VISIBLE);
        HomeActivity.this.findViewById(R.id.bt_tapLeft).setVisibility(View.GONE);

        HomeActivity.this.findViewById(R.id.bt_stableBottom).setVisibility(View.VISIBLE);
        HomeActivity.this.findViewById(R.id.bt_tapBottom).setVisibility(View.GONE);

        HomeActivity.this.findViewById(R.id.bt_stableTop).setVisibility(View.VISIBLE);
        HomeActivity.this.findViewById(R.id.bt_tapTop).setVisibility(View.GONE);
    }
}
