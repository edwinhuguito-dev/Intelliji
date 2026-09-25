package com.Huguito.builder;

public class MainBuilder {
    public static void main(String[] args){

        //builder concreto
        // director (opcional)
        // creando los objetos

        BuilderConcretoCasa builder = new BuilderConcretoCasa();

        BuilderDirector director = new BuilderDirector(builder);

        director.construirCasaDosPisosMaterial();
        Casa casa1 = builder.obternerResultado(); // ese builder es el de arriba que instanciasmos la clase
        System.out.println(casa1.toString());

        System.out.println("*******************************************+");

        director.casaSimple();
        Casa casa2 = builder.obternerResultado();
        System.out.println(casa2.toString());

        // EL CASO DE NO USAR EL DIRECTOR
        builder.reiniciar();
        builder.construirEstructura("pingas");
        builder.construirPisos(3);
        builder.agregarExtra("Parrila grande");


    }
}
