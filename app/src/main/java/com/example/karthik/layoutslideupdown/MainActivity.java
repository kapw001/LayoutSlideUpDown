package com.example.karthik.layoutslideupdown;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.kaichunlin.transition.ViewTransitionBuilder;
import com.kaichunlin.transition.adapter.SlidingUpPanelLayoutAdapter;
import com.sothree.slidinguppanel.SlidingUpPanelLayout;

public class MainActivity extends AppCompatActivity {
    private SlidingUpPanelLayoutAdapter mSlidingUpPanelLayoutAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.t).setAlpha(0f);
//        ViewTransitionBuilder.transit(findViewById(R.id.t)).alpha(0f);
        final Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final SlidingUpPanelLayout supl = ((SlidingUpPanelLayout) findViewById(R.id.sliding_layout));

        //code to transit view
        mSlidingUpPanelLayoutAdapter = new SlidingUpPanelLayoutAdapter();
//        ViewTransitionBuilder.transit(findViewById(R.id.content_bg)).rotationY(90).endRange(0.25f).id("BG").buildFor(mSlidingUpPanelLayoutAdapter);
//        ViewTransitionBuilder.transit(findViewById(R.id.content_bg2)).rotationY(270, 360).range(0.25f, 0.5f).id("BG_2").buildFor(mSlidingUpPanelLayoutAdapter);
        ViewTransitionBuilder.transit(findViewById(R.id.toolbar)).alpha(0f).buildFor(mSlidingUpPanelLayoutAdapter);
//        ViewTransitionBuilder.transit(findViewById(R.id.content_bg2)).alpha(0f).buildFor(mSlidingUpPanelLayoutAdapter);
        ViewTransitionBuilder.transit(findViewById(R.id.t)).alpha(1f).buildFor(mSlidingUpPanelLayoutAdapter);
        supl.setPanelSlideListener(mSlidingUpPanelLayoutAdapter);

        mSlidingUpPanelLayoutAdapter.setPanelSlideListener(new SlidingUpPanelLayout.PanelSlideListener() {
            @Override
            public void onPanelSlide(View panel, float slideOffset) {

            }

            @Override
            public void onPanelCollapsed(View panel) {

            }

            @Override
            public void onPanelExpanded(View panel) {

            }

            @Override
            public void onPanelAnchored(View panel) {

            }

            @Override
            public void onPanelHidden(View panel) {

            }
        });
    }
}
