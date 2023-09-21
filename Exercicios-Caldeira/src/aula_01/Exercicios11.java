package aula_01;
import java.util.Scanner;
public class Exercicios11 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Quantos graus em celsius está agora?");
            float Celsius = scanner.nextFloat();
            float Fahrenheit = (((float) 9 /5) * Celsius) + 32;
            System.out.println("Está "+Fahrenheit+" graus agora em Fahrenheit");
            scanner.close();
        }
    }

