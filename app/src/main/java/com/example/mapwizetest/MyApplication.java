package com.example.mapwizetest;

import android.app.Application;

import io.mapwize.mapwizeformapbox.AccountManager;

public class MyApplication  extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        AccountManager.start(this, "3e0fc9b21a9eaa48350a1c0513cfdef6");
    }
}
