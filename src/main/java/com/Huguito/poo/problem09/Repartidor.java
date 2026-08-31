package com.Huguito.poo.problem09;

public class Repartidor extends Usuario{

    protected String vehiculo;
    protected boolean disponible;

    public Repartidor(String id, String nombre, String telefono, String vehiculo) {
        super(id, nombre, telefono);
        this.vehiculo = vehiculo;
        this.disponible = true;
    }




    @Override
    void mostrarPerfil() {
        System.out.println("Repartidor " +
                "vehiculo " + this.vehiculo +
                ", disponible " + this.disponible +
                ", id " + this.id +
                ", nombre " + this.nombre +
                ", telefono " + this.telefono
                );
    }

    public void entregarPedido(){
        if(!this.disponible){
            throw new PedidoNoValidoException("El repartidor no esta disponible");
        }
        this.disponible = false;
    }


}
