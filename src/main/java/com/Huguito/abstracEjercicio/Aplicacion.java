package com.Huguito.abstracEjercicio;

public class Aplicacion {
    private Boton boton;
    private Ventana ventana;

    public Aplicacion(FabricaUI fabrica){
        this.ventana = fabrica.crearVentana();
        this.boton = fabrica.crearBoton();
    }

    public void renderizarUI(){
        this.ventana.render();
        this.ventana.agregarBoton(this.boton);
    }

}
