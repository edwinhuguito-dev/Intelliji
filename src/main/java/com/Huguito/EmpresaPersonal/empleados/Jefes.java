package com.Huguito.EmpresaPersonal.empleados;

import com.Huguito.EmpresaPersonal.modelo.Area;
import com.Huguito.EmpresaPersonal.modelo.Cargo;
import com.Huguito.EmpresaPersonal.modelo.SuperPersonal;

public class Jefes extends SuperPersonal {

    public Jefes(String id, String nombre, String apellido, String dni, double sueldoBase, int edad, boolean antecedentesPenales, Cargo cargo, Area area) {
        super(id, nombre, apellido, dni, sueldoBase, edad, antecedentesPenales, cargo, area);
    }




}
