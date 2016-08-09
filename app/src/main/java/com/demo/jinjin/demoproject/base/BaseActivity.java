package com.demo.jinjin.demoproject.base;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;

import org.kymjs.kjframe.KJActivity;

/**
 * Created by linkmax on 2016/8/1.
 */
public class BaseActivity  extends AppCompatActivity implements IBaseView{

    private ProgressDialog dialog;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void toActivity(Class<?> clazz) {
        Intent i = new Intent(this,clazz);
        startActivity(i);
    }

    @Override
    public void showProgressBar() {
        dialog = ProgressDialog.show(this,"","加载中...");
        dialog.show();
    }

    @Override
    public void cancelProgressBar() {
        dialog.dismiss();
    }

    @Override
    public void setTransBar() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT){
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
        }
    }
}
