package com.Huguito.poo.problem14;

public class EstacionComando extends EstacionEspacial{
    protected int satelitesActivos;

    public EstacionComando(String idEstacion, int energiaNucleo, boolean escudosActivos, int satelitesActivos) {
        super(idEstacion, energiaNucleo, escudosActivos);
        this.satelitesActivos = satelitesActivos;
    }

    @Override
    public void cargarEnergiaNucleo() {
        if(this.energiaNucleo < 20){
            throw new EnergyDepletedException("Energia critica de la estacion " + idEstacion);
        }
        System.out.println("Estacion " + idEstacion + " nucleo de energia lleno");
    }

    @Override
    public void ejecutarAtaqueOrbital() {
        System.out.println("-> Estación " + idEstacion + ": Redirigiendo disparos láser mediante " + satelitesActivos + " satélites de comando.");
    }

}
