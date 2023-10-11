package aula_08;

import org.junit.Assert;
import org.junit.Test;

public class TesteCalculadoraHipoteca {
    @Test
    public void hipoteca(){
        CalculadoraHipoteca hipotecaTeste = new CalculadoraHipoteca(2278,15,6);

        double valorPorMes = hipotecaTeste.calculaHipoteca(hipotecaTeste.getValorDoEmprestimo(),
                hipotecaTeste.getTaxaDeJurosAnual(), hipotecaTeste.getAnosParaPagar());

        Assert.assertEquals(60.1138888, valorPorMes, 0.001);
    }
}