package Semana2;

public class Multitask  extends Thread{
    @Override
    public void run() {
        System.out.println("Tarea 1");
    }

//    public static void main(String[] args) {
//        Multitask t1 = new Multitask(),
//                t2 = new Multitask(),
//                t3 = new Multitask();
//        t1.start();
//        t2.start();
//        t3.start();
//    }
}
class Multitasking implements Runnable{
    @Override
    public void run() {
        System.out.println("Tarea Uno Runable");
    }

    public static void main(String[] args) {
        Thread t1 =new Thread(new Multitasking());
        Thread t2 =new Thread(new Multitasking());

        Task1 tarea1 = new Task1();
        Task2 tarea2 = new Task2();

        t1.start();
        t2.start();

        tarea1.start();
        tarea2.start();

    }
}
class Task1 extends Thread{
    @Override
    public void run() {
        System.out.println("Tarea A de Runable");
    }
}
class Task2 extends Thread{
    @Override
    public void run() {
        System.out.println("Tarea G de Runable");
    }
}
