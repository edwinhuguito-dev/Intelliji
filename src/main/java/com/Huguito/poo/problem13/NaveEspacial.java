package com.Huguito.poo.problem13;

public abstract class NaveEspacial implements Combustible<Integer>  {

    protected String matricula;
    protected String nombreCapitan;
    protected int nivelBlindaje;
    protected EstadoNave estado;
    protected int combustibleActual;
    protected int poder;

    public NaveEspacial(String matricula, String nombreCapitan, int nivelBlindaje, int combustibleActual, int poder) {
        this.matricula = matricula;
        this.nombreCapitan = nombreCapitan;
        this.nivelBlindaje = nivelBlindaje;
        this.estado = EstadoNave.EN_BASE;
        this.combustibleActual = combustibleActual;
        this.poder = poder;
    }

    abstract void calcularPoderCombate();

    public void recibirDano(int puntosDano){
        this.nivelBlindaje -= puntosDano;
        if(this.nivelBlindaje <= 0){
            this.estado = EstadoNave.DESTRUIDA;
            throw new GalacticException("La naves" + this.matricula + " esta destruida");
        }

    }


    @Override
    public void consumirCombustible(Integer cantidad){
        this.combustibleActual -= cantidad;
    }

    @Override
    public Integer verNivelCombustible(){
        return this.combustibleActual;
    }



}
