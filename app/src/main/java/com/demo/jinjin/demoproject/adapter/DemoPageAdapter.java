package com.demo.jinjin.demoproject.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.demo.jinjin.demoproject.DemoFragment;

/**
 * Created by linkmax on 2016/8/9.
 */
public class DemoPageAdapter extends FragmentPagerAdapter {

    public DemoPageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return new DemoFragment();
    }

    @Override
    public int getCount() {
        return 3;
    }
}
