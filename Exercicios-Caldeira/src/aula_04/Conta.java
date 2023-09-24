package aula_04;

public class Conta {
    double Saldo;

    public Conta(double saldo) {
        this.Saldo = saldo;
    }

    public void Sacar(double Saque) {
       if (Saque <= this.Saldo) {
            this.Saldo = this.Saldo - Saque;
       } else {
           System.out.println("Você não tem saldo suficiente para realizar este saque!");
       }
    }
    public void Depositar(double deposito) {
        if (deposito > 0) {
             this.Saldo = deposito + this.Saldo;
        } else {
            System.out.println("Você não tem saldo suficiente para realizar este depósito!");
        }
    }
    public double Saldo() {
       return Saldo;
    }
}
