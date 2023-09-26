package aula_05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicios03 {
    public static void main(String[] args) {
        List<Tarefas> Lista = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("---MENU---\n1---Adicionar Tarefa\n2---Remover Tarefa\n3---Exibir Tarefas\n4---Sair");
            int Escolha = scanner.nextInt();
            switch (Escolha) {
                case 1:
                    scanner.nextLine();
                    System.out.println("Digite a sua tarefa!");
                    String Nometarefa = scanner.nextLine();
                    System.out.println("Digita a descrição da tarefa");
                    String Descricao = scanner.nextLine();
                    System.out.println("Diga o dia que esta ");
                    String Data = scanner.nextLine();
                    Tarefas tarefa = new Tarefas(Nometarefa, Descricao, Data);
                    Lista.add(tarefa);
                    System.out.println("Tarefa adicionada");
                    break;

                case 2:
                    System.out.println("Digite o número da tarefa que você deseja excluir?");
                    int Exluirtarefa = scanner.nextInt();
                    if (Exluirtarefa >= 1 && Exluirtarefa <= Lista.size()) {
                        Lista.remove(Exluirtarefa - 1);
                        System.out.println("Tarefa removida!");
                    } else {
                        System.out.println("Tarefa não foi removida, tente novamente!");
                    }
                    break;

                case 3:
                    System.out.println("Lista de tarefas:");
                    for (int i = 0; i < Lista.size(); i++) {
                    Tarefas J = Lista.get(i);
                        System.out.println((i+1)+" "+J.Nome+" "+J.Descricao+" "+J.Data);
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
