package com.mediummg.grouprecyclerview.models;

import java.util.ArrayList;

/**
 * Created by MediumMG on 22.02.2016.
 */
public class LibraryYear {

    private long mId;
    private int mYear;
    private ArrayList<LibraryContact> mBirthdayMen = new ArrayList<>();

    public LibraryYear(int year) {
        mId = year;
        mYear = year;
    }

    // REQUIRED
    public long getId() {
        return mId;
    }

    public int getYear() {
        return mYear;
    }

    public ArrayList<LibraryContact> getBirthdayMen() {
        return mBirthdayMen;
    }

    public void addBirthdayMen(LibraryContact birthdayMan) {
        mBirthdayMen.add(birthdayMan);
    }
}
