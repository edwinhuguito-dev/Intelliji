package com.Huguito.poo.problem17;

public class BilleteraDigital implements MetodoPago {

    private final String telefono;
    private final String proveedor;

    public BilleteraDigital(String telefono, String proveedor) {
        this.telefono = telefono;
        this.proveedor = proveedor;
    }





    private void validarFono(){
        if(telefono == null || telefono.length() != 9 || !telefono.matches("\\d+")){
            throw new TransaccionInvalidaException("El telefono tiene que tener 9 digitos");
        }
    }

    private String fonoOculto(){
        return "***-***-" + telefono.substring(telefono.length() - 3);
    }



    @Override
    public void procesarPago(double montoFinal) {
        if(montoFinal <= 0){
            throw new TransaccionInvalidaException("La transaccion tiene que ser mayora  0");
        }
        validarFono();
        System.out.println(STR. "La transaccion se reali correctamente a \{proveedor}");
    }
}