package com.example.prayertime.domain.base;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.IdRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;

import com.example.prayertime.R;

public abstract class BaseFragment<B extends ViewDataBinding> extends Fragment {

    protected B binding;

    @LayoutRes
    protected abstract int getLayoutResource();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater,getLayoutResource(),container,false);
        return binding.getRoot();
    }


}
