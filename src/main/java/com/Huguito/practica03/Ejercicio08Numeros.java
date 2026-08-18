package com.Huguito.practica03;

public class Ejercicio08Numeros {

    public void nume(){
        for(int i = 1; i <= 100; i++){
            if(i % 2 == 0 && i % 3 == 0){
                System.out.println("El numero es " + i);
            }
        }
    }
}
