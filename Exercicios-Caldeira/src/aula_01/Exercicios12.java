package aula_01;
import java.util.Scanner;
import java.text.Normalizer;
public class Exercicios12 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite uma palavra ou uma frase para que possamos contar as vogais!");
            int i, contagem = 0;
            String PalavraFor = scanner.nextLine();
            PalavraFor = PalavraFor.toLowerCase();
            PalavraFor = Normalizer.normalize(PalavraFor, Normalizer.Form.NFD)
                    .replaceAll("[^\\p{ASCII}]", "");
            for (i = 0; i < PalavraFor.length(); i++) {
                char Vogais = PalavraFor.charAt(i);
                if (Vogais == 'a' || Vogais == 'e' || Vogais == 'i' || Vogais == 'o' || Vogais == 'u') {
                    contagem++;
                }
            }
            System.out.println("Há "+contagem+" vogais na sua frase/palavra.");
            scanner.close();
        }
    }

