package com.Huguito.poo;

import java.util.Scanner;

public class Ejercicio02Compu {

    private String marca;
    private String modelo;
    private int ram;
    private int disco;
    private boolean encendido;

    Scanner scanner = new Scanner(System.in);

    public Ejercicio02Compu() {

    }

    public Ejercicio02Compu(int ram) {
        this.ram = ram;
    }

    public Ejercicio02Compu(int ram, int disco) {
        this.ram = ram;
        this.disco = disco;
    }

    public Ejercicio02Compu(int ram, String modelo, String marca) {

    }

    private int lleDis(String archivo, int peso){

        this.disco += peso;
        if(this.disco > 100){
            this.disco -= peso;
            System.out.println("No se puede ingresar el archivo: " + archivo + " supera la capacidad del disco");
            return this.disco;
        }
        if(this.disco >= 95 && this.disco <= 100){
            int libre = 100 - this.disco;
            System.out.println("Te queda espacio muy poco " + libre);
        }
        else if(this.disco >= 90){
            int libre = 100 - this.disco;
            System.out.println("Cuidado se esta llenando el disco " + libre);
        }
        else{
            System.out.println("Se ingreso correctamente el archivo " + archivo);
        }
        return this.disco;
    }

    private int elimi(int eli) {
        int libre = 100 - this.disco;
        if (eli > libre) {

            System.out.println("No puedes ingresar ese archivo, borra: " + (eli - libre));
        }
        return this.disco;
    }
}
