package com.Huguito.poo.problem19;

public class AuditorBanco {

    public void auditar(Auditable cuenta, double montoOperacion){
        try{
            cuenta.evaluarSeguridad(montoOperacion);
            System.out.println("Operacion Exitosa. APROBADO");

        } catch(CuentaInvalidaException e){
            System.out.println("Error cuenta. FRAUDE " + e.getMessage());
        } catch (FraudeDetectadoException e) {
        System.out.println("¡ALERTA! Operación Bloqueada por Riesgo/Fraude: " + e.getMessage());
    }
        System.out.println("------------------------------");






    }
}
