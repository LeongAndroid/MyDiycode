package com.leongandroid.mydiycode.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.leongandroid.mydiycode.fragment.NewsListFragment;
import com.leongandroid.mydiycode.fragment.SitesListFragment;
import com.leongandroid.mydiycode.fragment.TopicListFragment;

public class MainViewPagerAdapter extends FragmentPagerAdapter {

    public MainViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new TopicListFragment();
            case 1:
                return new NewsListFragment();
            case 2:
                return new SitesListFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "topics";
            case 1:
                return "news";
            case 2:
                return "sites";
            default:
                return null;
        }
    }
}
