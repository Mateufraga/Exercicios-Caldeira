package aula_08;

public class CalculadoraHipoteca {
    private double valorDoEmprestimo;
    private double taxaDeJurosAnual;
    private int anosParaPagar;

    public CalculadoraHipoteca(double valorDoEmprestimo, double taxaDeJurosAnual, int anosParaPagar) {
        this.valorDoEmprestimo = valorDoEmprestimo;
        this.taxaDeJurosAnual = taxaDeJurosAnual;
        this.anosParaPagar = anosParaPagar;
    }

    public double calculaHipoteca(double valorDoEmprestimo, double taxaDeJurosAnual, int anosParaPagar){
        double totalPagar;
        double valorPorMes = 0;
        totalPagar = valorDoEmprestimo + (valorDoEmprestimo * ((taxaDeJurosAnual/100) * anosParaPagar));
        valorPorMes = totalPagar / (12 * anosParaPagar);
        System.out.println(totalPagar);
        return valorPorMes;
    }

    public double getValorDoEmprestimo() {
        return valorDoEmprestimo;
    }

    public double getTaxaDeJurosAnual() {
        return taxaDeJurosAnual;
    }

    public int getAnosParaPagar() {
        return anosParaPagar;
    }
}