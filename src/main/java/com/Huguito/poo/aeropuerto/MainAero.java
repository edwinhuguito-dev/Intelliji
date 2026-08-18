package com.Huguito.poo.aeropuerto;

public class MainAero {
    public static void main(String[] args){

        AeroPublic ap = new AeroPublic("JORGE CHAVEZ", 2026, 3000, 200000, 30);
        AeroPri pri = new AeroPri("ALAS PERUANAS", 2000, 2000, 10);


        System.out.println(ap);
        System.out.println(pri);

        ap.ganacia(1000);
        pri.ganacia(1200);


    }
}
