package aula_04;

import java.util.ArrayList;

public class Circulo extends FormaGeometrica {
    @Override
    public double calcularArea() {
        double Area = 3.1418 * (this.Raio * this.Raio);
        return Area;
    }

    double Raio;
    public Circulo(double raio) {

        this.Raio = raio;
    }
}
