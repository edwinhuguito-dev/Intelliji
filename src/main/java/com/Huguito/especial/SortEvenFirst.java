package com.Huguito.especial;

import java.util.Comparator;

public class SortEvenFirst implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {

        Integer a = (Integer) o1;
        Integer b = (Integer) o2;

        boolean aIsEven = (a % 2) == 0;
        boolean bIsEven = (b % 2) == 0;


        if(aIsEven == bIsEven){

            if(a < b) return -1;
            if(a > b) return 1;
            return  0;
        } else{
            if(aIsEven){
                return -1;
            }else{
                return 1;
            }
        }
    }
}
