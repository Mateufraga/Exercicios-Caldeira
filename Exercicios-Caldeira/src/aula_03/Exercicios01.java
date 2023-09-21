package aula_03;

import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.Date;
import java.time.LocalTime;


public class Exercicios01 {

    public static void main(String[] args) {
        LocalTime Hora = LocalTime.now();
        Scanner scanner = new Scanner(System.in);
        Banco Smite = new Banco("nomedaconta", "051.911.650-22", 72426898,
                "Smite", "Rua olimpo, bairro Panteão, número 456", 7000.0, Hora);
        Banco Smite1 = new Banco("nomedaconta1", "861.890.634-56", 72526898,
                "Smite", "Rua olimpia, bairro Pente, número 467", 1200.0, Hora);

       /* Smite.TRANSFERENCIA(Smite1,3000.0,Smite.Hora);
        Smite.PIX(500.0,Smite.Hora);
        Smite.SAQUE(1000.0);
        Smite.PrintTransacao(); */


        Smite.VERIFICARCPF(Smite.CPF);
        boolean Validação = Smite.VERIFICARCPF(Smite.CPF);
        if (Validação) {
            System.out.println("Seu CPF é válido!");
        } else {
            System.out.println("Esse CPF não é válido!");
        }

        /*Smite.TROCAENDERECO(("Pintinho piu, número 374"));
        System.out.println(Smite.Endereco); */

        /*Smite.TARIFAMENSAL(21.70);
        System.out.println(Smite.Saldo);*/

        /*Smite.CALCULARJUROS(0.20);
        System.out.println(Smite.Saldo);*/

        /*Smite1.SAQUE(1200.0);
        Smite1.FECHACONTA();
        System.out.println(Smite1.Saldo);*/
    }
}

