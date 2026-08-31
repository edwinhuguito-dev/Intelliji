package com.Huguito.poo.problem09;

import java.util.HashMap;

public class Restaurante {

    protected HashMap<String, Plato> menu;
    protected HashMap<String, Cliente> client;
    protected HashMap<String, Repartidor> repa;


    public Restaurante() {
        this.menu = new HashMap<>();
        this.client = new HashMap<>();
        this.repa = new HashMap<>();
    }

    public void agregarPlatoMenu(Plato plato){

        this.menu.put(plato.codigo, plato);
    }

    public void registrarCliente(Cliente cliente){

        this.client.put(cliente.id, cliente);

    }

    public void registrarRepartidor(Repartidor repartidor){

        this.repa.put(repartidor.id, repartidor);

    }

    public void procesarPedido(String idCliente, String codigoPlato, String idRepartidor){
        Cliente id = this.client.get(idCliente);
        Plato codi = this.menu.get(codigoPlato);
        Repartidor re = this.repa.get(idRepartidor);

        if(id == null){
            throw new PedidoNoValidoException("El cliente no existe en el sistema");
        }
        if(codi == null){
            throw new PedidoNoValidoException("El plato no existe en el menu");
        }
        if(re == null || !re.disponible){
            throw new PedidoNoValidoException("El repartido ya no existe o ya esta repartiendo");
        }

        re.disponible = false;

        System.out.println("Pedido prosesado con exito");
        System.out.println("Plato " + codi.nombre + " cuesta " + codi.precio);
        System.out.println("Cliente " + id.nombre + " con direccion " + id.direccion);
        System.out.println("El repartido " + re.id + " en " + re.vehiculo);



    }

}
