package com.leongandroid.mydiycode.fragment.base;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.leongandroid.mydiycode.R;
import com.leongandroid.mydiycode.base.ViewHolder;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.footer.ClassicsFooter;
import com.scwang.smartrefresh.layout.header.ClassicsHeader;
import com.scwang.smartrefresh.layout.listener.OnLoadMoreListener;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;

/**
 * Created by LeongAndroid on 2018/4/18.
 */

public abstract class RefreshRecyclerFragment extends BaseFragment {


    public RecyclerView recyclerView = null;



    @Override
    protected int getLayoutId() {
        return R.layout.fragment_refresh_recycler;
    }


    /**
     * 加载数初始化数据，可以从缓存或者其他地方加载，
     * 如果没有初始数据，一般调用 loadMore() 即可。
     *
     */
    public abstract void initData();


    @Override
    protected void initViews(ViewHolder holder, View root) {
        recyclerView = (RecyclerView)root.findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        RefreshLayout refreshLayout = (RefreshLayout)root.findViewById(R.id.refreshLayout);
        refreshLayout.setRefreshHeader(new ClassicsHeader(getActivity()));
        refreshLayout.setRefreshFooter(new ClassicsFooter(getActivity()));
        refreshLayout.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh(RefreshLayout refreshlayout) {
                onRefrsh(refreshlayout);
            }
        });
        refreshLayout.setOnLoadMoreListener(new OnLoadMoreListener() {
            @Override
            public void onLoadMore(RefreshLayout refreshlayout) {
                loadMore(refreshlayout);
            }
        });


        initData();
    }

    public void onRefrsh(RefreshLayout refreshlayout) {

    }
    public void loadMore(RefreshLayout refreshlayout) {

    }

}
