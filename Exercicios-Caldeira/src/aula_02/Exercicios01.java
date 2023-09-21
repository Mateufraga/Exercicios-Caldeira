package aula_02;
import java.util.Scanner;

public class Exercicios01 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Me diga um intervalo de números.");
        int Intervalo = scanner.nextInt();
        for (int i = 0; i <= Intervalo; i++) {
            if (Primo(i)) {
                System.out.println(i + " É primo");
            }
            }
          scanner.close();
        }

        public static boolean Primo(int Primo) {
         if (Primo <= 1) {
             return false;
         }
         if (Primo <= 3) {
             return true;           }
         if (Primo %2 == 0 || Primo %3 == 0) {
             return false;
         }
         for (int i = 5; i*i <= Primo; i += 6) {
             if (Primo % i == 0 || Primo % (i + 2) == 0) {
                 return false;
             }
         }
        return true;
        }
    }