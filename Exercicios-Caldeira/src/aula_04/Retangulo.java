package aula_04;

import java.util.ArrayList;

public class Retangulo extends FormaGeometrica{
    @Override
   public double calcularArea() {
        double Area = this.Base * this.Altura;
        return Area;
    }
    double Altura;
    double Base;

    public Retangulo(double altura, double base) {
        this.Altura = altura;
        this.Base = base;

    }
}
