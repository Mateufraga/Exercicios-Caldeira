package aula_04;

import java.awt.geom.Area;
import java.util.ArrayList;

public class Triangulo extends FormaGeometrica {
    @Override
    public double calcularArea() {
    double Area =  (this.Base * this.Altura) /2;
    return Area;
    }
    double Altura;
    double Base;

    public Triangulo(double altura, double base) {

        this.Altura = altura;
        this.Base = base;
    }
}
