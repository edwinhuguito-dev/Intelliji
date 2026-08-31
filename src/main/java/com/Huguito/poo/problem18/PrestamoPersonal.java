package com.Huguito.poo.problem18;

public class PrestamoPersonal implements Prestamoable{

    private final String dniCliente;
    private final String motivo;
    private final double montoBase;

    public PrestamoPersonal(String dniCliente, String motivo, double montoBase) {
        this.dniCliente = dniCliente;
        this.motivo = motivo;
        this.montoBase = montoBase;
        validar();
    }


    private void validar(){
        if(dniCliente == null || dniCliente.isBlank()){
            throw new PrestamoException("El nombre del cliente no puede ser vacio");
        }
        if(motivo == null || motivo.isBlank()){
            throw new PrestamoException("El motivo no puede ser vacio");
        }
        if(!(montoBase >= 500 && montoBase <= 10000)){
            throw new PrestamoException("El monto del prestamo no es valido");
        }
    }


    private double calcularCuota(int diasAtraso){
        double pagoDiario = montoBase * 0.0015;
        if(diasAtraso <= 0){
            return 0.0;
        }
        double interes = pagoDiario * diasAtraso;
        return interes;
    }


    @Override
    public void calcularYAplicarCuota(int diasAtraso, double montoBaseCuota) {
        if(montoBaseCuota <= 0){
            throw new PrestamoException("El monto tiene que ser mayor a 0");
        }
        double pago = calcularCuota(diasAtraso);
        double totalPago = pago + montoBaseCuota;

        System.out.println(STR. "Prestamo personal (persona: \{dniCliente}) procesando.");
        System.out.println(STR. "Monto cuota: \{montoBaseCuota} | Dias de atraso: \{diasAtraso} | Mora aplicada: \{pago}");
        System.out.println(STR. "Total a pagar: \{totalPago}");

    }
}
