package com.Huguito.poo.problem17;

public class Cliente {
    private String idCliente;
    private String nombre;
    private Fidelidad nivel;

    public Cliente(String idCliente, String nombre, Fidelidad nivel) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.nivel = nivel;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Fidelidad getNivel() {
        return nivel;
    }

    public void setNivel(Fidelidad nivel) {
        this.nivel = nivel;
    }
}
