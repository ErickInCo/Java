package Semana2;

import java.sql.SQLOutput;

public class HilosT extends Thread{
    @Override// State Runable
    public void run() {
        System.out.println("El hilo se esta ejecutando");
    }

    /*
    public void start(){
        //Inicia la ejecucion de un hilo con el run()
    }
    Sleep  detiene de manera temporarl
    Join   espera a que un hilo se muera
    getpriority regresa la prioridad de un hilo
    setpriority establece la prioridad de un hilo
    getname Nombre del hilo
    currentthread referencia a un hilo que se esta ejecutando
    detid  Regresa el id del hilo
    thread.state

    */
    public static void main(String[] args) {
        HilosT hilo =new HilosT();// Entra al staate new
        hilo.start();//Se inicializa el hilo

    }
}

class HilosR implements Runnable{

    @Override
    public void run() {
        System.out.println("El hilo de runable esta corriendo");
    }

    public static void main(String[] args) {
        HilosR hilo = new HilosR();
        Thread t =new Thread(hilo);
        t.start();

    }
}