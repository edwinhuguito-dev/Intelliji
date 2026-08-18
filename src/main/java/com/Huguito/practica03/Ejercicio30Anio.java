package com.Huguito.practica03;

import java.util.Scanner;

public class Ejercicio30Anio {

    public void anos(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un mes del año.");
        String inpu = scanner.nextLine();

        try{
            Ejercicio30Meses mes = Ejercicio30Meses.valueOf(inpu);

            if(mes == Ejercicio30Meses.FEBRERO) {
                System.out.println("Ingresa el año para saber si es bisiesto");
                int ano = scanner.nextInt();


                boolean esBisiesto = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);

                int diasFebrero = Integer.parseInt(mes.getMeses());

                if(esBisiesto){
                    diasFebrero += 1;
                }
                System.out.println("el mes tiene: " + diasFebrero);

            } else{
                System.out.println("El mes de " + mes + " tiene " + mes.getMeses() + " dias.");
            }

        } catch (IllegalArgumentException e){
            System.out.println("Error: El mes ingresado es invalido");
        }
    }
}
