package com.Huguito.poo.problem11;

import java.util.HashMap;

public class HospitalSistema {

    protected HashMap<String, Paciente> pacientes;
    protected HashMap<String, Medico> medicos;
    protected HashMap<String, Medicamento> farmacia;
    protected HashMap<String, CitaMedica> citas;

    public HospitalSistema(){
        this.pacientes = new HashMap<>();
        this.medicos = new HashMap<>();
        this.farmacia = new HashMap<>();
        this.citas = new HashMap<>();
    }

    public void registrarPaciente(Paciente paciente){
        this.pacientes.put(paciente.dni, paciente);
    }
    public void registrarMedico(Medico medico){
        this.medicos.put(medico.dni, medico);
    }
    public void registrarMedicamento(Medicamento med){
        this.farmacia.put(med.codigo, med);
    }

    public void agendarCita(String codigoCita, String dniPaciente, String dniMedico, String fecha){
        // VALIDAR SI EL PACIENTE EXISTE
        Paciente pa = this.pacientes.get(dniPaciente);
        if(pa == null){
            throw new HospitalException("El paciente con dni " + dniPaciente + " no existe");
        }
        // VALIDAR SI EL MEDICO EXISTE Y ESTA DISPONIBLE
        Medico me = this.medicos.get(dniMedico);
        if(me == null || !me.disponible ){
            throw new HospitalException("El medico con dni " + dniMedico + " no esta disponible o no existe");
        }
        // VALIDAR SI LA CITA YA EXISTE
        if(this.citas.containsKey(codigoCita)){
            throw new HospitalException("La cita con codigo " + codigoCita + " ya existe");
        }

        // CREAR CITA USANDO LOS PARAMETROS REALES
        CitaMedica citaMe = new CitaMedica(codigoCita, pa, me, "15-09-2026");

        this.citas.put(citaMe.codigoCita, citaMe);
        me.disponible = false;

        System.out.println("La cita " + codigoCita + " se agendo CORRECTAMENTE");

    }
    public void despacharRecetaMedicamento(String codigoMedicamento, int cantidadRequerida){
        Medicamento medi = this.farmacia.get(codigoMedicamento);
        if(medi == null){
            throw new HospitalException("El medicamento no existe");
        }

        if(medi.stock < cantidadRequerida){
            throw new HospitalException("No hay stock suficiente");
        }

        medi.stock -= cantidadRequerida;

        System.out.println("El despacho de medicamento se es exitoso");
    }
}
