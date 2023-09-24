package aula_04;

public class ContaPoupanca extends Conta implements Interface {

    public ContaPoupanca(double Saldo) {
        super(Saldo);
    }
    @Override
   public double calculardoraDeTributos() {
        return 0;
    }
}
