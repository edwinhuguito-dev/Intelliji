package com.Huguito.poo.problem09;

public class Cliente extends Usuario{

    protected String direccion;

    public Cliente(String id, String nombre, String telefono, String direccion) {
        super(id, nombre, telefono);
        this.direccion = direccion;
    }




    @Override
    void mostrarPerfil() {
        System.out.println("Cliente " +
            "direccion " + this.direccion +
                    ", id " + this.id +
                    ", nombre " + this.nombre +
                    ", telefono " + this.telefono
                    );

    }


}
