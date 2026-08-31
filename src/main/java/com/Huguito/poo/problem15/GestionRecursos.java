package com.Huguito.poo.problem15;

public interface GestionRecursos<T>{

    void consumirRecurso(T cantidad);
    void recuperarRecurso(T cantidad);
    T verRecursoActual();
    T verRecursoMaximo();

}
