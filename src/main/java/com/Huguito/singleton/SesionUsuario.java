package com.Huguito.singleton;

public class SesionUsuario {

    private static SesionUsuario instancia;

    private String usuario;
    private String rol;

    private SesionUsuario(){
        this.usuario = "Invitado";
        this.rol = "Sin permisos";
    }

    public static SesionUsuario getInstance(){
        if(instancia == null){
            instancia = new SesionUsuario();
        }
        return instancia;
    }

    public void iniciarSesion(String usuario, String rol){
        this.usuario = usuario;
        this.rol = rol;
        System.out.println("Sesion iniciada correctamente : " + usuario);
    }

    public void serrarSesion(){
        System.out.println("Cerrar sesion: " + this.usuario);
        this.usuario = "invitado";
        this.rol = "sin permisos";
    }

    public void mostrarPerfil(){
        System.out.println("Perfil del usuario: " + this.usuario + " rol " + this.rol);
    }

}
