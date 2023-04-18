package com.hedima.modelo;

import java.time.LocalDate;
//Al crear la clase seguido del nombre "extends" "Producto" que el nombre de la clase super.
public class ProductoPredecedero extends Producto {
    private LocalDate fCaducidad;

    @Override// click derecho Generate / override y selecionamos el metodo que queremos copiar de la clase super
    public String toString() {
        return super.toString() + " Fecha Caducidad: " + fCaducidad;
    }

    public ProductoPredecedero() {
    }

    public ProductoPredecedero(String nom, int cantidad, double pvp, LocalDate fCaducidad) {
        super(nom, cantidad, pvp);
        this.fCaducidad = fCaducidad;
    }

    public LocalDate getfCaducidad() {
        return fCaducidad;
    }

    public void setfCaducidad(LocalDate fCaducidad) {
        this.fCaducidad = fCaducidad;
    }
}
