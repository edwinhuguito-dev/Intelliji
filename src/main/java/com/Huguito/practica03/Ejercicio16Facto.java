package com.Huguito.practica03;

import java.util.Scanner;

public class Ejercicio16Facto {

    private int number;

    public Ejercicio16Facto(int number) {
        this.number = number;
    }

    public int fator() {

        int facto = 1;
    for(int i = 1; i <= this.number; i++){

        facto *= i;


    }
    return facto;

    }

}
