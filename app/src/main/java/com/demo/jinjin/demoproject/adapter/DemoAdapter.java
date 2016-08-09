package com.demo.jinjin.demoproject.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.demo.jinjin.demoproject.R;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by linkmax on 2016/8/9.
 */
public class DemoAdapter extends RecyclerView.Adapter<DemoAdapter.DemoHolder> {


    private Context mContext;


    public DemoAdapter(Context context) {
        mContext = context;
    }


    @Override
    public DemoHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        DemoHolder holder = new DemoHolder(LayoutInflater.from(mContext).inflate(R.layout.item_demo, parent, false));
        return holder;
    }

    @Override
    public void onBindViewHolder(DemoHolder holder, int position) {
        holder.mTxtDemo.setText("----A----");
    }

    @Override
    public int getItemCount() {
        return 50;
    }

    class DemoHolder extends RecyclerView.ViewHolder {

        @Bind(R.id.txt_demo)
        TextView mTxtDemo;

        public DemoHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }

    }


}
