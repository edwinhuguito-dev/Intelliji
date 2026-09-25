package com.Huguito.poo.problem18;

import com.Huguito.poo.problem19.Auditable;
import com.Huguito.poo.problem19.CuentaAhorros;
import com.Huguito.poo.problem19.CuentaCorriente;
import com.Huguito.poo.problem19.CuentaVIP;

public class MainCuenta {
    public static void main(String[] args) {
        Auditable audiCo = new CuentaCorriente("32164597898764531232", 3000);
        Auditable audiAh = new CuentaAhorros("32165478", 500);
        Auditable audiVi = new CuentaVIP("codi001", 3);

        audiCo.evaluarSeguridad(5000);
        audiAh.evaluarSeguridad(1000);
        audiVi.evaluarSeguridad(10005);
    }

}
