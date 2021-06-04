package com.erss.network.nodes;

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

import com.erss.network.R;

public class Nodes extends AppCompatActivity {
    TabLayout tabLayout2;
    ViewPager viewPager2;
    Context context2 = this;
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nodes);
        tabLayout2 = findViewById(R.id.tabLayout2);
        viewPager2 = findViewById(R.id.view_pager2);
        viewPager2.setAdapter(new SimpleFragmentPageAdapter2(getSupportFragmentManager(),context2));
        tabLayout2.setupWithViewPager(viewPager2);
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
