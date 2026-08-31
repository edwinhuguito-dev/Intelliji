package com.Huguito.poo.problem12;

public class Transportista extends RecursoLogistico  implements Rastreable{

    protected String licencia;
    protected double capacidadMaxKg;
    protected boolean disponible;

    public Transportista(String codigoId, String nombre, String region, String licencia, double capacidadMaxKg) {
        super(codigoId, nombre, region);
        this.licencia = licencia;
        this.capacidadMaxKg = capacidadMaxKg;
        this.disponible = true;
    }



    @Override
    void mostrarFichaTecnica() {
        System.out.println("Transportista " +
                "licencia " + this.licencia +
                ", capacidadMaxK " + this.capacidadMaxKg +
                ", disponible " + this.disponible +
                ", codigoId " + this.codigoId +
                ", nombre " + this.nombre +
                ", region " + this.region
        );
    }

    @Override
    public String obtenerUbicacionActual() {
        return "El vehiculo esta en la region de " + this.region;
    }

    public void asignarRuta(String destino){
        System.out.println("La ruta del vehiculo con placa " +  this.codigoId + " con destino " + destino);
    }

}
