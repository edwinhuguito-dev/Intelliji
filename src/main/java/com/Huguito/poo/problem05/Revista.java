package com.Huguito.poo.problem05;

public class Revista extends MaterialBibliografico implements Prestable{

    protected int numeroEdicion;

    public Revista(String titulo, String codigo, int numeroEdicion) {
        super(titulo, codigo);
        this.numeroEdicion = numeroEdicion;
    }

    @Override
    void mostrarDetalle() {
        System.out.println("La revista " + super.titulo + " y su código " + super.codigo +
                " y su numero de edicion " + this.numeroEdicion);
    }

    @Override
    public void prestar() {
        super.disponible = false;
    }

    @Override
    public void devolver() {
        super.disponible = true;
    }
}
