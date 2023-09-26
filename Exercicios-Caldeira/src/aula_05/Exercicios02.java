package aula_05;
import java.util.Random;
import java.util.Scanner;
public class Exercicios02 {
    public static void main(String[] args) {
        int[] Numeros = new int[10];
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Diga um número de 0 a 100 para ver se está na lista de 10 números!");
        for (int i = 0; i <= 9; i++) {
            Numeros[i] = random.nextInt(0,100);
        }
        int Chute = scanner.nextInt();
        while (Chute != Numeros[0] && Chute != Numeros[1] && Chute != Numeros[2] && Chute != Numeros[3] && Chute !=
                Numeros[4] && Chute != Numeros[5] && Chute != Numeros[6] && Chute != Numeros[7] && Chute != Numeros[8]
                && Chute != Numeros[8] && Chute != Numeros[9]) {
            System.out.println("Errou! Tente novamente.");
            Chute = scanner.nextInt();
        }
        System.out.println("Você acertou!");
        scanner.close();
    }
}
