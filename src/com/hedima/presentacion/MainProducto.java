package com.hedima.presentacion;

import com.hedima.modelo.Producto;
import com.hedima.modelo.ProductoPredecedero;

import java.time.LocalDate;

public class MainProducto {
    public static void main(String[] args) {
        Producto p1 = new Producto("Tendiplus", 3, 10.0);
        System.out.println(p1.toString());
        ProductoPredecedero pp1 = new ProductoPredecedero("Calmplus", 4, 8.0, LocalDate.of(2025,10,1));
        System.out.println(pp1.toString());
    }

}
