package com.example.prayertime;

import android.app.Application;

import com.example.prayertime.di.AppContainerImpl;
import com.example.prayertime.domain.di.AppContainer;

public class MainApp extends Application {
    public AppContainer appContainer = new AppContainerImpl(this);
}
