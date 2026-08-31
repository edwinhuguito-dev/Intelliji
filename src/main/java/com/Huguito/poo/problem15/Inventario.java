package com.Huguito.poo.problem15;

import com.Huguito.poo.problem13.GalacticException;

import java.util.HashMap;
import java.util.Map;

public class Inventario {

    private final Map<String, Objeto> obje;

    public Inventario() {
        this.obje = new HashMap<>();
    }

    //METODO
    public void agregarObjeto(Objeto obj){

        this.obje.put(obj.getNombre(), obj);

    }




    // METODO
    public boolean eliminarObjeto(String nombre){

        if(!obje.containsKey(nombre)){
            throw new GalacticException("No se encuenta el objeto o ya ha sido eliminado " + nombre);
        }
        obje.remove(nombre);
        return true;
    }




    // METODO
    public Objeto buscarObjeto(String nombre){
        if(!obje.containsKey(nombre)){
            throw new GalacticException("El objeto buscado no exixte " + nombre);
        }

        return obje.get(nombre);
    }


    // METODO
    public void mostrarObjeto(){
        if(obje.isEmpty()){
            throw new GalacticException("No hay item que mostrar");
        }
        for(Map.Entry<String, Objeto> entry : obje.entrySet()){
            System.out.println("ITEM " + entry.getKey());
        }
    }

}
