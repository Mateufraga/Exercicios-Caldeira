package aula_04;
import java.io.PrintStream;
public class Exercicios01 {

    public static void main(String[] args) {

        Veiculo NinjaTurbo = new Moto("GSX-R1000","Suzuki", 2019);
        double a = NinjaTurbo.calcularCustoViagem(40);
        System.out.println(a);

    }
}
