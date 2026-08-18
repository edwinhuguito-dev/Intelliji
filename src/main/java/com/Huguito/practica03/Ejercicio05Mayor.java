package com.Huguito.practica03;

public class Ejercicio05Mayor {

    private double numero1;
    private double numero2;
    private double numero3;

    public Ejercicio05Mayor(double numero1, double numero2, double numero3) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.numero3 = numero3;
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public double getNumero3() {
        return numero3;
    }

    public void setNumero3(double numero3) {
        this.numero3 = numero3;
    }


    public String number (){
        if(this.numero1 > this.numero2 && this.numero1 > this.numero3) { return "El numeor mayor es: " + this.numero1; }
        if(this.numero2 > this.numero1 && this.numero1 > this.numero3) { return "El numeor mayor es: " + this.numero2; }

        return "el numero mayor es: " + this.numero3;
    }



}