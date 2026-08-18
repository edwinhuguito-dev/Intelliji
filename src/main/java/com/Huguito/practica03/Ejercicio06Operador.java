package com.Huguito.practica03;

public class Ejercicio06Operador {

    private int number01;
    private int number02;
    private String signoOperacion;


    public Ejercicio06Operador(int number01, int number02, String signoOperacion) {
        this.number01 = number01;
        this.number02 = number02;
        this.signoOperacion = signoOperacion;
    }

    public int getNumber01() {
        return number01;
    }

    public void setNumber01(int number01) {
        this.number01 = number01;
    }

    public int getNumber02() {
        return number02;
    }

    public void setNumber02(int number02) {
        this.number02 = number02;
    }

    public String getSignoOperacion() {
        return signoOperacion;
    }

    public void setSignoOperacion(String signoOperacion) {
        this.signoOperacion = signoOperacion;
    }

    public String calculator(){
        boolean operadorValido = false;

        for(Ejercicio06enum op : Ejercicio06enum.values()) {
            if(op.getOperacion().equals(this.signoOperacion)) {
                operadorValido = true;
                break;
            }
        }


    if(!operadorValido){
        return "No se puede realizar la opracion, es invalida.";
    }
    if(this.signoOperacion.equals("/") && this.number02 == 0){
        return "No se puede realizar la operación, nose puede dividir entre 0";
    }

    if(this.signoOperacion.equals("+")){
        return "El resultado es: " + (this.number01 + this.number02);
    }

    if(this.signoOperacion.equals("-")){
        return "El resultado es: " + (this.number01 - this.number02);
    }

    if(this.signoOperacion.equals("*")){
        return "El resultado es: " + (this.number01 * this.number02);
    }

    if(this.signoOperacion.equals("/")){
        return "El resultado es: " + (this.number01 / this.number02);
    }

    return "Error inesperado.";

    }
}
