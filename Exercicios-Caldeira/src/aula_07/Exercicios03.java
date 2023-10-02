package aula_07;
import java.util.Scanner;
public class Exercicios03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Me diga dois números!");
            int Numero1 = Integer.parseInt(input.nextLine());
            int Numero2 = Integer.parseInt(input.nextLine());
            int Resultado = Numero1 + Numero2;
            System.out.println(Resultado);
        } catch (NumberFormatException Error) {
            System.out.println("O número não é válido.");
        }
    input.close();
    }
}
