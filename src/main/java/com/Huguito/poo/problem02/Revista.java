package com.Huguito.poo.problem02;

public class Revista extends ItemBi {

    protected int numEdicion;
    protected String mesPubli;


    public Revista(String titulo, String coIden, int numEdicion, String mesPubli) {
        super(titulo, coIden);
        this.numEdicion = numEdicion;
        this.mesPubli = mesPubli;
        this.prestado = false;
    }

    @Override
    void mostrarInfo() {
        System.out.println("El autor la revista " + super.titulo +  " y su codigo es " + super.coIden  +
                                " y su numero de edicion es: " + this.numEdicion +
                                " y su mes de publicacion es: " + this.mesPubli);
    }

}
