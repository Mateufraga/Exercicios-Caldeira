package aula_03;
import javax.swing.plaf.PanelUI;
import java.time.LocalTime;

public class Transacao {
    double Valor;
    LocalTime Hora;
    String Tipo;

    public Transacao(double valor, LocalTime hora, String tipo) {


        this.Valor = valor;
        this.Hora = hora;
        this.Tipo = tipo;

    }
    public double Getvalor() {
        return Valor;
    }
    public LocalTime Gethora() {
        return Hora;
    }
    public String Gettipo() {
        return Tipo;
    }
}


