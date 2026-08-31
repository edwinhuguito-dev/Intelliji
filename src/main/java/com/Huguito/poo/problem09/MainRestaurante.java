package com.Huguito.poo.problem09;

import com.Huguito.revisionCarros.PesoInvalidoException;

public class MainRestaurante {
    public static void main(String[] args){

        Restaurante restaurante = new Restaurante();

        Cliente clain1 = new Cliente("cli001", "cliHuguito", "12345678", "Las sirenitas VIP");
        Plato pla1 = new Plato("pla001", "Caldo de gallina", 20.0, 30);
        Repartidor repo1 = new Repartidor("re001", "Keiko", "32165487", "moto");

        Cliente clain2 = new Cliente("cli002", "cliPepito", "987541",   "El troka");
        Plato pla2 = new Plato("pla002", "Arroz con Posho", 18.0, 25);
        Repartidor repo2 = new Repartidor("re002", "Fujimori", "9871291", "auto");


        clain1.mostrarPerfil();
        pla1.prepararItem();
        pla1.toString();
        repo1.mostrarPerfil();




        restaurante.registrarCliente(clain1);
        restaurante.agregarPlatoMenu(pla1);
        restaurante.registrarRepartidor(repo1);

        restaurante.registrarCliente(clain2);
        restaurante.agregarPlatoMenu(pla2);
        restaurante.registrarRepartidor(repo2);


        try{
            restaurante.procesarPedido("cli001", "pla001", "re001");

            repo1.entregarPedido();

        } catch (PesoInvalidoException e) {
            System.out.println("Erro de proseso" + e.getMessage());
        }

        System.out.println("------ REPARTIDOR OCUPADO--------");

        try{
            restaurante.procesarPedido("cli001", "pla001", "re001");


        } catch (PedidoNoValidoException e){
            System.out.println("Error" + e.getMessage());
        }





    }
}
