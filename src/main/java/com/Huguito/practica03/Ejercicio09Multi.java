package com.Huguito.practica03;

public class Ejercicio09Multi {

    private int number;

    public Ejercicio09Multi(int number) {
        this.number = number;
    }

    public void multiplos(){

        for(int i = 1; i <= 10; i++){
            System.out.println("El numero ingresado es: " + this.number + " y su multiplo: " + i + " es: " + this.number * i);
        }



    }




}
