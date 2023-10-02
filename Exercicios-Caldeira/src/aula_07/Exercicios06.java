package aula_07;

public class Exercicios06 {
    public static void main(String[] args) {
    try {
        ContaBancaria Adamastor = new ContaBancaria(900);
        Adamastor.Saque(100);
        System.out.println(Adamastor.Saldo);
    } catch (SaldoInsuficienteException Erro) {
        throw new RuntimeException(Erro);
    }
    }
}
