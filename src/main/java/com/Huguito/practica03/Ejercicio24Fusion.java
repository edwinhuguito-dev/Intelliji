package com.Huguito.practica03;

import java.util.Scanner;

public class Ejercicio24Fusion {

    private int[] number1;
    private int[] number2;
    private int[] number3;


    public Ejercicio24Fusion() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la longitud del primer array.");
        int uno = scanner.nextInt();
        System.out.println("Ingrese la longitud del segundo array.");
        int dos = scanner.nextInt();

        scanner.nextLine();

        this.number1 = new int[uno];
        this.number2 = new int[dos];
    }


    public void llenar(){
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < this.number1.length;  i++){
            System.out.println("Ingrese el primer elemento del array 1 ");
            this.number1[i] = scanner.nextInt();
        }
        for(int j = 0; j < this.number2.length; j++){
            System.out.println("Ingrese el primer elemento del array 2 ");
            this.number2[j] = scanner.nextInt();
        }

    }

    private int[] fusion() {
        this.number3 = new int[this.number1.length + this.number2.length];
        int ini = 0;
        int fin = this.number3.length - 1;

        for(int i = 0; i < this.number1.length; i++){
            this.number3[i] = this.number1[i];
            ini ++;
        }

        for(int p = this.number2.length - 1; p >= 0; p--){
            this.number3[fin] = this.number2[p];
            fin --;
        }

        return this.number3;
    }

    public void mostrar(){
        int[] resultado = fusion();
        for(int i = 0; i < resultado.length; i++){

            System.out.println("Elemento de la posicion " + i + ": " + resultado[i]);
        }
    }



}
