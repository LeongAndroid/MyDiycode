package com.leongandroid.mydiycode.fragment;

import android.os.Bundle;

import com.leongandroid.mydiycode.fragment.base.RefreshRecyclerFragment;

public class SitesListFragment extends RefreshRecyclerFragment {

    public static SitesListFragment newInstance() {
        Bundle args = new Bundle();
        SitesListFragment fragment = new SitesListFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void initData() {

    }

}
