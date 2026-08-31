package com.Huguito.poo.problem13;

public class MainGalactic {
    public static void main(String[] args){

        CentroComandoGalactico gala = new CentroComandoGalactico();


        NaveExploracion explo1 = new NaveExploracion("explo001", "Huguito", 100, 200, 300, 400);
        NaveExploracion explo2 = new NaveExploracion("explo002", "Capitan Maricielo", 102, 190, 290, 450);

        NaveCombate comb1 = new NaveCombate("comb001", "Guerrero", 300, 400, 500, 500);
        NaveCombate comb2 = new NaveCombate("comb002", "Samurai", 310, 350, 600,450);



        gala.registrarNave(explo1);
        gala.registrarNave(explo2);

        gala.registrarNave(comb1);
        gala.registrarNave(comb2);

        gala.desplegarMision("Aniquilar zona sur", TipoMisiones.COMBATES, "comb001", "SUR", 400);




        MisionEspacial misi = new MisionEspacial("Conquistar el sector SUR", TipoMisiones.COMBATES, comb1, "ZonaSur" );
        misi.ejecutarMision(190);

        try{

            comb1.calcularPoderCombate();
            comb1.dipararMisil();
            misi.ejecutarMision(300);



        } catch (GalacticException e) {
            System.out.println("Error" + e.getMessage());
        }

        try{


        } catch (GalacticException e) {
            System.out.println("Error" + e.getMessage());
        }









    }


}
