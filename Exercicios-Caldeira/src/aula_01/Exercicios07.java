package aula_01;
import java.util.Scanner;
public class Exercicios07 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Quantos anos você tem?");
            int Idade = scanner.nextInt();
            if (Idade <16){
                System.out.println("Você não pode votar");
            }
            if (Idade ==16 || Idade==17 || Idade>65){
                System.out.println("Você pode votar, mas seu voto é facultativo");
            }
            if (Idade >=18 && Idade <=65) {
                System.out.println("Você tem que votar!");
            }
            scanner.close();
        }
    }

