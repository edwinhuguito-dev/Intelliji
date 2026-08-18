package com.Huguito.revisionCarros;


@CertificadoGarantia(anios = "5 años")
public class Coche implements IVehiculable {

    private String color;
    private double pesoBase;
    private EstadoVehiculo estado; // aca usamos la clase ENUM

    public Coche(String color, double pesoBase, EstadoVehiculo estado) {
        this.color = color;

        // VALIDAMOS EL "this.pesoBase" CON LA CLASE EXCEPTION
        if(pesoBase < 500.0) {
            throw new PesoInvalidoException("Error: El peso base no puede ser menor a 500 kilos.");
        }

        this.pesoBase = pesoBase;
        this.estado = estado;
    }


    // IMPLEMENTAMOS LA CLASE INTERFAZ

    @Override
    public double calcularImpuestoMatricula() {
        if(this.estado == EstadoVehiculo.NUEVO) {
            return 1500.0;
        } else {
            return 600.0;
        }
    }

    public String getColor() { return color;}
    public double getPesoBase() { return pesoBase;}
    public EstadoVehiculo getEstado() { return estado;}


}
