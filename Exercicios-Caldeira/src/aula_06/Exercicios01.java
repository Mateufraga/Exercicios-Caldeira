package aula_06;

import java.util.Stack;

public class Exercicios01 {
    public static void main(String[] args) {

        Stack<Livros> livros = new Stack<>();
        Livros Mobbydick = new Livros("Mobbydick","Aventura");
        Livros Revolucao = new Livros("Revolução","Ficção");
        Livros Amor = new Livros("Amor","Romance");
        Livros Indiana = new Livros("Indiana","Aventura");

        livros.push(Mobbydick);
        livros.push(Revolucao);
        livros.push(Amor);
        livros.push(Indiana);

        Stack<Livros> livrosAventura = new Stack<>();
        for (Livros livro: livros) {
            if (livro.Categoria == "Aventura") {
                System.out.println("Este livro é da categoria aventura: "+livro.Titulo);
                livrosAventura.push(livro);
            }
            }
        livros.removeAll(livrosAventura);
        for (Livros j: livros) {
            System.out.println(j.Titulo);
        }
        }
    }
6
