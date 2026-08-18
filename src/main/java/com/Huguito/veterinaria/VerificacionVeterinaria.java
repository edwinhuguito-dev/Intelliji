package com.Huguito.veterinaria;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface VerificacionVeterinaria {
    boolean aprobado() default false;
}