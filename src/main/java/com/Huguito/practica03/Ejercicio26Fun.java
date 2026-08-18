package com.Huguito.practica03;

import java.util.Random;

public class Ejercicio26Fun {


    int[] arra ;


    public Ejercicio26Fun() {
        int tama = ole(8,20);
        this.arra = new int[tama];

        relle(1,100);
    }


    public static int ole(int min, int max){
        Random random = new Random();
        return random.nextInt(min, max + 1);
    }

    public void relle( int min, int max){
        for(int i = 0; i < this.arra.length; i++){
            this.arra[i] = ole(min,max);
        }
    }

    public void mostrar(){
        System.out.print("Elementos del array: ");
        for(int numero : this.arra){
            System.out.print(numero + " ");
        }

        System.out.println();
        System.out.println("tamaño del array: " + this.arra.length);

    }


}
