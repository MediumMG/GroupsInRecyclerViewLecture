package com.mediummg.grouprecyclerview.own;

import java.util.ArrayList;

/**
 * Created by MediumMG on 22.02.2016.
 */
public class OwnYear extends OwnBase {

    private int mYear;
    private ArrayList<OwnContact> mBirthdayMen = new ArrayList<>();
    private boolean mExpanded;

    public OwnYear(int year) {
        mYear = year;
        mViewType = VIEW_TYPE_GROUP;
        mExpanded = false;
    }

    public int getYear() {
        return mYear;
    }

    public ArrayList<OwnContact> getBirthdayMen() {
        return mBirthdayMen;
    }

    public void addBirthdayMen(OwnContact birthdayMan) {
        mBirthdayMen.add(birthdayMan);
    }

    public boolean isExpanded() {
        return mExpanded;
    }

    public void setExpanded(boolean expanded) {
        this.mExpanded = expanded;
    }
}
