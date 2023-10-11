package aula_08;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Exercicios02 {
    public static void main(String[] args) {
        ArrayList<Exercicios02Produto> produtos = new ArrayList<>();
        Exercicios02Produto pasta = new Exercicios02Produto("Perfume",30.00, 4);
        Exercicios02Produto escova = new Exercicios02Produto("Desodorante", 13.99, 27);
        Exercicios02Produto  copo = new Exercicios02Produto("Papel higiênico", 19.99,5);
        Exercicios02Produto detergente = new Exercicios02Produto("Detergente", 8.75,11);
        Exercicios02Produto vassoura = new Exercicios02Produto("Vassoura", 39.99, 12);
        double precoTotal;

        produtos.add(pasta);
        produtos.add(escova);
        produtos.add(copo);
        produtos.add(detergente);
        produtos.add(vassoura);

        Optional<Exercicios02Produto> produtoMaisCaro = produtos.stream().max(Comparator.comparingDouble(Exercicios02Produto::getPreco));

        produtoMaisCaro.ifPresent(produto -> System.out.println("Produto mais caro: " + produto.getNome()));

        precoTotal = produtos.stream().mapToDouble(Exercicios02Produto::getPreco).sum();
        System.out.println("Preço total de todos os produtos: " + precoTotal);

        List<Exercicios02Produto> produtosComMaisDe10Unidades = produtos.stream().filter(produto -> produto.getQuantidade() > 10).toList();
        System.out.println("Produtos que possuem mais de 10 unidades disponíveis: ");
        produtosComMaisDe10Unidades.forEach(produto -> System.out.println(produto.getNome()));


    }
}