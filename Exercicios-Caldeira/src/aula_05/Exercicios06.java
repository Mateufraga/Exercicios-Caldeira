package aula_05;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Exercicios06 {
    public static void main(String[] args) {
        List<Passagem> Lista = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("---MENU---\n1---Reservar uma passagem!\n2---Cancelar uma reserva" +
                    "\n3---Exibir reservas feitas nesta máquina!\n4---Sair");
            int Escolha = scanner.nextInt();
            switch (Escolha) {
                case 1:
                    scanner.nextLine();
                    System.out.println("Digite o seu nome!!");
                    String Nome = scanner.nextLine();
                    System.out.println("Qual será seu destino?");
                    String Destino = scanner.nextLine();
                    System.out.println("Nos informe seu cpf por favor!");
                    String cpf = scanner.nextLine();
                    System.out.println("Qual será o dia de embarque!");
                    String embarque = scanner.nextLine();
                    System.out.println("Quando será o dia de retorno?");
                    String retorno = scanner.nextLine();
                    Passagem passagem = new Passagem(Nome, Destino, cpf, embarque, retorno);
                    Lista.add(passagem);
                    System.out.println("Reserva feita com sucesso!");
                    break;

                case 2:
                    System.out.println("Digite a reserva que você deseja excluir?");
                    int Exluirtarefa = scanner.nextInt();
                    if (Exluirtarefa >= 1 && Exluirtarefa <= Lista.size()) {
                        Lista.remove(Exluirtarefa - 1);
                        System.out.println("Reserva removida!");
                    } else {
                        System.out.println("Reserva não foi removida, tente novamente!");
                    }
                    break;

                case 3:
                    System.out.println("Reservas:");
                    for (int i = 0; i < Lista.size(); i++) {
                        Passagem J = Lista.get(i);
                        System.out.println((i+1)+" "+J.Nome+" "+J.Destino+" "+J.CPF+" "+J.DataEmbarque+" "+J.DataRetorno);
                    }
                    break;

                case 4:
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Erro, entre em contato com o suporte.");
            }
        }
    }
}


