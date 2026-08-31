package com.Huguito.poo.problem14;

import java.util.TreeSet;

public class EstacionArmada extends EstacionEspacial{


    private TreeSet<String> inventarioMisiles;

    public EstacionArmada(String idEstacion, int energiaNucleo, boolean escudosActivos, TreeSet<String>inventarioMisiles) {
        super(idEstacion, energiaNucleo, escudosActivos);
        this.inventarioMisiles = inventarioMisiles;
    }

    @Override
    public void cargarEnergiaNucleo() {
        if(this.energiaNucleo < 50){
            throw new EnergyDepletedException("Energia insuficiente en la estacion");
        }
        System.out.println("-> Estación " + idEstacion + ": Celdas de energía de combate cargadas.");
    }

    @Override
    public void ejecutarAtaqueOrbital() {
        if(inventarioMisiles.isEmpty()){
            throw new UnauthorizedSectorException("No hay misiles disponibles");
        }

        System.out.println("Estasion " + idEstacion + " lanzando secuencia de misiles");
        inventarioMisiles.stream().forEach(misil -> System.out.println("[MISIL LANZADO] " + misil));
        inventarioMisiles.clear();

    }
}
