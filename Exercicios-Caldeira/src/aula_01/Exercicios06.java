package aula_01;
import java.util.Scanner;
public class Exercicios06 {

    public static void main (String []args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Que horas são agora?");
        int Hora = scanner.nextInt();
        System.out.println("Qual os minutos de agora?");
        int Minutos = scanner.nextInt();
        System.out.println("Qual são os segundos de agora?");
        int Segundos = scanner.nextInt();
        int Segundospassados = ((Hora*60)*60)+(Minutos*60)+Segundos;
        System.out.println("Se passaram "+Segundospassados+ " segundos desde a meia noite.");
        int Dia = 86400-Segundospassados;
        System.out.println("E faltam "+Dia+" Segundos para a meia noite.");
        scanner.close();
    }
}