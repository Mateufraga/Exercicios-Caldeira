package aula_07;
import java.util.Scanner;
public class Exercicios02 {
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);
        System.out.println("Que dia da semana é hoje?");
        String input = prompt.nextLine();
        DiadaSemana i = null;
        for (DiadaSemana diadasemana: DiadaSemana.values()) {
            if (diadasemana.Dia.equalsIgnoreCase(input)) {
                i = diadasemana;
                break;
            }
        }
        if (i != null) {
            switch (i) {
                case Domingo:
                    System.out.println("Domingo, mais uma semana começa!");
                    break;
                case Segunda:
                    System.out.println("Segunda = tristeza");
                    break;
                case Terca:
                    System.out.println("Terça, começou pra valer a semana!");
                    break;
                case Quarta:
                    System.out.println("Quarta, dia de futebol e meia semana terminada");
                    break;
                case Quinta:
                    System.out.println("Quinta, praticamente sexta hein!");
                    break;
                case Sexta:
                    System.out.println("Sexta, Sextoooouuuu!");
                    break;
                case Sabado:
                    System.out.println("Sábado, melhor dia da semana!");
                    break;
            }
        } else {
            System.out.println("i deu ruim");
        }
        prompt.close();
    }
}
