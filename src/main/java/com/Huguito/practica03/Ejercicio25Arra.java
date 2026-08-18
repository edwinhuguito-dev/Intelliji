package com.Huguito.practica03;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio25Arra {

   private char[] inpu;

    public Ejercicio25Arra() {

        Random random = new Random();

        int longi = random.nextInt(5,150);

        this.inpu = new char[longi];

        for(int i = 0; i < this.inpu.length; i++){

            this.inpu[i] = (char)random.nextInt(0,255);
        }
    }


    public String charac(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese solo un caracter.");
        String entrada = scanner.nextLine();

        if(entrada.isEmpty()){
            return "No ingresaste ningur caracter.";
        }
        char cli = entrada.charAt(0);

        for(char j : this.inpu){
            if(cli == j){
                return "Si hay un caracter: " + cli +  " en el array";
            }
        }
        return "NO hay coincidencias";
    }
}
