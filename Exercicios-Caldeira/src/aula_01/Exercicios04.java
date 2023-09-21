package aula_01;
import java.util.Random;
public class Exercicios04 {

    public static void main (String []args) {
        Random random = new Random();
        int Numero = random.nextInt(100);
        int Numero1 = random.nextInt(100);
        int Numero2 = random.nextInt(100);
        int NumeroMaior = Numero, NumeroMenor = Numero;
        float Media;
        if (Numero1 < NumeroMenor) {
            NumeroMenor = Numero1;
        } else if (Numero1 > NumeroMaior)
        {
            NumeroMaior = Numero1;
        }
        if (Numero2 < NumeroMenor) {
            NumeroMenor = Numero2;
        } else if (Numero2 > NumeroMaior)
        {
            NumeroMaior = Numero2;
        }
        Media = (float) (Numero+Numero1+Numero2)/3;
        System.out.println("num: "+Numero+" "+Numero1+ " "+Numero2);
        System.out.println("O número maior é "+ NumeroMaior+ " e o número menor é o "+ NumeroMenor+ ".  \nA média entre eles é "+Media);
    }
}
