package aula_04;

public abstract class Veiculo {
    String marca;
    String modelo;
    int ano;


    public abstract double calcularCustoViagem(double distancia);
}
