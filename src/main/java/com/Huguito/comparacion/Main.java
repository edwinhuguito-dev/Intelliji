package com.Huguito.comparacion;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args){

        ArrayList<Car> ca = new ArrayList<Car>();

        ca.add(new Car("BMW", "X5", 1990));
        ca.add(new Car("Honda", "Accord", 2006));
        ca.add(new Car("Ford", "Mustang", 1970));


        Collections.sort(ca, (obj1, obj2) -> {
           Car a = (Car) obj1;
           Car b = (Car) obj2;

           if(a.year < b.year) return -1;
           if(a.year > b.year) return 1;
           return 0;
        });


        for(Car c : ca){
            System.out.println(c.brand + " || " + c.model + " || " + c.year);
        }

    }
}
