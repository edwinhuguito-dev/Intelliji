package com.Huguito.poo.problem13;

public class MisionEspacial {

    protected String codigoMision;
    protected TipoMisiones tipo;
    protected NaveEspacial naveAsignada;
    protected String sectorGalactico;
    protected boolean completadad;

    public MisionEspacial(String codigoMision, TipoMisiones tipo, NaveEspacial naveAsignada, String sectorGalactico) {
        this.codigoMision = codigoMision;
        this.tipo = tipo;
        this.naveAsignada = naveAsignada;
        this.sectorGalactico = sectorGalactico;
        this.completadad = false;
    }

    public void ejecutarMision(int combustibleRequerido){

        if(this.naveAsignada.estado == EstadoNave.DESTRUIDA || this.naveAsignada.estado == EstadoNave.MANTENIMIENTO){
            throw new GalacticException("La nave no puede ejecutar una mision porque esta en Mantenimiento o destruida");
        }

        if(naveAsignada.combustibleActual < combustibleRequerido){
            throw new GalacticException("El combustible es insuficiente, agrega más.");
        }
        this.naveAsignada.estado = EstadoNave.EN_MISION;

        this.naveAsignada.consumirCombustible(combustibleRequerido);




        if(this.tipo == TipoMisiones.COMBATES){
            if(this.naveAsignada instanceof NaveCombate){
                NaveCombate naveCombateReal = (NaveCombate) this.naveAsignada;
                naveCombateReal.dipararMisil();
            }else{
                throw new GalacticException("La nave asignada no es de combate");
            }
        }


        this.completadad = true;
        this.naveAsignada.estado = EstadoNave.EN_BASE;
        System.out.println("Mision " + this.codigoMision + " ejecutada con exito");








    }



}
