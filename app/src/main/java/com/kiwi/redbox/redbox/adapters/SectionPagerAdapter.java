package com.kiwi.redbox.redbox.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.kiwi.redbox.redbox.fragments.NewWatchFragment;
import com.kiwi.redbox.redbox.fragments.WatchingFragment;

/**
 * Created by obrusvit on 24.6.17.
 */

public class SectionPagerAdapter extends FragmentPagerAdapter {


    public SectionPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:
                return new NewWatchFragment();
            case 1:
                return new WatchingFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 2;
    }
}
