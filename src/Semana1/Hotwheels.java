package Semana1;

import java.util.Arrays;

public class Hotwheels {
    String colorPrimario, colorSecundario;
    String numeroSerie;
    int nLlantas;
    int nPartesMoviles;
    double velocidad;
    boolean FuncionExtra;
    String [] partesMoviles;

    @Override
    public String toString() {
        return "Hotwheels{" +
                "colorPrimario='" + colorPrimario + '\'' +
                ", colorSecundario='" + colorSecundario + '\'' +
                ", numeroSerie='" + numeroSerie + '\'' +
                ", nLlantas=" + nLlantas +
                ", nPartesMoviles=" + nPartesMoviles +
                ", velocidad=" + velocidad +
                ", FuncionExtra=" + FuncionExtra +
                ", partesMoviles=" + Arrays.toString(partesMoviles) +
                '}';
    }
    public String getColorPrimario() {
        return colorPrimario;
    }
    public String getColorSecundario() {
        return colorSecundario;
    }
    public String getNumeroSerie() {
        return numeroSerie;
    }
    public int getnLlantas() {
        return nLlantas;
    }
    public int getnPartesMoviles() {
        return nPartesMoviles;
    }
    public double getVelocidad() {
        return velocidad;
    }
    public boolean isFuncionExtra() {
        return FuncionExtra;
    }
    public String[] getPartesMoviles() {
        return partesMoviles;
    }

    public void setColorPrimario(String colorPrimario) {
        this.colorPrimario = colorPrimario;
    }
    public void setColorSecundario(String colorSecundario) {
        this.colorSecundario = colorSecundario;
    }
    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }
    public void setnLlantas(int nLlantas) {
        this.nLlantas = nLlantas;
    }
    public void setnPartesMoviles(int nPartesMoviles) {
        this.nPartesMoviles = nPartesMoviles;
    }
    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }
    public void setFuncionExtra(boolean funcionExtra) {
        FuncionExtra = funcionExtra;
    }
    public void setPartesMoviles(String[] partesMoviles) {
        this.partesMoviles = partesMoviles;
    }
}
