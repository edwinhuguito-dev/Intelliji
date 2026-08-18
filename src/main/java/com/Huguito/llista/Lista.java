package com.Huguito.llista;

public class Lista<T> implements Listable<T>{

    private T[] elementos;
    private int numElementos;

    public Lista(int tamano){
        if(tamano > 0){
            this.elementos = (T[])new Object[tamano];
            this.numElementos = 0;
        } else{
            throw new IllegalArgumentException("El tamaño debe ser positivo");
        }

    }

    @Override
    public int posicion(T elemento) {
        for(int i = 0; i < this.numElementos; i++){
            if(this.elementos[i].equals(elemento)){
                return i;

            }
        }
        return -1;
    }

    @Override
    public Boolean anadir(T elemento) {
        if(this.numElementos < this.elementos.length && this.posicion(elemento) == -1){
            this.elementos[this.numElementos++] = elemento;
            return true;
        }
        return false;
    }

    @Override
    public int tamano() {
        return this.numElementos;
    }

    @Override
    public boolean eliminar(T elemento) {
        int indiceElemento = this.posicion(elemento);
        if(indiceElemento != -1){
            this.numElementos --;
            for(int i = 0; i < this.numElementos; i++){
                this.elementos[i] = this.elementos[i + 1];
                this.elementos[i + 1] = null;
            }
        }
        return true;
    }

    @Override
    public void listar() {
        for(int i = 0; i < this.numElementos; i++){
            System.out.println(this.elementos[i]);
        }
    }

    @Override
    public void vaciar() {
        this.elementos = (T[]) new Object[this.elementos.length];
        this.numElementos = 0;

    }
}
