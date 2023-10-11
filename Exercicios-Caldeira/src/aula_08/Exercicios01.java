package aula_08;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercicios01 {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Gasolina");
        strings.add("Gasolina");
        strings.add("Água");
        strings.add("Gasolina");
        strings.add("Óleo");


        System.out.println("A lista tem " + strings.stream().count() + " elementos.");
        System.out.println("O maior elemento da lista é o: " + strings.stream().max(Comparator.comparingInt(String::length)));

        Map<String, Long> stringsByFrequency = strings.stream().collect(Collectors.groupingBy(string -> string, Collectors.counting()));

        List<Map.Entry<String, Long>> mostFrequentStrings = stringsByFrequency.entrySet().stream().sorted(Map.Entry.<String,Long>comparingByValue().reversed()).limit(5).toList();

        for (Map.Entry<String, Long> element : mostFrequentStrings){
            System.out.println(element.getKey() + " aparece " + element.getValue() + " vezes.");
        }

    }
}