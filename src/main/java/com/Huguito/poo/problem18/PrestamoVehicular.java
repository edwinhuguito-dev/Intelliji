package com.Huguito.poo.problem18;

public class PrestamoVehicular implements Prestamoable{

    private final String placaVehiculo;
    private final int anoFabribacion;
    private final double montoBase;

    public PrestamoVehicular(String placaVehiculo, int anoFabribacion, double montoBase) {
        this.placaVehiculo = placaVehiculo;
        this.anoFabribacion = anoFabribacion;
        this.montoBase = montoBase;
        validar();
    }

    // Validar los datos

    private void validar(){
        if(placaVehiculo == null || placaVehiculo.isBlank()){
            throw new PrestamoException("La placa no puede estar vacio");
        }
        if(!(anoFabribacion >= 2016 && anoFabribacion <= 2026)){
            throw new PrestamoException("No procede el prestamo porque es muy antiguo el auto");
        }
        if(!(montoBase >= 2000 && montoBase <= 50000)){
            throw new PrestamoException("No procede el pago");
        }
    }

    private double calcularMora(int diasAtraso){
        double cuota = montoBase * 0.001;
        if(diasAtraso <= 0){
            return 0.0;
        }
        double mora = diasAtraso * cuota;
        return mora;
    }

    @Override
    public void calcularYAplicarCuota(int diasAtraso, double montoBaseCuota) {
        if(montoBaseCuota <= 0){
            throw new PrestamoException("El monto base no puede ser 0");
        }
        double cuota = calcularMora(diasAtraso);
        double totalPago = montoBaseCuota + cuota;

        System.out.println(STR. "Prestamo vehicular ( de: \{placaVehiculo}) procesando.");
        System.out.println(STR. "Monto cuota: \{montoBaseCuota} | Dias de atraso: \{diasAtraso} | Mora aplicada: \{cuota}");
        System.out.println(STR. "Total a pagar: \{totalPago}");
    }
}
