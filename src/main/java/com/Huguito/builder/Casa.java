package com.Huguito.builder;

import java.util.ArrayList;
import java.util.List;

public class Casa {
    // ATRIBUTOS PRIVADOS E INMUTABLES
    private String tipoEstructura;
    private int pisos;
    private boolean piscina;
    private boolean garage;
    private boolean jardin;
    private List<String> extras = new ArrayList<>();

    // AGREGAMOS LOS SETTERS


    public void setTipoEstructura(String tipoEstructura) {
        this.tipoEstructura = tipoEstructura;
    }

    public void setPisos(int pisos) {
        this.pisos = pisos;
    }

    public void setPiscina(boolean piscina) {
        this.piscina = piscina;
    }

    public void setGarage(boolean garage) {
        this.garage = garage;
    }

    public void setJardin(boolean jardin) {
        this.jardin = jardin;
    }

    public void setExtras(List<String> extras) {
        this.extras = extras;
    }

    // PARA MOSTRAR LA INFO


    @Override
    public String toString() {
        return "Casa{" +
                "tipoEstructura='" + tipoEstructura + '\'' +
                ", pisos=" + pisos +
                ", piscina=" + piscina +
                ", garage=" + garage +
                ", jardin=" + jardin +
                ", extras=" + extras +
                '}';
    }
}
