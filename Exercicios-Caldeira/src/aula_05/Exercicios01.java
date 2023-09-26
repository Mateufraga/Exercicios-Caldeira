package aula_05;
import java.util.Scanner;
public class Exercicios01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] Numeros = new int[5];
        System.out.println("Digite 5 números!");
        int Soma = 0;

        for (int i = 0; i <= 4; i ++) {
             Numeros[i] = scanner.nextInt();
             Soma = Soma + Numeros[i];
        }
        double Media = (double) Soma / Numeros.length;
        System.out.println("Sua soma é "+Soma+" e a média destes números é "+Media);
    scanner.close();
    }
}
