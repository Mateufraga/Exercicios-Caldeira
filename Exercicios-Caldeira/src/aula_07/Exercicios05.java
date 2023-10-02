package aula_07;

import java.util.Scanner;

public class Exercicios05 {
    public static void main(String[] args) {
    try {
        int Idade = Leridade();
        System.out.println(Idade);
    } catch (IdadeInvalidaException Erro) {
        System.out.println(Erro);
    }
    }
    public static int Leridade() {
        Scanner input = new Scanner(System.in);
        System.out.println("Qual sua idade?");
        int Idade = input.nextInt();
        if (Idade < 0 || Idade > 150) {
            throw new IdadeInvalidaException("Idade inválida, achou que a gente não ia perceber?");
        }
        return Idade;
    }
}
