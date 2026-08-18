package com.Huguito.practica03;

import java.util.Scanner;

public class Ejercicio23Capicua {

    private int [] array;

    public Ejercicio23Capicua() {
        this.array = crea();
    }

    private int[] crea(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa la longitud de posiciones.");
        int longi = scanner.nextInt();
        scanner.nextLine();

        int arra[] = new int[longi];

        for(int i = 0; i < arra.length; i++){
            System.out.println("Ingresa el primer dato: " + (i + 1));
            arra[i] = scanner.nextInt();
        }

        return arra;
    }

    public void check(){

        int izqui = 0; //this.array[0];
        int dere = this.array.length -1;   //this.array[(this.array.length) - 1];
        boolean isCapicua = true;

        while(izqui <= dere) {
            if (this.array[izqui] != this.array[dere]) {
                isCapicua = false;
                break;
            }
            izqui++;
            dere--;
        }
        if(!isCapicua){
            System.out.println("El array NO ES CAPICUA");
        }
        if(isCapicua){
            System.out.println("El array SI ES CAPICUA");
        }

    }




}
