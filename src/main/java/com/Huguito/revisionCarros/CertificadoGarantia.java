package com.Huguito.revisionCarros;


import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


    // SE USA ESTA CLASE PARA HACER ANOTACIONES ESPECIALES
    // PARA CERTIFICAR EL CARRO
@Retention(RetentionPolicy.RUNTIME)
public @interface CertificadoGarantia {

    String anios() default "2 años";

}
