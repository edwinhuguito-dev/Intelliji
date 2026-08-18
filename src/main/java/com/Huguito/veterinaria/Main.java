package com.Huguito.veterinaria;

public class Main {
    public static void main(String[] args) {
        try {
            MascotaInfo miPerro = new MascotaInfo("Firulais", 1, Temperamento.JUGUETON);

            PerroAdopcion adopcion = new PerroAdopcion(miPerro);

            if(adopcion.getClass().isAnnotationPresent(VerificacionVeterinaria.class)) {
                VerificacionVeterinaria revision = adopcion.getClass().getAnnotation(VerificacionVeterinaria.class);
                if (!revision.aprobado()) {
                    throw new AdopcionDenegadaException("Sin revision médica.");
                }
            }

            adopcion.evaluarAdopcion();
        } catch (AdopcionDenegadaException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
