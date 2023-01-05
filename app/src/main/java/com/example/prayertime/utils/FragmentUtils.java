package com.example.prayertime.utils;

import android.content.Context;

import androidx.annotation.IdRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class FragmentUtils {

    public static void replace(FragmentManager fragmentManager,
                               @IdRes int containerResourceId,
                               Fragment fragment,
                               boolean addToBackStack) {
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        if (addToBackStack) {
            transaction.addToBackStack(fragment.getTag());
        }
        transaction
                .replace(containerResourceId, fragment, fragment.getTag())
                .commit();
    }

    public static void back(FragmentManager fragmentManager) {
        fragmentManager.popBackStack();
    }

}
