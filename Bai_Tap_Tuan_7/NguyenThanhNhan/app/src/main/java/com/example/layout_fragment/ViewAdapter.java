package com.example.layout_fragment;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.layout_fragment.Fragment.FragmentOne;
import com.example.layout_fragment.Fragment.FragmentTwo;


public class ViewAdapter extends FragmentStatePagerAdapter {
    public ViewAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new FragmentOne();

            case 1:
                return new FragmentTwo();

            default:
                return new FragmentOne();
        }
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title = "";
        switch (position) {
            case 0:
                title = "Fragment One";
                break;
            case 1:
                title = "Fragment Two";
                break;
        }

        return title;
    }
}
