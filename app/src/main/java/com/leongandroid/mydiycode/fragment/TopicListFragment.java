package com.leongandroid.mydiycode.fragment;

import android.os.Bundle;

import com.leongandroid.mydiycode.adapter.TopicAdapter;
import com.leongandroid.mydiycode.fragment.base.RefreshRecyclerFragment;
import com.scwang.smartrefresh.layout.api.RefreshLayout;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LeongAndroid on 2018/4/9.
 */

public class TopicListFragment extends RefreshRecyclerFragment {

    List<String> mList = new ArrayList<>();
    TopicAdapter mTopicAdapter = null;
    public static TopicListFragment newInstance() {
        Bundle args = new Bundle();
        TopicListFragment fragment = new TopicListFragment();
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public void onRefrsh(RefreshLayout refreshlayout) {
        mList.add("wwwww");
        mList.add("yyyyyy");
        mTopicAdapter.setList(mList);
        refreshlayout.finishRefresh();
    }

    @Override
    public void loadMore(RefreshLayout refreshlayout) {
        refreshlayout.finishLoadMore();
    }

    @Override
    public void initData() {
        mList.add("liangjunming");
        mList.add("liangyijia");
        mList.add("changweiting");
        mTopicAdapter = new TopicAdapter(getActivity(), mList);
        recyclerView.setAdapter(mTopicAdapter);
    }
}
