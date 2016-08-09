package com.demo.jinjin.demoproject;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;

import com.demo.jinjin.demoproject.adapter.DemoPageAdapter;
import com.demo.jinjin.demoproject.base.BaseActivity;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by linkmax on 2016/8/9.
 */
public class NextActivity extends BaseActivity {

    @Bind(R.id.toolbar)
    Toolbar mToolbar;
    @Bind(R.id.tabs)
    TabLayout mTabs;
    @Bind(R.id.abl_demo)
    AppBarLayout mAblDemo;
    @Bind(R.id.viewpager)
    ViewPager mViewpager;
    @Bind(R.id.fab)
    FloatingActionButton mFab;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        ButterKnife.bind(this);
        showInfo();
    }


    @OnClick(R.id.fab)
    public void toThrid(){
        toActivity(ThirdActivity.class);
    }

    private void showInfo() {
        mViewpager.setAdapter(new DemoPageAdapter(getSupportFragmentManager()));
        mTabs.setTabMode(TabLayout.MODE_FIXED);
        mTabs.setTabGravity(TabLayout.GRAVITY_FILL);
        mTabs.addTab(mTabs.newTab().setText("页面1"));
        mTabs.addTab(mTabs.newTab().setText("页面2"));
        mTabs.addTab(mTabs.newTab().setText("页面3"));
//        mTabs.addTab(mTabs.newTab().setText("页面4"));
//        mTabs.addTab(mTabs.newTab().setText("页面5"));
//        mTabs.addTab(mTabs.newTab().setText("页面6"));
//        mTabs.addTab(mTabs.newTab().setText("页面7"));
//        mTabs.addTab(mTabs.newTab().setText("页面8"));
//        mTabs.addTab(mTabs.newTab().setText("页面9"));
//        mTabs.addTab(mTabs.newTab().setText("页面10"));
        mTabs.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                mViewpager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        mViewpager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(mTabs));
    }


}
