package aula_01;
import java.util.Scanner;
public class Exercicios03 {

    public static void main (String []args) {
            Scanner scanner = new Scanner (System.in);
            System.out.println("Digite dois números!");
            int Números = scanner.nextInt();
            int Números1 = scanner.nextInt();
            System.out.println("Os números digitados são "+ Números+" e "+Números1+".");
            scanner.close();
        }
    }

