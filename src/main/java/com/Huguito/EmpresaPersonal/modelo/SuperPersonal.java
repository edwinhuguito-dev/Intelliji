package com.Huguito.EmpresaPersonal.modelo;

public class SuperPersonal implements Verificable {

    protected String id;
    protected String nombre;
    protected String apellido;
    protected String dni;
    protected double sueldoBase;

    protected int edad; // CLASE "interface"
    protected boolean antecedentesPenales; // CLASE "interface"
    protected Cargo cargo; // CLASE DE "enum"
    protected Area area; // CLASE DE "enum"



    // CONSTRUCTORES
    public SuperPersonal(String id, String nombre, String apellido, String dni, double sueldoBase, int edad, boolean antecedentesPenales, Cargo cargo, Area area) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.sueldoBase = sueldoBase;


        if(!verificarEdad(edad)) { // HACEMOS LA VERIFICACION DE EDAD EN LOS CONSTRUCTORES COMO INDICA LA interface
            throw new PersonalNoAptoException("El personal debe ser mayor de 18 años de edad.");
        }

        if(!verificarAntecedentes(antecedentesPenales)) { // HACEMOS LA VERIFICACION DE EDAD EN LOS CONSTRUCTORES COMO INDICA LA interface
            throw new PersonalNoAptoException("No se puede contratar personal con antecedentes penales.");
        }
        this.edad = edad;
        this.antecedentesPenales = antecedentesPenales;

        this.cargo = cargo;
        this.area = area;
    }

    // La clase RECORD solo se usa para guardar datos simples que no necesitan validaciones ni herencias





    @Override  // ESTAS CLASES REESCRIBEN LO QUE HABIA EN LA "interface" Y LE AGREGAN LA LOGICA
    public boolean verificarEdad(int edad){
        return edad >= 18;
    }

    @Override  // ESTAS CLASES REESCRIBEN LO QUE HABIA EN LA "interface" Y LE AGREGAN LA LOGICA
    public boolean verificarAntecedentes(boolean tieneAntecedentes){
        return !tieneAntecedentes;
    }

    // SETTERS AND GETTERS


    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isAntecedentesPenales() {
        return antecedentesPenales;
    }

    public void setAntecedentesPenales(boolean antecedentesPenales) {
        this.antecedentesPenales = antecedentesPenales;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }
}



// Class (Class): plantilla comun orientada a objetos

// Interface (Interfaz): es un contrato estricto que define un conjunto de metodos vacios que OBLIGA
// a las clases que la implementaron a usar su metodo de forma OBLIGATORIA

// Record (Registro): es una clase moderna que sirve para ahorar escribir codigo y solo sirve
// para transportar datos inmutables y simples

// Enum (Enumeracion): clase que sirve para hacer un lista cerrada fija y constante de valores
// como dias de semana, areas y cargos

// Exception (Exception): es una clase especializada en el manejo de errores de la aplicacion
// permite crear reglas personalizadas para notificar fallos especificos del negocio