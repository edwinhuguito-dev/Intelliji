package com.Huguito.builder;

public class BuilderDirector {

    private BuilderCasa builder; // se pasa como parametro el constructor de CASA



    // AL constructor recibe como parametro un objeto tipo  BUILDERCASAS
    // como parametro
    public BuilderDirector(BuilderCasa builder){
        this.builder = builder;
    }

    // para cambiar el constructor
    public void cambiarBuilder(BuilderCasa builder){
        this.builder = builder;
    }

    // casa con material,garage sin piscina

    public void construirCasaDosPisosMaterial(){
        builder.reiniciar();
        builder.construirEstructura("material");
        builder.construirPisos(2);
        builder.construirPiscina(false);
        builder.construirGarage(true);
        builder.construirJardin(true);
        builder.agregarExtra("Balcon");
    }


    public void casaSimple(){
        builder.reiniciar();
        builder.construirEstructura("madera");
        builder.construirPisos(1);
        builder.construirPiscina(true);
        builder.construirGarage(true);
        builder.construirJardin(true);
        builder.agregarExtra("Deck alrededor de la piscina");
    }






}
