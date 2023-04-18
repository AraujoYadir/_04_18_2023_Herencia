package com.hedima.modelo;

public class Producto {
    private String nom;
    private int cantidad;
    private double pvp;

    public String toString() {
        return "Nomre " + nom + " Cantidad " + cantidad + "Precio " + pvp;
    }
    public Producto(){

    }

    public Producto(String nom, int cantidad, double pvp) {
        this.nom = nom;
        this.cantidad = cantidad;
        this.pvp = pvp;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPvp() {
        return pvp;
    }

    public void setPvp(double pvp) {
        this.pvp = pvp;
    }
}
