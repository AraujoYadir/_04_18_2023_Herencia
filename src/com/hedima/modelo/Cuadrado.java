package com.hedima.modelo;

public class Cuadrado extends Figura {
    private double lado;

    public double calcularAreaC(){
        double areaC= lado*lado;
        return areaC;
    }

    public Cuadrado() {
    }

    public Cuadrado(int x, int y, double lado) {
        super(x, y);
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}


