package Semana1;

public class bici {


    //Caracteristicas
    public int pins, rodada;
    public double velocidad;


    public bici(int pins, int rodada, double velocidad) {
        this.pins = pins;
        this.rodada = rodada;
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return "bici{" +
                "pins=" + pins +
                ", rodada=" + rodada +
                ", velocidad=" + velocidad +
                '}';
    }

    public int getPins() {
        return pins;
    }

    public void setPins(int pins) {
        this.pins = pins;
    }

    public int getRodada() {
        return rodada;
    }

    public void setRodada(int rodada) {
        this.rodada = rodada;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }
}