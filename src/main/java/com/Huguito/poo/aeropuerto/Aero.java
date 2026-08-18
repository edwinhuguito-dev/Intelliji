package com.Huguito.poo.aeropuerto;

public abstract class Aero {

    protected int id;
    protected String nombre;
    protected int ano;
    protected int capacidad;

    protected static int idAutoenumerado = 1;


    public Aero(){
        this("",0,0);
    }

    public Aero(String nombre, int ano, int capacidad) {
        this.nombre = nombre;
        this.ano = ano;
        this.capacidad = capacidad;
        this.id = Aero.idAutoenumerado++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }


    public abstract void ganacia(int cantidad  );

    @Override
    public String toString() {
        return
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", ano=" + ano +
                ", capacidad=" + capacidad +
                '}';
    }
}
