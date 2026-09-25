package com.Huguito.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args){
        ArrayList<Car> myCarrito = new ArrayList<Car>();

        myCarrito.add(new Car("BMW", "X5", 1999));
        myCarrito.add(new Car("Honda", "Acoord", 2006));
        myCarrito.add(new Car("Ford", "Mustang", 1970));


        Comparator myComparator = new SortByYear();
        Collections.sort(myCarrito, myComparator);


        for(Car c : myCarrito){
            System.out.println(c.brand + " || " + c.model + " || " + c.year);
        }







    }
}
