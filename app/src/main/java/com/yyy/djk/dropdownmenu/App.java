package com.yyy.djk.dropdownmenu;

import android.app.Application;

import com.squareup.leakcanary.LeakCanary;

/**
 * @Author yinzh
 * @Date 2019/4/25 21:58
 * @Description
 */
public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        //内存检测
        LeakCanary.install(this);
    }
}
