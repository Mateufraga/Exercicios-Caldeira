package aula_08;

public class Main {
    public static void main(String[] args) {
        CalculadoraHipoteca hipoteca = new CalculadoraHipoteca(2278,15,6); //total 1400, ~ 29.16666668 por mês
        System.out.println(hipoteca.calculaHipoteca(hipoteca.getValorDoEmprestimo(), hipoteca.getTaxaDeJurosAnual(), hipoteca.getAnosParaPagar()));
    }
}