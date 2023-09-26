package aula_05;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicios04 {
    public static void main(String[] args) {
        List<ListaCompras> Lista = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("---MENU---\n1---Adicionar Produto\n2---Remover Produto\n3---Exibir Lista\n4---Sair");
            int Escolha = scanner.nextInt();
            switch (Escolha) {
                case 1:
                    scanner.nextLine();
                    System.out.println("Digite o seu produto!");
                    String Nomeproduto = scanner.nextLine();
                    System.out.println("Digita a data de validade do produto!");
                    String Datavalidade = scanner.nextLine();
                    System.out.println("Diga o local que irá comprar este produto");
                    String LocalCompra = scanner.nextLine();
                    ListaCompras listacompra = new ListaCompras(Nomeproduto, Datavalidade, LocalCompra);
                    Lista.add(listacompra);
                    System.out.println("Produto adicionado");
                    break;

                case 2:
                    System.out.println("Digite o número do produto que você deseja excluir?");
                    int Exluirtarefa = scanner.nextInt();
                    if (Exluirtarefa >= 1 && Exluirtarefa <= Lista.size()) {
                        Lista.remove(Exluirtarefa - 1);
                        System.out.println("Produto removido!");
                    } else {
                        System.out.println("Produto não foi removido, tente novamente!");
                    }
                    break;

                case 3:
                    System.out.println("Lista de produtos:");
                    for (int i = 0; i < Lista.size(); i++) {
                        ListaCompras J = Lista.get(i);
                        System.out.println((i+1)+" "+J.Nome+" "+J.DataValidade+" "+J.LocalCompra);
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


