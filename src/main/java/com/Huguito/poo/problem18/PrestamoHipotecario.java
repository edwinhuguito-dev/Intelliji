package com.Huguito.poo.problem18;

public class PrestamoHipotecario implements Prestamoable{

    private final String codigoInmueble;
    private final double tasaInteresAnual;
    private final double montoBase;


    public PrestamoHipotecario(String codigoInmueble, double tasaInteresAnual, double montoBase) {
        this.codigoInmueble = codigoInmueble;
        this.tasaInteresAnual = tasaInteresAnual;
        this.montoBase = montoBase;
        validarReglasNegocio();
    }


    private void validarReglasNegocio(){ //VALIDAR LOS ATRIBUTOS DE LA CLASE
        if(montoBase <= 10000){
            throw new PrestamoException("El monto base del prestamos tiene que ser mayor a 10 mil");
        }
        if(codigoInmueble == null || codigoInmueble.isBlank()){
            throw new PrestamoException("El codigo del inmueble no puede estar vacio");
        }
        if(tasaInteresAnual <= 0){
            throw new PrestamoException("La tasa tiene que ser mayor a 0");
        }
    }

    // CALCULAR LOS INTERESES SI NO PAGA
    private double calcularMultaMora(int diasAtraso){
        if(diasAtraso <= 0){
            return 0.0;
        }
        double multaDiaria = montoBase * 0.005;
        double totalMulta = multaDiaria * diasAtraso;

        if(diasAtraso > 30){
            totalMulta += 100.0; // 100 MAS POR COSTO ADMINISTRATIVO
        }
        return totalMulta;
    }


    @Override
    public void calcularYAplicarCuota(int diasAtraso, double montoBaseCuota) {
        if(montoBaseCuota <= 0){
            throw new PrestamoException("El monto tiene que ser mayor a 0");
        }
        double mora = calcularMultaMora(diasAtraso);
        double totalPagar = montoBaseCuota + mora;

        System.out.println(STR. "Prestamo hipotecario (Inmueble: \{codigoInmueble}) procesando.");
        System.out.println(STR. "Monto cuota: \{montoBaseCuota} | Dias de atraso: \{diasAtraso} | Mora aplicada: \{mora}");
        System.out.println(STR. "Total a pagar: \{totalPagar}");

    }
}
