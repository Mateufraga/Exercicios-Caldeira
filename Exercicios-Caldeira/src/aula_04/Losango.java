package aula_04;

import java.util.ArrayList;

public class Losango extends FormaGeometrica {
    @Override
    public double calcularArea() {
        double Area = (this.Diagonalmenor * this.Diagonalmaior)/2;
        return Area;
    }
    double Diagonalmaior;
    double Diagonalmenor;

    public Losango(double diagonalmaior, double diagonalmenor) {
        this.Diagonalmenor = diagonalmenor;
        this.Diagonalmaior = diagonalmaior;

    }
}

