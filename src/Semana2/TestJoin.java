package Semana2;

public class TestJoin extends Thread{
    @Override
    public void run() {
        for(int i=1; i<=5;i++){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        TestJoin t1 = new TestJoin(),
                t2 = new TestJoin(),
                t3 = new TestJoin();
        showDetails(t1,t2,t3);
        t1.start();
        try {
            t1.join(1500);
            t1.setName("LaunchX");
            t1.setPriority(MAX_PRIORITY);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
        t3.start();
    }
    public static void showDetails(TestJoin t1, TestJoin t2, TestJoin t3){
        System.out.println("Hilo 1: "+t1.getName()+" id:"+ t1.getId()+" Estado: "+t1.getState()+" prioridad: " + t1.getPriority());
        System.out.println("Hilo 2: "+t2.getName()+" id:"+ t2.getId()+" Estado: "+t2.getState()+" prioridad: " + t2.getPriority());
        System.out.println("Hilo 3: "+t3.getName()+" id:"+ t3.getId()+" Estado: "+t3.getState()+" prioridad: " + t3.getPriority());
    }
}
