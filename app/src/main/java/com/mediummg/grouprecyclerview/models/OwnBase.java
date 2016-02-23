package com.mediummg.grouprecyclerview.models;

/**
 * Created by MediumMG on 22.02.2016.
 */
public abstract class OwnBase {

    public static final int VIEW_TYPE_GROUP = 0;
    public static final int VIEW_TYPE_CHILD = 1;

    protected int mViewType = -1;

    public int getViewType() {
        return mViewType;
    }
}
