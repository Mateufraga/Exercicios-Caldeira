package aula_07;

public class ContaBancaria {
    double Saldo;

    public ContaBancaria(double saldo) {
        this.Saldo = saldo;
    }

    public double Saque(double Valor) throws SaldoInsuficienteException {
        if (Valor > this.Saldo) {
            throw new SaldoInsuficienteException("Não há dinheiro suficiente");
        } else {
            this.Saldo -= Valor;
        }
            return this.Saldo;
        }
    }
