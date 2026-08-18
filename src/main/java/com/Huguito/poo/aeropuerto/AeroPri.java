package com.Huguito.poo.aeropuerto;

public class AeroPri extends Aero{

    protected int socio;

    public AeroPri(){
        this("", 0, 0, 0);
    }

    public AeroPri(String nombre, int ano, int capacidad, int socio) {
        super(nombre, ano, capacidad);
        this.socio = socio;
    }

    public int getSocio() {
        return socio;
    }

    public void setSocio(int socio) {
        this.socio = socio;
    }

    @Override
    public void ganacia(int cantidad) {
        double gananciaSo = cantidad / this.socio;
        System.out.println("Los sucios ganaron: " + gananciaSo);
    }

    @Override
    public String toString() {
        return super.toString() +
                "socio=" + socio +
                ", id=" + id +
                ", nombre='" + nombre + '\'' +
                ", ano=" + ano +
                ", capacidad=" + capacidad +
                '}';
    }
}
