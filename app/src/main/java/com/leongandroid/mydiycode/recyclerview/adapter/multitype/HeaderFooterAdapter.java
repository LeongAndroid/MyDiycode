package com.leongandroid.mydiycode.recyclerview.adapter.multitype;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.leongandroid.mydiycode.recyclerview.adapter.base.RecyclerViewHolder;

import java.util.ArrayList;
import java.util.List;

public class HeaderFooterAdapter extends RecyclerView.Adapter<RecyclerViewHolder> {






    private List<Object> mItems = new ArrayList<>();

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {



        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }
}
