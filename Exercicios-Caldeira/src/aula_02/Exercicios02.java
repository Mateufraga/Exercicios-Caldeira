package aula_02;
import java.util.Scanner;
public class Exercicios02 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            char OpçãoMenu;
            do {
                System.out.println("---MENU--\n"+" Operações\n"+"Adição(+)\n"+"Subtração(-)\n"+"Divisão(%)\n"+"Multiplicação(X)\n" );
                OpçãoMenu = scanner.next().charAt(0);
                System.out.println("Digite dois números para realizarmos a operação selecionada.");
                int Numero1 = scanner.nextInt();
                int Numero2 = scanner.nextInt();

                if (OpçãoMenu != 'n') {

                    switch (OpçãoMenu) {
                        case '+':
                            System.out.println(Numero1+Numero2);
                            break;
                        case '-':
                            System.out.println(Numero1-Numero2);
                            break;
                        case '%':
                            System.out.println(Numero1/Numero2);
                            break;
                        case 'X':
                            System.out.println(Numero1*Numero2);
                    }
                } else {
                    System.out.println("Obrigado por usar a calculadora.");
                }
            } while (OpçãoMenu != 'n');
        }
    }

