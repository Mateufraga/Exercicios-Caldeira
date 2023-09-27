package aula_06;
import java.util.*;
public class Exercicios03 {
    TreeMap<String, Agenda> agenda = new TreeMap<>();
    public void addContato(String nome, String telefone, String endereco, String localidade) {

        Agenda um = new Agenda(telefone, nome,endereco, localidade);
        agenda.put(nome, um);
    }

    public Agenda buscarContato(String nome) {
        return agenda.get(nome);
    }

    public void listarContatos() {
        for (Agenda agenda1: agenda.values()) {
            System.out.println(agenda1);
            System.out.println();
        }
    }

    public void listaLocalizacao(String Local) {
        for (Agenda contatos: agenda.values()) {
            if (contatos.Localidade.equalsIgnoreCase(Local)) {
                System.out.println(contatos);
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        Exercicios03 ListaTelefonica = new Exercicios03();
        ListaTelefonica.addContato("Rafael", "5198745201", "Rua dorival, 27","Norte");
        ListaTelefonica.addContato("Daniel", "5198745201", "Rua Salgado, 54","Putaquepariu");
        ListaTelefonica.addContato("Thiago", "5198745201", "Rua Dormamu, 71","Norte");
        ListaTelefonica.addContato("Anne", "5198745201", "Rua Janet, 39","Norte");


        //ListaTelefonica.listarContatos();//
        ListaTelefonica.listaLocalizacao("Putaquepariu");
    }
}