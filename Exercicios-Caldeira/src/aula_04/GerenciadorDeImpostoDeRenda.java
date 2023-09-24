package aula_04;

public class GerenciadorDeImpostoDeRenda {
    double Imposto = 0;

    public void adicionar(Interface tributavel) {
        double tributos = tributavel.calculardoraDeTributos();
        Imposto += tributos;
    }
}
