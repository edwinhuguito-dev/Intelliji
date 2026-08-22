package com.Huguito.poo.problem05;

public abstract class MaterialBibliografico {

    protected String titulo;
    protected String codigo;
    protected boolean disponible;

    public MaterialBibliografico(String titulo, String codigo) {
        this.titulo = titulo;
        this.codigo = codigo;
        this.disponible = true;
    }


    abstract void mostrarDetalle();

    public abstract void prestar();
    public abstract void devolver();


}
