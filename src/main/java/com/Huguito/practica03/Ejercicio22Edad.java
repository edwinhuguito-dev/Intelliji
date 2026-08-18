package com.Huguito.practica03;

public class Ejercicio22Edad {

    private String[] name;
    private int[] old;


    public Ejercicio22Edad(String[] name, int[] old) {
        if(name == null || old == null || name.length != old.length ){
            System.out.println("Tiene que ingresa 01 nombre y 01 edad, de lo contrario no puede avanzar.");
            return;
        }

        for(int i = 0; i < old.length; i++){
            if(old[i] < 1 || old[i] > 130){
                System.out.println("El dato en la posicion: " + i + " no es valido.");
                return;
            }
        }
        this.name = name;
        this.old = old;
    }

    private int mayo(){
        int indiceMayor = 0;
        int mayor = this.old[0];
        for(int i = 1; i < this.old.length; i++){
            if(this.old[i] > mayor){
                mayor = this.old[i];
                indiceMayor = i;
            }
        }
        return indiceMayor;
    }


    public String nombre(){
        int indice = mayo();

        if(indice == -1){
            return "No hay datos";
        }

        String personaMayor = this.name[indice];
        int edadMayor = this.old[indice];

        return "Nombre mayor es: " + personaMayor + " y su edad es: " + edadMayor;
    }


}
