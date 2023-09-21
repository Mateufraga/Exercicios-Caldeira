package aula_01;
import java.util.Scanner;

public class Exercicios02 {
    public static void main (String []args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println ("Qual seu nome?");
        String Nome = scanner.nextLine();
        System.out.println("Seu nome é "+Nome+".");
        scanner.close();
    }
}