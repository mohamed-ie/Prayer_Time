package com.example.prayertime.ui.splash;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.prayertime.R;
import com.example.prayertime.databinding.FragmentSplashBinding;
import com.example.prayertime.domain.base.BaseFragment;


public class SplashFragment extends BaseFragment<FragmentSplashBinding> {

    @Override
    protected int getLayoutResource() {
        return R.layout.fragment_splash;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        if (savedInstanceState == null)
            new Handler(Looper.getMainLooper()).postDelayed(() -> navigateTo(R.id.locationFragment), 2500L);
    }

}