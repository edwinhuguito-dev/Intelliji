package com.Huguito.practica02;

public class Bucle {
    public static void main(String[] args) {

        int[] datos = new int[200];

        for (int i = 0; i < datos.length; i++) {

            datos[i] = (int) (Math.random() * 100);

        }

        for (int elem : datos) System.out.print(elem + " ");


    }
}