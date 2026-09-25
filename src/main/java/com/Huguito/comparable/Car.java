package com.Huguito.comparable;

public class Car implements Comparable{

    public String brand;
    public String model;
    public int year;



    public Car(String b, String m, int y){
        this.brand = b;
        this.model = m;
        this.year = y;
    }


    @Override
    public int compareTo(Object o) {
        Car otro = (Car)o;
        return Integer.compare(this.year , otro.year);
    }

}
