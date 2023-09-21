package aula_02;
import java.util.Scanner;
import java.lang.String;

public class Exercicios03 {

        public static void main(String[] args) {
            Scanner SCANNER = new Scanner(System.in);
            System.out.println("Digite uma palavra!");
            String Frase = SCANNER.nextLine();
            int Tamanho = Frase.length()/2;
            String Metade = Frase.substring(0,Tamanho);
            System.out.println("Comi algumas letras: " + Metade);
            SCANNER.close();
        }
    }

