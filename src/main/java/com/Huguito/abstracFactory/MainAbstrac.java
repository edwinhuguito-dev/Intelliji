package com.Huguito.abstracFactory;

public class MainAbstrac {
    public static void main(String[] args){

        Fabrica f1 = new FabricaMod();
        Silla s1 = f1.crearSilla();
        Mesa m1 = f1.crearMesa();


        s1.sentar();
        m1.usar();

        System.out.println();

        Fabrica f2 = new FabricaRetro();
        Silla s2 = f2.crearSilla();
        Mesa m2 = f2.crearMesa();


        s2.sentar();
        m2.usar();

    }
}
