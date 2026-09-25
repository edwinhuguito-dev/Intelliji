package com.Huguito.abstracEjercicio;

public class VentanaWin implements Ventana{
    @Override
    public void render() {
        System.out.println("Abriendo ventana con borde azul Windows");
    }

    @Override
    public void agregarBoton(Boton b) {
        System.out.println("    -> Incrustado componentes");
        b.render();
    }
}
