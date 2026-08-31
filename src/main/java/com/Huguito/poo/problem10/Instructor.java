package com.Huguito.poo.problem10;

public class Instructor extends MiembroPlataforma{

    protected String especialidad;

    public Instructor(String id, String nombre, String correo, String especialidad) {
        super(id, nombre, correo);
        this.especialidad = especialidad;
    }


    @Override
    void mostrarDetalles() {
        System.out.println("Instructor " +
                "especialidad " + this.especialidad +
                ", id " + this.id +
                ", nombre " + this.nombre +
                ", correo " + this.correo
                );
    }

    public void dictarClases(){

        System.out.println("El profesor "  + this.nombre + " esta dictando su clase " + this.especialidad);

    }


}
