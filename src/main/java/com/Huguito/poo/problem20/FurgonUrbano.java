package com.Huguito.poo.problem20;

public class FurgonUrbano {

    private final String codigoUnidad;
    private final double capacidadVolumen;
    private final boolean cuentaRefrigeracion;

    public FurgonUrbano(String codigoUnidad, double capacidadVolumen, boolean cuentaRefrigeracion) {
        this.codigoUnidad = codigoUnidad;
        this.capacidadVolumen = capacidadVolumen;
        this.cuentaRefrigeracion = cuentaRefrigeracion;
        validad();
    }


    private void validad(){
        if(codigoUnidad == null || codigoUnidad.isBlank()){
            throw new VehiculoInvalidoException("No puede estar vacio el dodigo");
        }
        if(capacidadVolumen <= 0){
            throw new VehiculoInvalidoException("La capacidad no puede ser menor a 0");
        }
    }


    private double calcularTarifa(double recorrido){
        double costofijo = 15.0;
        double factorVariable = 1.5;
        double costoRefri = cuentaRefrigeracion ? 0.8: 0.0;

        return costofijo + ((factorVariable + costoRefri) * recorrido);
    }




//    @Override
//    public double liquidarServicio(double distanciaRecorridoKm, double pesoCargaTonelada) {
//        if(pesoCargaTonelada <= 0 || pesoCargaTonelada > 5.0){
//            throw new RestriccionOperativaException("El peso de la carga excede el limite permitido");
//        }
////        return calcularTarifa(4distanciaRecorridoKm);
//    }
}
