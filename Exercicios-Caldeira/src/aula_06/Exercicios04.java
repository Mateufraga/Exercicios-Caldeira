package aula_06;

import java.util.LinkedHashMap;
import java.util.Map;

public class Exercicios04 {
    public static void main(String[] args) {
        LinkedHashMap<String,Double> listaProdutos = new LinkedHashMap<>();

        listaProdutos.put("Pão", 7.0);
        listaProdutos.put("Peito de Frango", 20.0);
        listaProdutos.put("Arroz", 6.50);
        listaProdutos.put("Desodorante", 14.70);

        System.out.println("Lista de Produtos");
        for (Map.Entry<String, Double> entry: listaProdutos.entrySet()) {
            String produto = entry.getKey();
            Double preco = entry.getValue();
            System.out.println(produto+" R$ "+preco);
        }
    }
}
