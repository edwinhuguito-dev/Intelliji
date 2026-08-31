package com.Huguito.poo.problem08;

import java.util.HashMap;
import java.util.Map;

public class Hospital {

    protected boolean paOk;
    protected boolean meOk;

    protected Map<String, Medico> medico;
    protected Map<String, Paciente> paciente;

    public Hospital() {
        this.medico = new HashMap<>();
        this.paciente = new HashMap<>();
        this.paOk = false;
        this.meOk = false;
    }

    public void registrarMedico(Medico medic){
        this.medico.put(medic.dni,medic);
    }

    public void registrarPaciente(Paciente pacient){
        this.paciente.put(pacient.dni, pacient);
    }

    public void asignarCita(String dniMedico, String dniPaciente){
        Medico med = this.medico.get(dniMedico);

        if(med == null || !med.disponible){
            throw new CitaNoDisponibleException("El medico no esta o no existe");
        }

        Paciente pac = this.paciente.get(dniPaciente);

        if(pac == null){
            throw new CitaNoDisponibleException("El paciente no existe");
        }

        med.disponible = false;

        System.out.println("Cita asignada " + med.nombre + " y paciente " + pac.nombre);


    }



}
