package com.Huguito.practica01;

public class CineService {
    public double calcularPrecioBoleto(int edad) {
        if (edad < 5) {
            return 0.0;
        } else if (edad >= 5 && edad <= 17) {
            return 5.0;
        } else if (edad >= 18 && edad <= 60) {
            return 10.0;
        } else {
            return 6.0;
        }
    }
}
