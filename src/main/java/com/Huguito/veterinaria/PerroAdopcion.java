package com.Huguito.veterinaria;

@VerificacionVeterinaria(aprobado = true)
public class PerroAdopcion implements Adoptable {

    private final MascotaInfo info;

    public PerroAdopcion(MascotaInfo info) {
        this.info = info;
    }

    @Override
    public void evaluarAdopcion() throws AdopcionDenegadaException {
        // Los métodos de un record se llaman igual que sus atributos (ej: info.edadMeses())
        if (info.edadMeses() < 2) {
            throw new AdopcionDenegadaException("El cachorro " + info.nombre() + " es muy pequeño.");
        }
        System.out.println("-> " + info.nombre() + " apto. Temperamento: " + info.temperamento());
    }
}