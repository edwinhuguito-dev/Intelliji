package com.Huguito.llista;

public class MainLista {
    public static void main(String[] args){

        Lista<Integer> listaNumeros = new Lista<>(5);


        listaNumeros.anadir(1);
        listaNumeros.anadir(2);
        listaNumeros.anadir(3);
        listaNumeros.anadir(4);
        listaNumeros.anadir(5);

        listaNumeros.listar();
        System.out.println(" ");

        listaNumeros.eliminar(4);

        listaNumeros.listar();
        System.out.println(" ");

        listaNumeros.eliminar(5);

        listaNumeros.listar();
        System.out.println(" ");


        System.out.println("Posicion elemento " + listaNumeros.posicion(3));
        System.out.println("Tamaño " + listaNumeros.tamano());


        listaNumeros.vaciar();

        listaNumeros.listar();


    }
}
