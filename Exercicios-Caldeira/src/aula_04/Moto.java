package aula_04;

public class Moto extends Veiculo {
    @Override
    public double calcularCustoViagem(double distancia) {
       double custo = distancia * 0.15;
       return custo;
    }
    public Moto(String Modelo, String Marca, int Ano) {

        this.ano = Ano;
        this.modelo = Modelo;
        this.marca = Marca;

    }
}
