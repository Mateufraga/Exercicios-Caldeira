package aula_05;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Exercicios05 {
    public static void main(String[] args) {
        List<ListaImpressao> Lista = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("---MENU---\n1---Adicionar Documento para impressão!\n2---Remover Documento" +
                    "\n3---Exibir Lista\n4---Sair");
            int Escolha = scanner.nextInt();
            switch (Escolha) {
                case 1:
                    scanner.nextLine();
                    System.out.println("Digite o nome do documento para impressão!!");
                    String Nome = scanner.nextLine();
                    System.out.println("Digita quantas folhas tem o seu documento?");
                    int Folha = scanner.nextInt();
                    System.out.println("Diga para quando você quer este documento impresso!");
                    scanner.nextLine();
                    String Data = scanner.nextLine();
                    ListaImpressao listaimpressao = new ListaImpressao(Nome, Folha, Data);
                    Lista.add(listaimpressao);
                    System.out.println("Documento adicionado na fila!");
                    break;

                case 2:
                    System.out.println("Digite o número do documento que você deseja excluir?");
                    int Exluirtarefa = scanner.nextInt();
                    if (Exluirtarefa >= 1 && Exluirtarefa <= Lista.size()) {
                        Lista.remove(Exluirtarefa - 1);
                        System.out.println("Documento removido!");
                    } else {
                        System.out.println("Documento não foi removido, tente novamente!");
                    }
                    break;

                case 3:
                    System.out.println("Lista de produtos:");
                    for (int i = 0; i < Lista.size(); i++) {
                        ListaImpressao J = Lista.get(i);
                        System.out.println((i+1)+" "+J.Nome+" "+J.Folhas+" "+J.Data);
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

