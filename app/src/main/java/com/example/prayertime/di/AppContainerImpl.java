package com.example.prayertime.di;

import android.content.Context;

import com.example.prayertime.domain.di.AppContainer;

public class AppContainerImpl implements AppContainer {
    private final Context context;

    public AppContainerImpl(Context context) {
        this.context = context;
    }

}
