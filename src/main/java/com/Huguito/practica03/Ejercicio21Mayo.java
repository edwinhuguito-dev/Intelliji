package com.Huguito.practica03;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio21Mayo {

    private int[] longi;

    public Ejercicio21Mayo(int longi) {
        if(!(longi > 2)){
            System.out.println("Ingrese un mumero igual o mayor a 2");
            this.longi = new int[0];
            return;
        }

        this.longi = new int[longi];

        Random random = new Random();

        for(int i = 0; i < this.longi.length; i++){
            this.longi[i] = random.nextInt(100)+1;
        }
    }

    public String min(){
        int minimo = this.longi[0];
        int maximu = this.longi[0];

        for(int i = 1; i < this.longi.length; i++){

            if(this.longi[i] < minimo){
                minimo = this.longi[i];
            }
            if(this.longi[i] > maximu){
                maximu = this.longi[i];
            }
        }
        return "El valor minimo es: " + minimo + " y el maximo es: " + maximu;
    }

    public void num(){
        for(int i = 0; i < this.longi.length; i++){
            System.out.println(this.longi[i] + " ");
        }
    }



}
