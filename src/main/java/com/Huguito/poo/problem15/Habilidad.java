package com.Huguito.poo.problem15;

public class Habilidad {

    private String nombre;
    private int danoBase;
    private int costoRecurso;
    private int niverlRequerido;
    private TipoHabilidad tipo;

    public Habilidad(String nombre, int danoBase, int costoRecurso, int niverlRequerido, TipoHabilidad tipo) {
        this.nombre = nombre;
        this.danoBase = danoBase;
        this.costoRecurso = costoRecurso;
        this.niverlRequerido = niverlRequerido;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDanoBase() {
        return danoBase;
    }

    public void setDanoBase(int danoBase) {
        this.danoBase = danoBase;
    }

    public int getCostoRecurso() {
        return costoRecurso;
    }

    public void setCostoRecurso(int costoRecurso) {
        this.costoRecurso = costoRecurso;
    }

    public int getNiverlRequerido() {
        return niverlRequerido;
    }

    public void setNiverlRequerido(int niverlRequerido) {
        this.niverlRequerido = niverlRequerido;
    }

    public TipoHabilidad getTipo() {
        return tipo;
    }

    public void setTipo(TipoHabilidad tipo) {
        this.tipo = tipo;
    }
}
