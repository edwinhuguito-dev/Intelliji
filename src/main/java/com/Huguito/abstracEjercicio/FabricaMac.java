package com.Huguito.abstracEjercicio;

public class FabricaMac implements FabricaUI{
    @Override
    public Boton crearBoton() {
        return new BotonMac();
    }

    @Override
    public Ventana crearVentana() {
        return new VentanaMac();
    }
}
