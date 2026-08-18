package com.Huguito.practica03;

public enum Ejercicio30Meses {

    ENERO ("31"),
    MARZO ("31"),
    MAYO ("31"),
    JULIO ("31"),
    AGOSTO ("31"),
    OCTUBRE ("31"),
    DICIEMBRE ("31"),

    ABRIL ("30"),
    JUNIO ("30"),
    SEPTIEMBRE ("30"),
    NOVIEMBRE ("30"),


    FEBRERO ("28"),
    ;


    Ejercicio30Meses(String meses) {
        this.meses = meses;
    }

    private String meses;

    public String getMeses(){

        return meses;
    }

}
