package com.Huguito.poo.problem12;

public abstract class RecursoLogistico {

    protected String codigoId;
    protected String nombre;
    protected String region;

    public RecursoLogistico(String codigoId, String nombre, String region) {
        this.codigoId = codigoId;
        this.nombre = nombre;
        this.region = region;
    }

    abstract void mostrarFichaTecnica();


}
