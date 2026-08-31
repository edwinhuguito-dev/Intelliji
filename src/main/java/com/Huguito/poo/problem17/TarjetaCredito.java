package com.Huguito.poo.problem17;

public class TarjetaCredito implements MetodoPago{

    private final String numero;
    private final String cvv;
    private final double comisionPorcentaje ;
    private double limiteDisponible;


    public TarjetaCredito(String numero, String cvv, double comisionPorcentaje, double limiteDisponible) {
        this.numero = numero;
        this.cvv = cvv;
        this.comisionPorcentaje = comisionPorcentaje;
        this.limiteDisponible = limiteDisponible;
    }


    private void getNumeroEnmascarado(){
        if(numero == null || numero.length() < 4){
            throw new TransaccionInvalidaException("El numero tiene que ser 16 digitos");
        }
    }
    private String getNumeroOculto(){
        return "****-****-****-" + numero.substring(numero.length() - 4);
    }

    @Override
    public void procesarPago(double montoBase) {
        if(montoBase <= 0){
            throw new TransaccionInvalidaException("El monto tiene que ser mayor a 0");
        }
        double comision = montoBase * comisionPorcentaje;
        double montoTotal = montoBase + comision;

        if(montoTotal > limiteDisponible){
            throw new TransaccionInvalidaException(STR."limite insuficiente de tarjeta \{getNumeroOculto()}. Limite disponible: \{limiteDisponible}, monto con comision: \{montoTotal}");
        }
        limiteDisponible -= montoTotal;

        System.out.println(STR."Transaccion aprobada: Tarjeta de credico (\{getNumeroOculto()}) || Monto total con comision: (\{montoTotal})");

    }
}
