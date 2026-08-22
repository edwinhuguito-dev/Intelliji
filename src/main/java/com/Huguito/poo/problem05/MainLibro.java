package com.Huguito.poo.problem05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainLibro {
    public static void main(String[] args){

        Biblioteca biblioteca = new Biblioteca();
        Libro libro1 = new Libro("Cien años de soledad", "li001", "Huguito");
        Revista revista1 = new Revista("National Geographic", "re001", 45);

        biblioteca.agregarMaterial(libro1);
        biblioteca.agregarMaterial(revista1);

        System.out.println("------ PRIMER INTENTO DE PRESTAMO------");
        biblioteca.registrarPrestamo("li001");


        System.out.println("------ SEGUNDO INTENTO DE PRESTAMO------");
        biblioteca.registrarPrestamo("li001");


        System.out.println("------ PRIMER INTENTO DE REVISTA PRESTAMO------");
        biblioteca.registrarPrestamo("re001");


        System.out.println("------ CODIGO QUE NO EXISTE------");
        biblioteca.registrarPrestamo("aaa");

    }
}
