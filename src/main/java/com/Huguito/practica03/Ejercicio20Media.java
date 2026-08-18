package com.Huguito.practica03;

import java.util.Random;

public class Ejercicio20Media {

    private int[] cuadra;

    public Ejercicio20Media(int longi) {
        if(longi <= 0){
            System.out.println("El numero debe ser mayor a 0.");
            this.cuadra  = new int[0];
            return;
        }

        this.cuadra = new int[longi];

        Random random = new Random();

        for(int i = 0; i < this.cuadra.length; i++){
            this.cuadra[i] = random.nextInt(100) + 1;
        }
    }

    public int obtenerSuma(){

        int suma = 0;
        for(int p : this.cuadra){
            suma += p;
        }
        return suma;
    }

    public double obtenerMedia(){
        if(this.cuadra.length == 0){
            return 0;
        }
        int sumaTotal = obtenerSuma();
        return (double) sumaTotal / this.cuadra.length;
    }

    public void indi(){
        for(int i = 0; i < this.cuadra.length; i++){
            System.out.print(this.cuadra[i] + " ");
        }
        System.out.println(" ");
    }



}
