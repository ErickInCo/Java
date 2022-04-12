package Semana1;

public class PruebaBici {
    public static void main(String[] args) {
        show();
    }


    public static void show() {
        bici biciMonta = new bici(23,29,10);
        biciMonta.setPins(5);
        System.out.println(biciMonta.toString());

    }


}
