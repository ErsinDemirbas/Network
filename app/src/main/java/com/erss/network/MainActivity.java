package com.erss.network;

import android.content.Context;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.material.tabs.TabLayout;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.erss.network.topology.SimpleFragmentPageAdapter;

public class MainActivity extends AppCompatActivity {
  TabLayout tabLayout;
  ViewPager viewPager;
  Context context = this;
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabLayout = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(new SimpleFragmentPageAdapter(getSupportFragmentManager(),context));
        tabLayout.setupWithViewPager(viewPager);
        reklam();
    }

    public void reklam()
    {
        //ca-app-pub-7673146043617831/1121597131
        //TEST ca-app-pub-3940256099942544/6300978111
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }
}
