package aula_01;
import java.util.Scanner;
public class Exercicios10 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Qual seu ano de nascimento?");
            int Anonascimento = scanner.nextInt();
            int Idade = (2023-Anonascimento);
            System.out.println("Você tem "+(Idade)+" anos.");
            scanner.close();
        }
    }

