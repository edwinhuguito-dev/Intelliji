package com.Huguito.singleToon;

public class Configuration {
    // 3 PARTES DE UN SINGLETON
    // 1 VARIABLE STATICA = ES IGUAL A UNA CONSTANTE
    private static Configuration instancia;
    // 1 CLASE CON CONSTRUCTOR PRIVADO

    private Configuration(){
        System.out.println("Ininicializando configuracion del sistema");


    }
    // 1 METODO STATICO PUBLICO
    public static Configuration getInstancia(){
        if(instancia == null){
            instancia = new Configuration();
        }
        return instancia;
    }


    // 1 METODO PUBLICO
    public void mostrarMensaje(){
        System.out.println("Configuracion activa");
    }



}
