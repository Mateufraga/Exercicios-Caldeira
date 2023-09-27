package aula_06;

import java.util.HashMap;
import java.util.Map;

public class Exercicios02 {
    public static void main(String[] args) {

        Map<String, Integer> nomeIdade = new HashMap<>();


        nomeIdade.put("Matheus", 21);
        nomeIdade.put("Emmanuel", 74);
        nomeIdade.put("Anne", 65);

        String nomeBuscado = "Emmanuel";
        if (nomeIdade.containsKey(nomeBuscado)) {
            int idade = nomeIdade.get(nomeBuscado);
            System.out.println(nomeBuscado + " tem " + idade + " anos.");
        } else {
            System.out.println(nomeBuscado + " não está presente no mapa.");
        }

        System.out.println("Pessoas na terceira idade:");
        for (Map.Entry<String, Integer> entrada : nomeIdade.entrySet()) {
            String nome = entrada.getKey();
            int idade = entrada.getValue();
            if (idade >= 60) {
                System.out.println(nome + " tem " + idade + " anos.");
            }
        }
    }
}
