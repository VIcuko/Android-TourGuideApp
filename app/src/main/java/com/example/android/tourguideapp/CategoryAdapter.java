package com.example.android.tourguideapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Vicuko on 25/7/17.
 */

public class CategoryAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new MonumentsFragment();
        } else if (position == 1) {
            return new RestaurantsFragment();
        } else if (position == 2) {
            return new EventsFragment();
        } else {
            return new NightlifeFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.tab_option_1);
        } else if (position == 1) {
            return mContext.getString(R.string.tab_option_2);
        } else if (position == 2) {
            return mContext.getString(R.string.tab_option_3);
        } else {
            return mContext.getString(R.string.tab_option_4);
        }
    }
}
