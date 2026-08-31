package com.Huguito.poo.problem16;

public abstract class Heroe {

    private String nombre;
    private int vidaMax;
    private int vidaActual;
    private int mana;

    private int poder;
    private int defensa;


    public Heroe(String nombre, int vidaMax, int vidaActual, int mana, int poder, int defensa) {
        this.nombre = nombre;
        this.vidaMax = vidaMax;
        this.vidaActual = vidaActual;
        this.mana = mana;
        this.poder = poder;
        this.defensa = defensa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVidaMax() {
        return vidaMax;
    }

    public void setVidaMax(int vidaMax) {
        this.vidaMax = vidaMax;
    }

    public int getVidaActual() {
        return vidaActual;
    }

    public void setVidaActual(int vidaActual) {
        this.vidaActual = vidaActual;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    // METODOS

    public void atacar(Heroe objetivo){
        int min = (int)(getPoder() * 0.7);
        int max = (int)(getPoder() * 1.3);
        int danoBruto = (int)(Math.random() * (max - min + 1)) + min;
        recibirDano(danoBruto);
    }

    public void recibirDano(int dano){
        int danoPuro = Math.max(0, dano - getDefensa());
        setVidaActual(Math.max(0, getVidaActual() - danoPuro));


    }


}
