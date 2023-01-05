package com.example.prayertime.ui.splash;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.prayertime.R;
import com.example.prayertime.databinding.FragmentSplashBinding;
import com.example.prayertime.databinding.FragmentSplashBindingImpl;
import com.example.prayertime.domain.base.BaseFragment;
import com.example.prayertime.utils.FragmentUtils;


public class SplashFragment extends BaseFragment<FragmentSplashBinding> {

    @Override
    protected int getLayoutResource() {
        return R.layout.fragment_splash;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        new Handler(Looper.getMainLooper()).postDelayed(()->{

        },2000L);
    }

}