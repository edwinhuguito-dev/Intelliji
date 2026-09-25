package com.Huguito.especial;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> mi = new ArrayList<Integer>();
        mi.add(33);
        mi.add(6);
        mi.add(11);
        mi.add(17);
        mi.add(35);
        mi.add(8);
        mi.add(12);


        Comparator compa = new SortEvenFirst();
        Collections.sort(mi, compa);


        for(int i : mi){
            System.out.println(i);
        }


    }

}
