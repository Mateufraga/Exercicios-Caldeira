package aula_01;
import java.util.Scanner;

public class Exercicios05 {

        public static void main (String []args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o seu salário?");
        Double Salariominimo = scanner.nextDouble()/1320;
        System.out.println("Você ganha "+Salariominimo+" Salários mínimos.");
        scanner.close();
    }
}
