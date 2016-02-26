package com.mediummg.grouprecyclerview.own;

import org.joda.time.DateTime;

/**
 * Created by MediumMG on 22.02.2016.
 */
public class OwnContact extends OwnBase{

    private String mName;
    private DateTime mDOB;

    public OwnContact(String name, DateTime dob) {
        mName = name;
        mDOB = dob;
        mViewType = VIEW_TYPE_CHILD;
    }

    public String getName() {
        return mName;
    }

    public DateTime getDOB() {
        return mDOB;
    }
}
