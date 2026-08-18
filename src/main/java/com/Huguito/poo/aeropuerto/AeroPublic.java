package com.Huguito.poo.aeropuerto;

public class AeroPublic extends Aero{

    protected int finance;
    protected int ntraba;

    public AeroPublic() {
        this("", 0, 0, 0, 0);
    }

    public AeroPublic(String nombre, int ano, int capacidad, int finance, int ntraba) {
        super(nombre, ano, capacidad);
        this.finance = finance;
        this.ntraba = ntraba;
    }

    public int getFinance() {
        return finance;
    }

    public void setFinance(int finance) {
        this.finance = finance;
    }

    public int getNtraba() {
        return ntraba;
    }

    public void setNtraba(int ntraba) {
        this.ntraba = ntraba;
    }


    @Override
    public void ganacia(int cantidad) {
        double ganandiaAero = cantidad + this.finance + (this.ntraba * 1000);

        System.out.println("Las ganancias han sido de: " + ganandiaAero);
    }

    @Override
    public String toString() {
        return super.toString() +  "finance=" + finance +
                ", ntraba=" + ntraba +
                ", id=" + id +
                ", nombre='" + nombre + '\'' +
                ", ano=" + ano +
                ", capacidad=" + capacidad +
                '}';
    }
}
