package com.Huguito.practica03;

public enum Ejercicio06enum {

    DIVISION("/"),
    MULTIPLICACION("*"),
    RESTA("-"),
    SUMA("+"),
    ;


    Ejercicio06enum(String signo) {
        this.operacion = signo;
    }

    private String operacion;

    public String getOperacion(){
        return operacion;
    }

}
