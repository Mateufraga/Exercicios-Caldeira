package aula_04;

import java.util.ArrayList;

public class Quadrado extends  FormaGeometrica {
    @Override
    public double calcularArea() {
    double Area = this.Lado * this.Lado;
    return Area;
    }
    double Lado;

    public Quadrado(double lado) {
        this.Lado = lado;

    }
}
