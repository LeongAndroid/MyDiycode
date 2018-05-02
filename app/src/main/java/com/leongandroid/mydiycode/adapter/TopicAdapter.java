package com.leongandroid.mydiycode.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.leongandroid.mydiycode.R;
import com.leongandroid.mydiycode.recyclerview.adapter.base.RecyclerViewHolder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LeongAndroid on 2018/4/25.
 */

public class TopicAdapter extends RecyclerView.Adapter<RecyclerViewHolder> {

    List<String> mList = new ArrayList<>();
    private final LayoutInflater mLayoutInflater;
    public TopicAdapter(Context context, List<String> list) {
        mLayoutInflater = LayoutInflater.from(context);
        mList = list;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mLayoutInflater.inflate(R.layout.item_layout, parent, false);
        return new RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        RecyclerViewHolder mHolder = (RecyclerViewHolder)holder;
        mHolder.setText(R.id.text_view, mList.get(position));
    }
    @Override
    public int getItemCount() {
        return mList.size();
    }
    public void setList(List<String> list) {
        notifyDataSetChanged();
    }


}
