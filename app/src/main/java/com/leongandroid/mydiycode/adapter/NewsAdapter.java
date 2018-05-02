package com.leongandroid.mydiycode.adapter;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.leongandroid.mydiycode.R;

import java.util.List;

/**
 * Created by LeongAndroid on 2018/4/26.
 */

public class NewsAdapter extends BaseQuickAdapter<String, BaseViewHolder> {

    public NewsAdapter(List<String> data) {
        super(R.layout.item_layout, data);
    }
    @Override
    protected void convert(BaseViewHolder helper, String item) {
        helper.setText(R.id.text_view, item);
    }
}
