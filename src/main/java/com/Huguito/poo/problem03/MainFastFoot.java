package com.Huguito.poo.problem03;

import java.util.ArrayList;

public class MainFastFoot {
    public static void main(String[] args){

        ArrayList<Platillo> menu = new ArrayList<>();
        menu.add(new ComidaRapida("Arroz con pollo", 40));
        menu.add(new Bebida("Limonada", 5, 1));
        menu.add(new ComidaRapida("Ceviche", 50));
        menu.add(new Bebida("Chicha", 6 ,1));


        Repartidor repartidor = new Repartidor("Huguito", "4x4");

        for(Platillo plato : menu){
            plato.preparar();

            repartidor.entregarPedido(plato);

        }















    }
}
