package aula_01;
import java.util.Scanner;
public class Exercicios09 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("---MENU---");
            System.out.println("1 - Gestante");
            System.out.println("2 - PCD");
            System.out.println("3 - Idoso");
            System.out.println("4 - Nenhuma das alternativas acima");
            int S = scanner.nextInt();
            switch (S) {
                case 1:
                    System.out.println("Você tem fila prioritária");
                    break;
                case 2:
                    System.out.println("Você tem fila prioritária");
                    break;
                case 3:
                    System.out.println("Você tem fila prioritária");
                    break;
                case 4:
                    System.out.println("Você não tem fila prioritária");
                    break;
                default:
                    System.out.println("Não identificamos sua resposta, por favor tente novamente.");
            }
            scanner.close();
        }
    }

