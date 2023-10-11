package aula_08;

import org.junit.Assert;
import org.junit.Test;



public class TesteCalculadora {
    @Test
    public void adicionar() {
        Calculadora calculadora = new Calculadora();

        int adicao = calculadora.adicao(2, 6);

        Assert.assertEquals(8, adicao);
    }

    @Test
    public void subtrair() {
        Calculadora calculadora = new Calculadora();

        int subtracao = calculadora.subtracao(1,4);

        Assert.assertEquals(-3, subtracao);
    }

    @Test
    public void multiplicar() {
        Calculadora calculadora = new Calculadora();

        int multiplicacao = calculadora.multiplicacao(3,6);

        Assert.assertEquals(18, multiplicacao);
    }

    @Test
    public void dividir() {
        Calculadora calculadora = new Calculadora();

        int divisao = calculadora.divisao(18,2);

        Assert.assertEquals(9, divisao);
    }

    @Test
    public void raizQuadrada() {
        Calculadora calculadora = new Calculadora();

        double sqrt = calculadora.raizQuadrada(9.0);

        Assert.assertEquals(3.0, sqrt, 0.001);
    }

    @Test
    public void potenciacao() {
        Calculadora calculadora = new Calculadora();

        double potencia = calculadora.potenciacao(2,5);

        Assert.assertEquals(32,potencia, 0.001);
    }
}