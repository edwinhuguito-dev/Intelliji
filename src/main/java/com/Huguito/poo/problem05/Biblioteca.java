package com.Huguito.poo.problem05;

import java.util.HashMap;
import java.util.Map;

public class Biblioteca {

    protected HashMap<String, MaterialBibliografico> libro;

    public Biblioteca() {
        this.libro = new HashMap<>();
    }

    void agregarMaterial(MaterialBibliografico material){
        libro.put(material.codigo, material);
    }

    void registrarPrestamo(String codigo){
        boolean book = libro.containsKey(codigo);

        if(!book){
            System.out.println("El códiog ingresado no existe en la biblioteca");
            return;
        }
        MaterialBibliografico materialEncontrado = libro.get(codigo);

        if(materialEncontrado.disponible){
            materialEncontrado.prestar();
            System.out.println("El material " +  materialEncontrado.titulo + " se encontro y se procede a prestar");
        } else{
            System.out.println("El material " + materialEncontrado.titulo + " esta prestado");
        }



    }

}
