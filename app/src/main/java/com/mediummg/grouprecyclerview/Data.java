package com.mediummg.grouprecyclerview;

import com.mediummg.grouprecyclerview.library.LibraryContact;
import com.mediummg.grouprecyclerview.library.LibraryYear;
import com.mediummg.grouprecyclerview.own.OwnBase;
import com.mediummg.grouprecyclerview.own.OwnContact;
import com.mediummg.grouprecyclerview.own.OwnYear;

import org.joda.time.DateTime;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by MediumMG on 22.02.2016.
 */
public class Data {

    public static ArrayList<LibraryYear> generateLibraryData() {
        ArrayList<LibraryYear> data = new ArrayList<>();
        AtomicLong mLong = new AtomicLong();

        LibraryYear year1980 = new LibraryYear(1980);
        LibraryYear year1981 = new LibraryYear(1981);
        LibraryYear year1982 = new LibraryYear(1982);
        LibraryYear year1983 = new LibraryYear(1983);

        year1980.addBirthdayMen(new LibraryContact(mLong.getAndIncrement(), "Ivanov A", new DateTime(1980, 1, 2, 0, 0)));
        year1980.addBirthdayMen(new LibraryContact(mLong.getAndIncrement(), "Petrov B", new DateTime(1980, 3, 22, 0, 0)));
        year1980.addBirthdayMen(new LibraryContact(mLong.getAndIncrement(), "Vasechkin C", new DateTime(1980, 6, 16, 0, 0)));

        year1981.addBirthdayMen(new LibraryContact(mLong.getAndIncrement(), "Ivanov D", new DateTime(1981, 2, 3, 0, 0)));
        year1981.addBirthdayMen(new LibraryContact(mLong.getAndIncrement(), "Petrov E", new DateTime(1981, 4, 23, 0, 0)));
        year1981.addBirthdayMen(new LibraryContact(mLong.getAndIncrement(), "Vasechkin F", new DateTime(1981, 7, 15, 0, 0)));

        year1982.addBirthdayMen(new LibraryContact(mLong.getAndIncrement(), "Ivanov G", new DateTime(1982, 3, 4, 0, 0)));
        year1982.addBirthdayMen(new LibraryContact(mLong.getAndIncrement(), "Petrov H", new DateTime(1982, 5, 24, 0, 0)));
        year1982.addBirthdayMen(new LibraryContact(mLong.getAndIncrement(), "Vasechkin J", new DateTime(1982, 8, 14, 0, 0)));

        year1983.addBirthdayMen(new LibraryContact(mLong.getAndIncrement(), "Ivanov K", new DateTime(1983, 4, 5, 0, 0)));
        year1983.addBirthdayMen(new LibraryContact(mLong.getAndIncrement(), "Petrov L", new DateTime(1983, 6, 25, 0, 0)));
        year1983.addBirthdayMen(new LibraryContact(mLong.getAndIncrement(), "Vasechkin M", new DateTime(1983, 8, 3, 0, 0)));

        data.add(year1980);
        data.add(year1981);
        data.add(year1982);
        data.add(year1983);

        return data;
    }

    public static ArrayList<OwnBase> generateOwnData(){
        ArrayList<OwnBase> data = new ArrayList<>();

        OwnYear year1980 = new OwnYear(1980);
        OwnYear year1981 = new OwnYear(1981);
        OwnYear year1982 = new OwnYear(1982);
        OwnYear year1983 = new OwnYear(1983);

        year1980.addBirthdayMen(new OwnContact("Ivanov A", new DateTime(1980, 1, 2, 0, 0)));
        year1980.addBirthdayMen(new OwnContact("Petrov B", new DateTime(1980, 3, 22, 0, 0)));
        year1980.addBirthdayMen(new OwnContact("Vasechkin C", new DateTime(1980, 6, 16, 0, 0)));

        year1981.addBirthdayMen(new OwnContact("Ivanov D", new DateTime(1981, 2, 3, 0, 0)));
        year1981.addBirthdayMen(new OwnContact("Petrov E", new DateTime(1981, 4, 23, 0, 0)));
        year1981.addBirthdayMen(new OwnContact("Vasechkin F", new DateTime(1981, 7, 15, 0, 0)));

        year1982.addBirthdayMen(new OwnContact("Ivanov G", new DateTime(1982, 3, 4, 0, 0)));
        year1982.addBirthdayMen(new OwnContact("Petrov H", new DateTime(1982, 5, 24, 0, 0)));
        year1982.addBirthdayMen(new OwnContact("Vasechkin J", new DateTime(1982, 8, 14, 0, 0)));

        year1983.addBirthdayMen(new OwnContact("Ivanov K", new DateTime(1983, 4, 5, 0, 0)));
        year1983.addBirthdayMen(new OwnContact("Petrov L", new DateTime(1983, 6, 25, 0, 0)));
        year1983.addBirthdayMen(new OwnContact("Vasechkin M", new DateTime(1983, 8, 3, 0, 0)));

        data.add(year1980);
        data.add(year1981);
        data.add(year1982);
        data.add(year1983);

        return data;
    }
}
