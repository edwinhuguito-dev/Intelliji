package com.Huguito.poo.problem14;

import java.util.TreeSet;

public class MainNaves {
    public static void main(String[] args) {
        System.out.println("===== INICIANDO SISTEMA DE DEFENSA ORBITAL =====");

        TreeSet<String> misiles = new TreeSet<>();
        misiles.add("Misil thermico ALPHA");
        misiles.add("Misil de prothones OMEGA");
        misiles.add("Misil de EPM GAMMA");


        EstacionEspacial esta1 = new EstacionComando("CMD-01", 80, true, 50);
        EstacionEspacial esta2 = new EstacionArmada("ARM-02", 90, true, misiles);

        try {
            System.out.println("-------- Probando Estacion de comando ------");
            esta1.iniciarProtocoloDefensa();
        } catch (GalaticSystemException e) {
            System.out.println("Error" + e.getMessage());
        }

        System.out.println();

        try {
            System.out.println("---------- Probando estacion Armada ---------");
            esta2.iniciarProtocoloDefensa();
        } catch (GalaticSystemException e) {
            System.out.println("Error" + e.getMessage());
        }

        System.out.println();

        try {
            System.out.println("----------- Probando Fallo de escudo ------------");
            EstacionEspacial estacionFallida = new EstacionComando("CMD-99", 10, false, 2);
            estacionFallida.iniciarProtocoloDefensa();
        } catch (GalaticSystemException e) {
            System.out.println("Error" + e.getMessage());
        }

        System.out.println();

    }

        private static void imprimirError(GalaticSystemException e){
            System.out.println("----- ERROR GALACTICO CAPTURADO -----");
            System.out.println("CODIGO ERROR " + e.getCodigoError());
            System.out.println("MENSAJE " + e.getMessage());
            System.out.println("TIMESTAMP " + e.getTimestamp());

        }
}
