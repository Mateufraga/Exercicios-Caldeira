package aula_03;

public class Exercicios02 {

    public static void main(String[] args) {

        Bola bola1 = new Bola(7);
        Bola bola2 = new Bola(7);

        bola1.CalculaArea();
        bola1.CalculaCircu();
        bola1.CalculaDiame();

        //bola1.definirRaio(2);

        System.out.println(bola1.toString());

        bola1.EhIgual(bola2);

    }

}