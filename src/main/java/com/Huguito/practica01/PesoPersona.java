package com.Huguito.practica01;

public class PesoPersona {

    public String genero;
    public double altura;


    public PesoPersona(String genero, double altura) {
        this.genero = genero;
        this.altura = altura;
    }

    // getter and setter

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }



    // metodos
    public double calcularPesoIdeal() {
        // Si el género es nulo o no es hombre ni mujer (usando .trim() para limpiar espacios)
        if (genero == null || (!genero.trim().equalsIgnoreCase("hombre") && !genero.trim().equalsIgnoreCase("mujer"))) {
            throw new IllegalArgumentException("Debe ingresar 'hombre' o 'mujer'.");
        }

        if (genero.trim().equalsIgnoreCase("hombre")) {
            return altura - 110;
        } else {
            return altura - 120;
        }
    }
}
