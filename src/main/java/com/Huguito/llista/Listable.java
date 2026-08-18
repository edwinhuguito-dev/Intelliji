package com.Huguito.llista;

public interface Listable<T> {

    public int posicion(T elemento);
    public Boolean anadir(T elemento);
    public int tamano();
    public boolean eliminar(T elemento);
    public void listar();
    public void vaciar();


}
