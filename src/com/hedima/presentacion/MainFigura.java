package com.hedima.presentacion;

import com.hedima.modelo.Cuadrado;
import com.hedima.modelo.Figura;
import com.hedima.modelo.Triangulo;

public class MainFigura {
    public static void main(String[] args) {
        Figura f1= new Figura(7,8   );
        System.out.println(f1.mostrarPocision());
        Triangulo t1= new Triangulo (4,4,5,4);
        System.out.println(t1.calcularArea());
        Cuadrado c1= new Cuadrado (5, 5, 5);
        System.out.println(c1.calcularAreaC());


    }
}
