package aula_08;

import org.junit.Assert;
import org.junit.Test;

public class TesteOperacaoNumero {
    @Test
    public void testaSoma(){
        OperacaoNumero operacao = new OperacaoNumero();
        int[] numerosParaSomar = {2, 7, 4, 3};

        int soma = operacao.somarNumeros(numerosParaSomar);

        Assert.assertEquals(16,soma);
    }

    @Test
    public void testaEhPar(){
        OperacaoNumero operacao = new OperacaoNumero();

        boolean yesOrNo = operacao.ehPar(2) ;

        Assert.assertEquals(true,yesOrNo);
    }

    @Test
    public void testaCalcularFatorial(){
        OperacaoNumero operacao = new OperacaoNumero();

        int fatoracao = operacao.calcularFatorial(4) ;

        Assert.assertEquals(24,fatoracao);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testaExcecaoDoCalcularFatorial(){
        OperacaoNumero operacao = new OperacaoNumero();

        operacao.calcularFatorial(-1) ;
    }

    @Test
    public void testaEhPalindromo(){
        OperacaoNumero operacao = new OperacaoNumero();

        boolean yesOrNo = operacao.ehPalindromo("Asa");

        Assert.assertEquals(true,yesOrNo);
    }

    @Test
    public void testaCalcularFibonacci() {
        OperacaoNumero operacaoNumero = new OperacaoNumero();

        int fibonacci = operacaoNumero.calcularFibonacci(6);

        Assert.assertEquals(8,fibonacci);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testaExcecacoDaCalcularFibonacci(){
        OperacaoNumero operacaoNumero = new OperacaoNumero();

        operacaoNumero.calcularFibonacci(-1);
    }
}