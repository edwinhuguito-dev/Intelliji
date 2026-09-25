package com.Huguito.singleToon;

public class Main {
    public static void main(String[] args){
        // 1er modulo
        System.out.println("Modulo de Autenticacion");

        Configuration config1 = Configuration.getInstancia();

        config1.mostrarMensaje();

        // 2do moduclo
        System.out.println("Modulo de reportes");
        Configuration config2 = Configuration.getInstancia();
        config2.mostrarMensaje();


        // comprobacion

        System.out.println("Ambas referencia en memoria, son iguales?");
        System.out.println (config1 == config2);

    }
}
