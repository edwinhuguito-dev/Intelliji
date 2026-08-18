package com.Huguito.poo;

import java.util.Scanner;

public class Ejercicio03Emple {

    private String dni;
    private String nombre;
    private int edad;
    private Ejercicio03Area depa;
    private boolean teletra;
    private String empresa;
    private double sBase;
    private double sueldo;



    public Ejercicio03Emple(String dni, String nombre, int edad, Ejercicio03Area depa, boolean teletra, String empresa, double sBase) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.depa = depa;       // Ahora sí viene del parámetro
        this.teletra = teletra;
        this.empresa = empresa;
        this.sBase = sBase;

        // El sueldo NO debe ir aquí, llámalo para que se calcule solo
        this.sueldo = suel();
    }

    public String createDni(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la primera letra de su DNI");
        String inpu = scanner.nextLine();

        if(inpu.length() != 1 ){
            System.out.println("Ingrese solo 01 letras");
            return null;
        }
        System.out.println("Ahora ingrese los 07 numeros de su DNI ");
        String num = scanner.nextLine();

        if(num.length() != 7){
            System.out.println("Error el DNI debe ser 07 numeros");
            return null;
        }
            this.dni = inpu + num;
        return this.dni;
    }

    public double suel(){

        double bono = switch (this.depa) {
            case CONTABILIDAD -> 50;
            case INFORMATICA -> 80;
            case DIRECCION -> 100;
            default -> 0;
        };

        double estraTele = 0;

        if(this.teletra){
            estraTele = 30;
        }

        this.sueldo = this.sBase + bono + estraTele;
        return this.sueldo;
    }




}
