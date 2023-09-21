package aula_01;
import java.util.Scanner;
public class Exercicios13 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("---CONVERSOR DE DÓLARES PARA REAIS---\n"+"Quantos doláres você tem?");
            float Doláres = scanner.nextFloat();
            System.out.println("Qual a taxa de câmbio atual?");
            float Câmbio = scanner.nextFloat();
            System.out.println("Você tem "+((Câmbio+4.97)*Doláres)+" Reais");
        }
    }

