package com.Huguito.poo.problem05;

public class Libro extends MaterialBibliografico implements Prestable{

    protected String autor;

    public Libro(String titulo, String codigo, String autor) {
        super(titulo, codigo);
        this.autor = autor;
    }

    @Override
    void mostrarDetalle() {
        System.out.println("El libro " + super.titulo + " su código es " + super.codigo +
                " el autor es " + this.autor);
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
