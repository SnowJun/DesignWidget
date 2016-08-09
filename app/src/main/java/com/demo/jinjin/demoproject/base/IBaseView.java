package com.demo.jinjin.demoproject.base;

/**
 * Created by linkmax on 2016/8/1.
 */
public interface IBaseView {

    void toActivity(Class<?> clazz);

    void showProgressBar();

    void cancelProgressBar();

    void setTransBar();

}
