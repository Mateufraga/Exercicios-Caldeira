package aula_07;

import java.util.Scanner;

public class Exercicios04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("""
    ---MENU---
    1 Add
    2 Sub
    3 Multi
    4 Div
    """);;
    int Escolha = input.nextInt();
    Calculadora calculadora = null;
    switch (Escolha) {
        case 1:
            calculadora = calculadora.Adicao;
            break;
        case 2:
            calculadora = calculadora.Subtracao;
            break;
        case 3:
            calculadora = calculadora.Multiplicar;
            break;
        case 4:
            calculadora = calculadora.Dividir;
            break;
        default:
            System.out.println("Operação inválida");
            System.exit(1);
    }
        System.out.println("Diga dois números para realizar a operação!");
    try {
        input.nextLine();
        double N1 = Double.parseDouble(input.nextLine());
        double N2 = Double.parseDouble(input.nextLine());
        double Resultado = calculadora.calcular(N1, N2);
        System.out.println(Resultado);
    } catch (NumberFormatException Erro) {
        System.out.println("Erro detectado, tente novamente "+Erro);
    }
    input.close();
    }
}
