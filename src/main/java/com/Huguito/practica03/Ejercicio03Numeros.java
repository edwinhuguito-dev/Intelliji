package com.Huguito.practica03;

public class Ejercicio03Numeros {

    private int numero1;
    private int numero2;



    public Ejercicio03Numeros(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;

    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public String getResualtado() {
        if(getNumero1() % getNumero2() != 0){
            return "No es divisible";
        }
        return "Si es divisible";
    }

}
