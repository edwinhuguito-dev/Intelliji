package com.Huguito.practica03;

import java.util.Scanner;

public class Ejercicio15Adivina {

    public void jugar(){

        Scanner scanner = new Scanner(System.in);
        int ale = (int)(Math.random()*100) + 1;
        boolean adivino = false;


        for(int contador = 1; contador <= 5; contador++){

            System.out.println("Intento Nº " + contador + " ingrese un numero.");
            int input = scanner.nextInt();
            if(input < ale){
                System.out.println("Es mas arriba");
            } else if(input > ale){
                System.out.println("Es mas abajo");
            } else{
                System.out.println("Adivinaste");
                adivino = true;
                break;
            }
        }
        if(!adivino) {
            System.out.println("El juego acabo T-T");
        }
        scanner.close();
    }
}
