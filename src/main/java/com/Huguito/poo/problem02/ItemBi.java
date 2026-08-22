package com.Huguito.poo.problem02;

public abstract class ItemBi {

    protected String titulo;
    protected String coIden;
    protected boolean prestado;

    public ItemBi(String titulo, String coIden) {
        this.titulo = titulo;
        this.coIden = coIden;
        this.prestado = false;
    }

    abstract void mostrarInfo();

    public boolean prestarItem(){
        if(this.prestado){
            throw new ItemNoDisponibleException("El item ya esta prestado");
        }
        this.prestado =  true;
        return true;
    }


}
