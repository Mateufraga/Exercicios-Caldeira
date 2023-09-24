package aula_04;

public class Carro extends Veiculo {
    @Override
   public double calcularCustoViagem(double disntancia) {

        double custo = disntancia * 0.20;
        return custo;
    }

    public Carro(String modelo, String marca, int ano) {

        this.ano = ano;
        this.marca = marca;
        this.modelo = modelo;

    }
}
