package aula_02;
import java.util.Scanner;
import java.lang.String;
public class Exercicios04 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite uma palavra");
            String Palavra = scanner.nextLine();
            char[] Array = Palavra.toCharArray();
            int Comprimento = Array.length;
            for (int i = 0; i < Comprimento/2; i++) {
                char Temporário = Array[i];
                Array[i] = Array[Comprimento - i - 1];
                Array[Comprimento - i - 1] = Temporário;
            } String Fraseinvertida = new String(Array);
            System.out.println(Fraseinvertida);
            scanner.close();
        }
    }



