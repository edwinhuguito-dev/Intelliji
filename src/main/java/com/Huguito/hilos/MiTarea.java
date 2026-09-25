package com.Huguito.hilos;

public class MiTarea implements Runnable{

    @Override
    public void run(){
        System.out.println("Hilo 2 corriendo implementando la interface: Runnable");
    }
}
