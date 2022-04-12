package Semana2;

abstract class Mountain{
    Mountain(){
        System.out.println("Se ha creado una bicicleta de montaña");
    }
    abstract void cambiarVel();
    void cambiarCol(){
        System.out.println("Cambiando el color a azul");
    }
}
class Magistroni extends Mountain{

    @Override
    void cambiarVel() {
        System.out.println("Se deben de desbloquear las perillas del manubrio primero");
    }
}
public class bicicleta {
    void cambiarVelocidad(){
        System.out.println("Gira la perilla");
    }

    public static void main(String[] args) {
        Mountain bicim1=new Magistroni();
        bicim1.cambiarVel();
        bicim1.cambiarCol();
    }
}
