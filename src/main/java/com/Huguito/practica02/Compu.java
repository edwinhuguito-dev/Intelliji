package com.Huguito.practica02;

import javax.swing.*;

public class Compu {

    private String marca;
    private String modelo;
    private int memoria;
    private int disco;
    private boolean estado;

    public Compu() {
    }

    public Compu(int memoria) {
        this.memoria = memoria;
    }

    public Compu(int memoria, int disco) {
        this.memoria = memoria;
        this.disco = disco;
    }

    public Compu(String marca, String modelo, int memoria) {
        this.marca = marca;
        this.modelo = modelo;
        this.memoria = memoria;
    }

    // GETTER AND SETTER
    public String getMarca() {
        return "La marca de la PC es: " + this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return "El modelo de la PC es: " + this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    // -------------------------------------
    public String getMemoria() {
        if (!this.estado) {
            return "Para liberar memoria enciende la PC.";
        }
        if (!(this.memoria <= 0)) {
            return "Disco liberado";
        } else {
            return "No puedes liberar el disco, reduce el tamaño de liberación.";
        }
    }

    public void setMemoria(int memoria) {
        if (this.estado && (this.disco > 0)) {
            this.memoria = this.disco -= memoria;
        }
    }

    // ---------------------------------
    public String getDisco() {
        if (!this.estado) {
            return "La PC esta apagada, enciendela peee.";
        }
        if (this.disco == 50) {
            return "El disco esta lleno, no se puede agregar nada.";
        } else {
            return "El espacio actual del disco es: " + this.disco;
        }
    }

    // Ahora setDisco devuelve true si se pudo y false si se pasó
    public boolean setDisco(int archivo) {
        if (this.estado && (this.disco + archivo <= 50)) {
            this.disco += archivo;
            return true;
        }
        return false;
    }

    //-------------------------------------
    public boolean getEstado() {
        return this.estado;
    }

    public boolean setEstado(String inputPc) {
        if (!(inputPc.equals("encender")) && !(inputPc.equals("apagar"))) {
            System.out.println("Escribe 'encender' o 'apagar', gracias");
            return false;
        }
        if (inputPc.equals("encender")) {
            System.out.println("La PC esta encendida.");
            return this.estado = true;
        } else {
            System.out.println("La PC esta apagada.");
            return this.estado = false;
        }
    }

    // METODOS PE CSM

    public void encender() {
        setEstado("encender");
    }

    public void apagar() {
        setEstado("apagar");
    }

    public void agregarDisco() {
        String input = JOptionPane.showInputDialog(null, "Ingresa el tamaño del archivo que deseas agregar.");
        if (input != null) {
            int archivo = Integer.parseInt(input);

            // Validamos usando el resultado de setDisco para mostrar el mensaje correcto
            boolean agregado = setDisco(archivo);

            if (!this.estado) {
                JOptionPane.showMessageDialog(null, "La PC esta apagada, enciendela peee.");
            } else if (agregado) {
                JOptionPane.showMessageDialog(null, "Archivo agregado con éxito. " + getDisco());
            } else {
                JOptionPane.showMessageDialog(null, "Error: No se puede agregar, el disco se pasa de los 50 GB o está lleno.");
            }
        }
    }

    public void eliminarDisco() {
        String input = JOptionPane.showInputDialog(null, "Ingresa el tamaño del archivo que deseas eliminar.");
        if (input != null) {
            int eliminar = Integer.parseInt(input);
            setMemoria(eliminar);
            JOptionPane.showMessageDialog(null, getMemoria());
        }
    }

    public void igual() {
    }

    @Override
    public String toString() {
        return "Compu{" +
                "marca='" + this.marca + '\'' +
                ", modelo='" + this.modelo + '\'' +
                ", memoria=" + this.memoria +
                ", disco=" + this.disco +
                ", estado=" + this.estado +
                '}';
    }
}