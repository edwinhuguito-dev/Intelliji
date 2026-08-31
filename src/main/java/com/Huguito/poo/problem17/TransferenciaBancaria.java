package com.Huguito.poo.problem17;

public class TransferenciaBancaria implements MetodoPago{

    private final String cci;
    private final String banco;


    public TransferenciaBancaria(String cci, String banco) {
        this.cci = cci;
        this.banco = banco;

    }


    private void validarCCI(){
        if(cci == null || cci.length() != 20 || !cci.matches("\\d+")){
            throw new TransaccionInvalidaException("El cci tiene que tener 20 numeros");
        }
    }

    private String getCCIMascarado(){
        return "****-****-****-****-" + cci.substring(cci.length() - 4);
    }


    @Override
    public void procesarPago(double montoFinal) {
        if(montoFinal <= 0){
            throw new TransaccionInvalidaException("No procede la transaccion porque tiene que ser mayor 0");
        }
        validarCCI();
        System.out.println(STR. "La transaccion se realizo con exito al banco \{ banco}");
    }
}
