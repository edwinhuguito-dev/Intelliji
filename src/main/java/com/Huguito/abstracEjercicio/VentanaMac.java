package com.Huguito.abstracEjercicio;

public class VentanaMac implements Ventana{
    @Override
    public void render() {
        System.out.println("Abriendo ventana de botones MAC");
    }

    @Override
    public void agregarBoton(Boton b) {
        System.out.println("    -> Incrustando componente MAC");
        b.render();
    }
}
