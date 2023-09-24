package aula_04;

public class ContaCorrente extends Conta implements Interface {

    public ContaCorrente(double Saldo) {
        super(Saldo);
    }
    @Override
    public double calculardoraDeTributos() {
        return this.Saldo * 0.01;
    }
}
