package com.Huguito.hilos;

public class MiHilo extends Thread{
    @Override
    public void run(){
        System.out.println("Hilo 1 corriendo usando la clase padre: Thread");
    }
}
