package com.demo.jinjin.demoproject;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.demo.jinjin.demoproject.adapter.DemoAdapter;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by linkmax on 2016/8/9.
 */
public class DemoFragment extends Fragment {


    @Bind(R.id.rlv_demo)
    RecyclerView mRlvDemo;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_demo, container, false);
        ButterKnife.bind(this, view);
        return view;
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        showInfo();
    }

    private void showInfo() {
        mRlvDemo.setAdapter(new DemoAdapter(getActivity()));
        mRlvDemo.setLayoutManager(new LinearLayoutManager(getActivity()));
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }
}
