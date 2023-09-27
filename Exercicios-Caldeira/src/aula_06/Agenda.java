package aula_06;

public class Agenda implements Comparable<Agenda> {
    String NumeroTelefone;
    String Nome;
    String Endereco;
    String Localidade;


    public Agenda(String numeroTelefone, String nome, String endereco, String localidade) {

        this.NumeroTelefone = numeroTelefone;
        this.Nome = nome;
        this.Endereco = endereco;
        this.Localidade = localidade;

    }

    @Override
    public int compareTo(Agenda agenda) {
        return this.Nome.compareTo(agenda.Nome);
    }

    @Override
    public String toString() {
        return Nome+" "+NumeroTelefone+" "+Endereco+" "+Localidade;
    }
}
