package com.Huguito.poo.problem13;

import java.util.HashMap;

public class CentroComandoGalactico {

    protected HashMap<String, NaveEspacial> flotaNaves;
    protected HashMap<String, MisionEspacial> registrarMisiones;

    // UN HashMap  ANIDADDO
    protected HashMap<String, HashMap<String, NaveEspacial>> sectorYFlota;

    public CentroComandoGalactico() {
        this.flotaNaves = new HashMap<>();
        this.registrarMisiones = new HashMap<>();
        this.sectorYFlota = new HashMap<>();
    }


    public void registrarNave(NaveEspacial nave){
        this.flotaNaves.put(nave.matricula, nave);
    }
    public void desplegarMision(String codigoMision, TipoMisiones tipo, String matriculaNave, String sector, int combustibleRequerido){

        NaveEspacial avi = flotaNaves.get(matriculaNave);
        if(avi == null){
            throw new GalacticException("La nave no es existe en la flota");
        }
        if(!sectorYFlota.containsKey(sector)){
            sectorYFlota.put(sector, new HashMap<>());
        }

        HashMap<String, NaveEspacial> navesDelSector = sectorYFlota.get(sector);

        navesDelSector.put(avi.matricula, avi);

        System.out.println("Nave " + matriculaNave + " asignada correctamente al secto " + sector);



    }



}
