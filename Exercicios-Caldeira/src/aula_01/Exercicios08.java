package aula_01;
import java.util.Scanner;
public class Exercicios08 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner (System.in);
            System.out.println("Quantos anos você tem?");
            int Idade = scanner.nextInt();
            if (Idade <18) {
                System.out.println("Você não tem idade suficiente para comprar um automóvel");

            } else  {
                System.out.println("Qual o seu salário?");
                Double Salário = scanner.nextDouble();
                if (Salário >2000) {
                    System.out.println("Você está habilitado para fazer um consórcio");
                } else {
                    System.out.println("Você não atende os requisistos básicos");
                }
            }
            scanner.close();
        }
    }

