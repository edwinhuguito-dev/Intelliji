package com.Huguito.poo.problem20;

public class TractoCamion implements Liquidable{

    private final String indentificadorChasis;
    private final double potenciaHp;
    private final double topeRemolque;

    public TractoCamion(String indentificadorChasis, double potenciaHp, double topeRemolque) {
        this.indentificadorChasis = indentificadorChasis;
        this.potenciaHp = potenciaHp;
        this.topeRemolque = topeRemolque;
        validar();
    }

    private void validar(){
        if(indentificadorChasis == null || indentificadorChasis.isBlank()){
            throw new RestriccionOperativaException("El identifi no puede estar vacio");
        }
        if(potenciaHp < 300){
            throw new RestriccionOperativaException("La potencia es muy baja ");
        }
        if(topeRemolque < 10.0){
            throw new RestriccionOperativaException ("La capacida del remolque debe ser mayor a 10 T");
        }
    }





    @Override
    public double liquidarServicio(double distanciaRecorridoKm, double pesoCargaTonelada) {
        if(distanciaRecorridoKm  < 50.0){
            throw new RestriccionOperativaException("La distancia a recorrer tiene que ser mayora 50");
        }
        if(pesoCargaTonelada > topeRemolque){
            throw new RestriccionOperativaException("El remolque no puede trasladar demasiado peso");
        }
        double tarifaBase = 5.0;

        return distanciaRecorridoKm * tarifaBase;
    }
}
