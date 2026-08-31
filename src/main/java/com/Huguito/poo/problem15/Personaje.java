package com.Huguito.poo.problem15;

import com.Huguito.poo.problem13.GalacticException;

public abstract class Personaje implements GestionRecursos<Integer> {

    private String nombre;
    private int nivel;
    private int experiencia;
    private int vidaActual;
    private int vidaMaxima;
    private int recursoActual;
    private int recursoMaximo;
    private int poder;
    private int defensa;
    private int racha;

    private Inventario inventario; // tipo de dato CLASE
    private EstadoPersonaje estado; // tipo de dato ENUM

    // CONSTRUCTOR


    public Personaje(String nombre, int nivel, int experiencia, int vidaActual, int vidaMaxima, int recursoActual, int recursoMaximo, int poder, int defensa, int racha, Inventario inventario, EstadoPersonaje estado) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.experiencia = experiencia;
        this.vidaActual = vidaActual;
        this.vidaMaxima = vidaMaxima;
        this.recursoActual = recursoActual;
        this.recursoMaximo = recursoMaximo;
        this.poder = poder;
        this.defensa = defensa;
        this.racha = racha;
        this.inventario = inventario;
        this.estado = estado;
    }

    // GETTER AND SETTER


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public int getVidaActual() {
        return vidaActual;
    }

    public void setVidaActual(int vidaActual) {
        this.vidaActual = vidaActual;
    }

    public int getVidaMaxima() {
        return vidaMaxima;
    }

    public void setVidaMaxima(int vidaMaxima) {
        this.vidaMaxima = vidaMaxima;
    }

    public int getRecursoActual() {
        return recursoActual;
    }

    public void setRecursoActual(int recursoActual) {
        this.recursoActual = recursoActual;
    }

    public int getRecursoMaximo() {
        return recursoMaximo;
    }

    public void setRecursoMaximo(int recursoMaximo) {
        this.recursoMaximo = recursoMaximo;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getRacha() {
        return racha;
    }

    public void setRacha(int racha) {
        this.racha = racha;
    }

    public Inventario getInventario() {
        return inventario;
    }

    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
    }

    public EstadoPersonaje getEstado() {
        return estado;
    }

    public void setEstado(EstadoPersonaje estado) {
        this.estado = estado;
    }

    // METODOS CONCRETOS


    public void recibirDano(int dano){
        if(dano < 0){
            throw new GalacticException("El daño recibido tiene que ser mayor a 0");
        }
        int danoNeto = Math.max(0, dano - getDefensa());
        int vidaRestante = getVidaActual() - danoNeto;
        setVidaActual(Math.max(0, vidaRestante));

        // Evaluar estado critico de la vida

        if(getVidaActual() == 0){
            setEstado(EstadoPersonaje.DERROTADO);
        } else if(getVidaActual() <= 10){
            setEstado(EstadoPersonaje.ATURDIDO);
        } else {
            setEstado(EstadoPersonaje.NORMAL);
        }
    }



    public void curar(int cantidad){
        if(cantidad <= 0){
            throw new GalacticException("La cantidad a curar tiene que ser mayor a 0");
        }
        if(getVidaActual() <= 0){
            throw new GalacticException("No se puede curar a un personaje derrotado");
        }

        int vidaNueva = getVidaActual() + cantidad;
        int vidaFinal = Math.min(vidaNueva, getVidaMaxima());
        setVidaActual(vidaFinal);
    }




    public void ganarExperiencia(int exp){
        if(exp <= 0){
            throw new GalacticException("La experiencia debe ser mayor a 0");
        }
        setExperiencia(getExperiencia() + exp);
        System.out.println("Experiencia acumulada " + getExperiencia());

        while(getExperiencia() >= (getNivel() * 100)){
            subirNivel();
        }

    }

    public void subirNivel(){
        setNivel(getNivel() + 1); // cada vez que es llamado el metodo se incrementa el nivel en 1

        // Cada vez que se sube de nivel se incrementa la vida y los recursos
        setVidaMaxima(getVidaMaxima() + 20);
        setRecursoMaximo(getRecursoMaximo() + 10);

        // cada vez que se sube de nivel se renueva la vida y recursos
        setVidaActual(getVidaMaxima());
        setRecursoActual(getRecursoMaximo());
    }



    // METODOS DE INTERFACE

    @Override
    public void consumirRecurso(Integer cantidad) {
        if(cantidad == null || cantidad <= 0){
            throw new GalacticException("La cantida a consumir tiene que ser mayor de 0");
        }
        if(cantidad > getRecursoActual()){
            throw new GalacticException("Recursos insuficientes, no puedes consumir mas de lo que tienes");
        }
        setRecursoActual(getRecursoActual() - cantidad);
    }
    @Override
    public void recuperarRecurso(Integer cantidad) {
        if(cantidad == null || cantidad <= 0){
            throw new GalacticException("La cantidad a recuperar tienes que ser mayor a 0");
        }
        int nuevoRecurso = getRecursoActual() + cantidad;
        int recursoFinal = Math.min(nuevoRecurso, getRecursoMaximo());
        setRecursoActual(recursoFinal);

    }
    @Override
    public Integer verRecursoActual() {
        return getRecursoActual();
    }
    @Override
    public Integer verRecursoMaximo() {
        return getRecursoMaximo();
    }
    // METODO ABSTRADTO

    public abstract int calcularPoderAtaque();

}
