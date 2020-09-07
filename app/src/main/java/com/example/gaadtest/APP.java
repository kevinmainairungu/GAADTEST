package com.example.gaadtest;

import android.app.Application;

import timber.log.Timber;

public class APP extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        if (BuildConfig.DEBUG) {
            Timber.plant(new Timber.DebugTree());
        }
    }
}
