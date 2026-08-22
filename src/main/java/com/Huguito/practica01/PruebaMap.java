package com.Huguito.practica01;

import java.util.HashMap;
import java.util.Map;

public class PruebaMap {
    public static void main(String[] args) {

        Map<Integer, String> mapaEmpleados = new HashMap<>();
        mapaEmpleados.put(1523, "suscribe a ToodCode");
        mapaEmpleados.put(1524, "Huguito");
        mapaEmpleados.put(1525, "Mi perrito");
        mapaEmpleados.put(1526, "Tengo hambre");

        boolean esta = mapaEmpleados.containsKey(1523);

        if(!esta){
            System.out.println("El valor:  no esta");
        }else {
            System.out.println("El valor:  SIIIIII esta");
        }


        int todo = mapaEmpleados.values().size();

        System.out.println(todo);

        mapaEmpleados.remove(1526);

        String nombre = mapaEmpleados.get(1523);

        System.out.println(nombre);

        System.out.println(mapaEmpleados.keySet());
        System.out.println(todo);


    }

}
