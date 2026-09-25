package com.Huguito.comparator;

import java.util.Comparator;

public class SortByYear implements Comparator {


    @Override
    public int compare(Object o1, Object o2) {
        Car a = (Car) o1;
        Car b = (Car) o2;

        if(a.year < b.year) return -1;
        if(a.year > b.year) return 1;

        return 0;
    }
}
