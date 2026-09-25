package com.Huguito.poo.problem21;

import com.Huguito.poo.problem20.RestriccionOperativaException;

public class TransaccionCorporativa implements LiquidadoresTransaccionales{

    private final String id;
    private final double limiteAnual;
    private final double comision;

    private int contadorTran = 0;
    private double acumula = 0.0;

    public TransaccionCorporativa(String id, double limiteAnual, double comision) {
        this.id = id;
        this.limiteAnual = limiteAnual;
        this.comision = comision;
        valida();
    }

    private void valida(){
        if(id == null || id.isBlank()){
            throw new TransaccionInvalidaException("El codigo no puede estar vacio");
        }
        if(limiteAnual <= 0){
            throw new TransaccionInvalidaException("El limite anual debe ser mayor a 0");
        }
        if(!(comision >= 0.001 && comision <= 0.05)){
            throw new TransaccionInvalidaException("El monto de la comision no puede ser mayor");
        }
    }

    private double anualComision(double montoTransaccion){
        if(montoTransaccion <= 0){
            throw new TransaccionInvalidaException("El monto a para la transaccion debe ser mayor a 0");
        }
        if((acumula + montoTransaccion) > limiteAnual){
            throw new RiesgoFinancieroException("Operacion Nº " + contadorTran + " bloqueada porque llego al limite anaul");
        }

        double montoNeto = montoTransaccion - (montoTransaccion * comision);

        contadorTran ++;
        acumula += montoTransaccion;
        System.out.println(STR. "Transaccion Nº \{contadorTran} EXITOSA. Acumulado anual es \{limiteAnual} USD.");

        return montoNeto;
    }

    private double obtenerCambio(String divisaDestino){
        return switch (divisaDestino.toUpperCase()){
            case "USD" -> 1.0;
            case "EUR" -> 0.92;
            case "PEN" -> 3.75;
            case "ARS" -> 1000.0;
            default -> throw new RiesgoFinancieroException("Divisa no encontrada");
        };
    }


    @Override
    public double procesarLiquidacion(double divisaOrigen, String divisaDestino) {
        double transaction = anualComision(divisaOrigen);
        if(divisaDestino == null || divisaDestino.isBlank()){
            throw new TransaccionInvalidaException("El destino no puede estar vacio");
        }

        double destinoMoneda = obtenerCambio(divisaDestino);
        double tazaCambio = transaction * destinoMoneda;
        return tazaCambio;
    }
}
