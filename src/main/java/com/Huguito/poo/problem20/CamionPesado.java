package com.Huguito.poo.problem20;

public class CamionPesado implements Liquidable{

    private final String placaVehiculo;
    private final int numeroEjes;
    private final double tarifaBaseKm;

    public CamionPesado(String placaVehiculo, int numeroEjes, double tarifaBaseKm) {
        this.placaVehiculo = placaVehiculo;
        this.numeroEjes = numeroEjes;
        this.tarifaBaseKm = tarifaBaseKm;
        validar();
    }

    private void validar(){
        if(placaVehiculo == null || placaVehiculo.isBlank() || placaVehiculo.length() != 6){
            throw new VehiculoInvalidoException("La placa tiene 6 digitos y no puede estar vacia");
        }
        if(!(numeroEjes >= 3 && numeroEjes <= 6)){
            throw new VehiculoInvalidoException("La cantidade eje es de 3 a 6 por unidad");
        }
        if(tarifaBaseKm <= 0){
            throw new VehiculoInvalidoException("Error la tarifa no puede ser menos a 0");
        }
    }

    private double pagoExtra(double peso){
        double ini = 0.05;
        return ini * (peso - 25);
    }



    @Override
    public double liquidarServicio(double distanciaRecorridoKm, double pesoCargaTonelada) {
        double costoTotal = 0;
        if(pesoCargaTonelada <= 25){
            return tarifaBaseKm * distanciaRecorridoKm;

        }
        if(pesoCargaTonelada > 25 && pesoCargaTonelada <= 40){
            double pagoTotal = pagoExtra(pesoCargaTonelada);
            costoTotal = tarifaBaseKm * distanciaRecorridoKm + pagoTotal;
            return costoTotal;
        }

        throw new RestriccionOperativaException("El vehiculo no puede operar con esa cantidad de peso excedente");

    }
}
