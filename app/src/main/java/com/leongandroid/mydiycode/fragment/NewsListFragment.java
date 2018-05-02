package com.leongandroid.mydiycode.fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.leongandroid.mydiycode.adapter.NewsAdapter;
import com.leongandroid.mydiycode.fragment.base.RefreshRecyclerFragment;
import com.scwang.smartrefresh.layout.api.RefreshLayout;

import java.util.ArrayList;
import java.util.List;


public class NewsListFragment extends RefreshRecyclerFragment {
    List<String> mList = new ArrayList<>();
    NewsAdapter mNewsAdapter = null;
    public static NewsListFragment newInstance() {
        Bundle args = new Bundle();
        NewsListFragment fragment = new NewsListFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void initData() {
        mList.add("zhoupeiju");
        mList.add("liangjinhua");
        mList.add("liangjinling");
        mNewsAdapter = new NewsAdapter(mList);
        mNewsAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                Toast.makeText(getActivity(), "onItemClick" + position, Toast.LENGTH_SHORT).show();
            }
        });
        mNewsAdapter.setOnItemLongClickListener(new BaseQuickAdapter.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(BaseQuickAdapter adapter, View view, int position) {
                Toast.makeText(getActivity(), "onItemLongClick" + position, Toast.LENGTH_SHORT).show();
                return false;
            }
        });
        recyclerView.setAdapter(mNewsAdapter);
    }

    @Override
    public void onRefrsh(RefreshLayout refreshlayout) {
        mNewsAdapter.addData("xxxxxx");
        mNewsAdapter.addData("zzzzzz");
        refreshlayout.finishRefresh();
    }

    @Override
    public void loadMore(RefreshLayout refreshlayout) {
        refreshlayout.finishLoadMore();
    }


}
