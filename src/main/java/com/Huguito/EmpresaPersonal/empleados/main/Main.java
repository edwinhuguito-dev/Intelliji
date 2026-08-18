package com.Huguito.EmpresaPersonal.empleados.main;

import com.Huguito.EmpresaPersonal.empleados.Jefes;
import com.Huguito.EmpresaPersonal.modelo.Area;
import com.Huguito.EmpresaPersonal.modelo.Cargo;

public class Main {
    public static void main(String[] args) {

        try {
            Jefes jefe1 = new Jefes("jefe001", "Huguito", "Putin", "123456789", 5000.0, 40, false, Cargo.JEFE, Area.RRHH);
            System.out.println("Jefe creado con exito.");
            System.out.println("Nombre: " + jefe1.getNombre() + " " + jefe1.getApellido() + " " + jefe1.getArea() + " " + jefe1.verificarAntecedentes(false));


        } catch(Exception e) {
            System.out.println("Ocurrio un error inesperado " + e.getMessage());
        }


    }
}
