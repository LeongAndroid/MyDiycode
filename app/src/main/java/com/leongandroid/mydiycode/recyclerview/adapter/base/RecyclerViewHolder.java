package com.leongandroid.mydiycode.recyclerview.adapter.base;

import android.support.v7.widget.RecyclerView.ViewHolder;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;

public class RecyclerViewHolder extends ViewHolder{

    private View mRootView;
    private final SparseArray<View> mViews = new SparseArray<View>();


    public RecyclerViewHolder(View itemView) {
        super(itemView);
        mRootView = itemView;
    }

    private <T extends View> T bindView(int id) {
        T view = (T) mViews.get(id);
        if (view == null) {
            view = (T) mRootView.findViewById(id);
            mViews.put(id, view);
        }
        return view;
    }

    public <T extends View> T get(int id) {
        return (T) bindView(id);
    }

    public void setOnClickListener(View.OnClickListener l, int... ids) {
        if (ids == null) {
            return;
        }
        for (int id : ids) {
            get(id).setOnClickListener(l);
        }
    }

    public void setText(int id, String text) {
        TextView textView = get(id);
        textView.setText(text);
    }


}
