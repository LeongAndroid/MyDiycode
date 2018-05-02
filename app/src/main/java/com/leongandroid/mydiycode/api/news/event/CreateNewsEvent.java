package com.leongandroid.mydiycode.api.news.event;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.leongandroid.mydiycode.api.base.event.BaseEvent;
import com.leongandroid.mydiycode.api.news.bean.New;

/**
 * Created by issuser on 2018/4/27.
 */

public class CreateNewsEvent extends BaseEvent<New> {

    public CreateNewsEvent(@Nullable String uuid) {
        super(uuid);
    }

    public CreateNewsEvent(@Nullable String uuid,
                           @NonNull Integer code, @Nullable New aNew) {
        super(uuid, code, aNew);
    }
}
