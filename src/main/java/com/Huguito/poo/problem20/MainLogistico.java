package com.Huguito.poo.problem20;

public class MainLogistico {
    public static void main(String[] args){

        CentroLogistico centro = new CentroLogistico();


        Liquidable unidad1 = new CamionPesado("cam001", 4, 100);
//        Liquidable unidad2 = new FurgonUrbano("furgo001", 2.0, true);
        Liquidable unidad3 = new TractoCamion("trac001", 500, 10.0);


        centro.orquestar(unidad1,50, 25);

//        centro.orquestar(unidad2, 100, 4);

        centro.orquestar(unidad3,80,9);

    }
}
