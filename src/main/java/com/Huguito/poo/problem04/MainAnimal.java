package com.Huguito.poo.problem04;

import java.util.ArrayList;

public class MainAnimal {
    public static void main(String[] args){

        ArrayList<Animal> animal = new ArrayList<>();
        animal.add(new Mamifero("Gato", 5));
        animal.add(new Ave("Loro", 2, 0.25));
        animal.add(new Mamifero("Perro", 5));
        animal.add(new Ave("Gallina", 1, 0.50));


        Cuidador cuidador = new Cuidador("Huguito", "El mas pendejo de la muni");

        for(Animal ani : animal){
            ani.hacerSonido();
            cuidador.alimentarAnimal(ani, -20);
        }




    }
}
