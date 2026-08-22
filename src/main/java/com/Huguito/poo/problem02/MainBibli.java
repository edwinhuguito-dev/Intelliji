package com.Huguito.poo.problem02;

import java.util.ArrayList;

public class MainBibli {
    public static void main(String[] args){

        ArrayList<ItemBi> inventario = new ArrayList<>();

        inventario.add(new Libro("Los gallinazso", "ab123", "Huguito - El maspendejo de la muni", 500));
        inventario.add(new Revista("Novedades", "123lkj22", 540, "Junuary"));

        for(ItemBi pres  : inventario) {
            pres.mostrarInfo();

            try {
                pres.prestarItem();
                System.out.println("Prestado con exito " + pres.titulo);

                pres.prestarItem();
            } catch (IllegalArgumentException e) {
                System.out.println("Error" + e.getMessage());
            }


        }

    }
}
