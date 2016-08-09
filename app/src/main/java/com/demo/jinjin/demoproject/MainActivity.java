package com.demo.jinjin.demoproject;


import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;

import com.demo.jinjin.demoproject.base.BaseActivity;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class MainActivity extends BaseActivity {


    @Bind(R.id.fab_demo)
    FloatingActionButton mFabDemo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.fab_demo)
    public void toNext(){
        Snackbar.make(mFabDemo,"Fab",Snackbar.LENGTH_SHORT).show();
        toActivity(NextActivity.class);
        finish();
    }

}
