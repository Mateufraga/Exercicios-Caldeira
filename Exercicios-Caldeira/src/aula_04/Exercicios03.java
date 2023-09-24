package aula_04;

public class Exercicios03 {
    public static void main(String[] args) {
        ContaCorrente Auzys = new ContaCorrente(10000);
        ContaPoupanca Floki = new ContaPoupanca(10000);
        SeguroVida Barbosa = new SeguroVida();
        GerenciadorDeImpostoDeRenda ReceitaFederal = new GerenciadorDeImpostoDeRenda();
        ReceitaFederal.adicionar(Auzys);
        ReceitaFederal.adicionar(Floki);
        ReceitaFederal.adicionar(Barbosa);
        System.out.println("Total de dividendos para pagar à receita "+ ReceitaFederal.Imposto);
    }
}
