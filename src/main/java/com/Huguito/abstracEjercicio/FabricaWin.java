package com.Huguito.abstracEjercicio;

public class FabricaWin implements FabricaUI{
    @Override
    public Boton crearBoton() {
        return new BotonWin();
    }

    @Override
    public Ventana crearVentana() {
        return new VentanaWin();
    }
}
