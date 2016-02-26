package com.mediummg.grouprecyclerview.library;

import org.joda.time.DateTime;

/**
 * Created by MediumMG on 22.02.2016.
 */
public class LibraryContact {

    private long mId;
    private String mName;
    private DateTime mDOB;

    public LibraryContact(long id, String name, DateTime dob) {
        mId = id;
        mName = name;
        mDOB = dob;
    }

    // REQUIRED
    public long getId() {
        return mId;
    }

    public String getName() {
        return mName;
    }

    public DateTime getDOB() {
        return mDOB;
    }

}
