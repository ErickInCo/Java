package Semana1;

public class PruebaHotwheels {
    public static void main(String[] args) {
        show();
    }
    public static void  show(){
        Hotwheels camioneta = new Hotwheels();
        camioneta.setColorPrimario("Verde");
        camioneta.setColorSecundario("Gris");
        camioneta.setNumeroSerie("EN373");
        camioneta.setnLlantas(4);
        camioneta.setnPartesMoviles(7);
        camioneta.setVelocidad(1.5);
        camioneta.setFuncionExtra(true);
        String [] partes = {"LlantaFi","LlantaFd","LlantaTi","LlantaTd","Cabina","MotorI","MotorD"};
        camioneta.setPartesMoviles(partes);
        System.out.println(camioneta.toString());
    }
}
