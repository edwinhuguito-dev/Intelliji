package com.Huguito.empleado;

import java.util.Date;
import java.util.GregorianCalendar;

public class Empleado {

    private String nombre;
    private double salario;
    private Date altaContrato;


    // CONSTRUCTOR
    public Empleado(String nom, double sue, int agno, int mes, int dia) {
        nombre = nom;
        salario = sue;
        GregorianCalendar calendario = new GregorianCalendar(agno, mes-1 , dia);

        altaContrato = calendario.getTime();
    }

    // SOBRE CARGA DE CONSTRUCTORES

    public Empleado(String nom){
        this(nom,3000,2000,7,3);
    }

    // GETTERS AND SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Date getAltaContrato() {
        return altaContrato;
    }

    public void setAltaContrato(Date altaContrato) {
        this.altaContrato = altaContrato;
    }

    // METODO PARA CALCULAR SALARIO


    public void subirSueldo(double porcentaje){
        double aumento = salario * porcentaje / 100;

        salario += aumento;
    }


}
