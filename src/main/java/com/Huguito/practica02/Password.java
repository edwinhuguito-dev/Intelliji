package com.Huguito.practica02;

public class Password {

    String contra;

    // CONSTRUCTOR

    public Password(String contra) {
        this.contra = contra;
    }

    // GETTER AND SETTER

    public String getContra() {
        return contra;
    }

    public boolean setContra(String contra) {
        if(!(contra.length() > 8 || contra.isBlank())) {
            System.out.println("Contraseña incorrecta.");
            return false;
        } else {
            this.contra = contra;
            System.out.println("Contraseña correcta.");
            return true;
        }


    }





}
