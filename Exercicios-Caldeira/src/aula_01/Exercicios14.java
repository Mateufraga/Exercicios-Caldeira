package aula_01;
import java.util.Scanner;
public class Exercicios14 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Me dê um número inteiro");
            int NumeroInteiro = scanner.nextInt();
            int i;
            for (i = NumeroInteiro -1; i > 0; i--) {
                NumeroInteiro *= i;
            } System.out.println("O número fatorial dele é "+NumeroInteiro);
            scanner.close();
        }
    }

