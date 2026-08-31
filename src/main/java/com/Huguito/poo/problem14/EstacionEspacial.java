package com.Huguito.poo.problem14;

public abstract class EstacionEspacial implements Operable<Integer> {
    protected String idEstacion;
    protected int energiaNucleo;
    protected boolean escudosActivos;

    public EstacionEspacial(String idEstacion, int energiaNucleo, boolean escudosActivos) {
        this.idEstacion = idEstacion;
        this.energiaNucleo = energiaNucleo;
        this.escudosActivos = escudosActivos;
    }

    public final void iniciarProtocoloDefensa(){

        verificarEscudos();
        cargarEnergiaNucleo();
        activarTorretas();
        ejecutarAtaqueOrbital();

    }

    public void verificarEscudos(){
        if(!this.escudosActivos){
            throw new ShieldOffLineException("Alerta los escudos " + idEstacion + " estan desactivados");
        }
        System.out.println("Escudos de la estacion " + idEstacion + " estan operando");
    }

    public void activarTorretas(){
        System.out.println("Activando torretas de la estacion " + idEstacion);

    }

    public abstract void cargarEnergiaNucleo();


    public abstract void ejecutarAtaqueOrbital();

    @Override
    public boolean verificarEstado(Integer umbralEnergia){
        return this.energiaNucleo >= umbralEnergia;
    }


}
