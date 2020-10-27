package com.example.tourapp.ui.main;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.tourapp.Fun_Fragment;
import com.example.tourapp.Landmarks_Fragment;
import com.example.tourapp.Museums_Fragment;
import com.example.tourapp.Parks_Fragment;
import com.example.tourapp.R;
import com.example.tourapp.Shopping_Fragment;

public class SectionsPagerAdapter extends FragmentPagerAdapter {
    private final Context mContext;
    private CharSequence title;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
        switch (position) {
            case 0:
                return new Museums_Fragment();
            case 1:
                return new Fun_Fragment();
            case 2:
                return new Landmarks_Fragment();
            case 3:
                return new Parks_Fragment();
            case 4:
                return new Shopping_Fragment();
        }
        return new Shopping_Fragment();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        title = "";
        switch (position) {
            case 0:
                title = mContext.getResources().getString(R.string.museum);
                break;
            case 1:
                title = mContext.getResources().getString(R.string.fun);
                break;
            case 2:
                title = mContext.getResources().getString(R.string.landmarks);
                break;
            case 3:
                title = mContext.getResources().getString(R.string.parks);
                break;
            case 4:
                title = mContext.getResources().getString(R.string.shopping);
                break;
        }

        return title;
    }

    @Override
    public int getCount() {
        // Show 5 total pages.
        return 5;
    }
}