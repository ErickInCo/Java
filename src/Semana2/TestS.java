package Semana2;

public class TestS extends Thread{
    public void run(){
        for (int i=1; i<=10;i++){
            try {
                Thread.sleep(500);
                System.out.println(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }

    public static void main(String[] args) {
        TestS h1 =new TestS();
        h1.start();
        HilosS h2 =new HilosS();
        Thread hr2 =new Thread(h2);
        hr2.start();
    }
}

class HilosS implements Runnable{

    @Override
    public void run() {
        for (int i=1; i<=10;i++){
            try {
                Thread.sleep(100);
                System.out.println(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
