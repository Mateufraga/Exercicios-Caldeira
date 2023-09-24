package aula_04;

import java.util.List;

public class Exercicios02 {
    public static void main(String[] args) {

        FormaGeometrica[] Formas = new FormaGeometrica[]{
                new Quadrado(20),
                new Retangulo(20, 30),
                new Triangulo(20, 40),
                new Circulo(80),
                new Losango(70, 55)



        };
        for (FormaGeometrica Forma : Formas) {
            String Tipo = Forma.getClass().getSimpleName();
            double Area = Forma.calcularArea();
            System.out.println("Tipo:  "+Tipo+" Area: "+Area);
        }
    }
}
