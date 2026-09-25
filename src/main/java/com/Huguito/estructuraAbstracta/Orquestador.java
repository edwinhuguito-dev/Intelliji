package com.Huguito.estructuraAbstracta;

public class Orquestador {
    private Servidor server;
    private Disco disco;
    private Red red;

    public Orquestador(FabricaCloud cloud){
        this.server = cloud.crearServer();
        this.disco = cloud.crearDisco();
        this.red = cloud.crearRed();
    }

    public void desplegarEntorno(){
        System.out.println("==== INICIANDO DESPLIEGUE EN LA NUBE ====");

        red.aislar();

        disco.encriptar();

        server.conectar(red);

        server.montar(disco);


        server.iniciar();

        System.out.println("==== ENTORNO DEPLOYADO CON EXITO ====");


    }
}
