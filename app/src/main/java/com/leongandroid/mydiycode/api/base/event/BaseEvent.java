package com.leongandroid.mydiycode.api.base.event;


import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

public class BaseEvent<T> {
    protected String uuid = "";         // 通用唯一识别码 (Universally Unique Identifier)
    protected boolean ok = false;       // 是否获取实体数据(T)成功
    protected Integer code = -1;        // 状态码
    protected T t;                      // 实体类

    public BaseEvent(@Nullable String uuid) {
        this.ok = false;
        this.uuid = uuid;
    }
    public BaseEvent(@Nullable String uuid, @NonNull Integer code, @Nullable T t) {
        this.ok = null != t;
        this.uuid = uuid;
        this.code = code;
        this.t = t;
    }
    public BaseEvent setEvent(@NonNull Integer code, @Nullable T t) {
        this.ok = null != t;
        this.code = code;
        this.t = t;
        return this;
    }
    public boolean isOk() {
        return ok;
    }
    public T getBean() {
        return t;
    }
    public String getUUID() {
        return uuid;
    }
    public Integer getCode() {
        return code;
    }

}
