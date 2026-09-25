package com.Huguito.estructuraAbstracta;

public class MainServer {
    public static void main(String[] args){
        String proveedor = "AWS";

        FabricaCloud cloud;

        if(proveedor.equals("AWS")){
            cloud = new FabricaAws();
        } else {
            cloud = new FabricaAzu();
        }


        Orquestador api = new Orquestador(cloud);
        api.desplegarEntorno();


    }
}
