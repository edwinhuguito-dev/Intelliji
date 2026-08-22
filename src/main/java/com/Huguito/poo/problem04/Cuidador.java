package com.Huguito.poo.problem04;

public class Cuidador {

    protected String nombre;
    protected String especialidad;

    public Cuidador(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
    }



    public void alimentarAnimal(Animal otraCosa, int porcion){
         System.out.println("El cuidado: " + this.nombre + " y su especialidad es: " + this.especialidad +
                 " da de comer alos animales " + otraCosa.nombre);
         otraCosa.comer(porcion);
    }

}
