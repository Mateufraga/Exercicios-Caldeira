package aula_02;
import java.util.Scanner;
public class Exercicios05 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Quantos soldados iremos enfrentar?");
            int Soldados;
            do {
                Soldados = scanner.nextInt();

                if (Soldados > 300000) {
                    System.out.println("Um pouco menos!");
                }
                else if (Soldados < 300000) {
                    System.out.println("Um pouco mais!");
                } else {
                    System.out.println("Acertou!");
                }
            } while (Soldados != 300000);
            scanner.close();
        }
    }

