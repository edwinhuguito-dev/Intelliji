package com.Huguito.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args){

        ArrayList<Car> mi = new ArrayList<Car>();

        mi.add(new Car("BMW", "D5" ,1999));
        mi.add(new Car("Honda", "Accord", 2006));
        mi.add(new Car("Ford", "Mustang", 1970));

        Collections.sort(mi);

        for(Car c : mi){
            System.out.println(c.brand + " || " + c.model + " || " + c.year);
        }






    }
}
