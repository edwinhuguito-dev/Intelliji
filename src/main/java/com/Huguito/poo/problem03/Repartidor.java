package com.Huguito.poo.problem03;

public class Repartidor {

    protected String nombre;
    protected String vehiculo;

    public Repartidor(String nombre, String vehiculo) {
        this.nombre = nombre;
        this.vehiculo = vehiculo;
    }


    public void entregarPedido(Platillo plato){

        System.out.println("El repartidor " + this.nombre + " va en camino con el vehiculo " + this.vehiculo + " a entregar el plato: " + plato.nombre);
    }

}
