package one.digitalinnovation.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploStreamAPI {

    public static void main(String[] args) {

        //Cria a coleção de estudantes
        List<String> estudantes = new ArrayList<>();

        //Adiciona estudantes para a coleção
        estudantes.add("Pedro");
        estudantes.add("Thayse");
        estudantes.add("Marcelo");
        estudantes.add("Carla");
        estudantes.add("Juliana");
        estudantes.add("Thiago");
        estudantes.add("Rafael");

        // Retorna a quantidade de elementos do stream
        System.out.println("Quantidade de estudantes: " + estudantes.stream().count());

        // Retorna o elemento com o maior número de letras
        System.out.println("Nome com maior número de letras: " +
                estudantes.stream().max(Comparator.comparingInt(String::length)));

        // Retorna o elemento com o menor número de letras
        System.out.println("Nome com menor número de letras: " +
                estudantes.stream().min(Comparator.comparingInt(String::length)));

        // Retorna elementos com a letra R no nome
        System.out.println("Nomes que contém a letra R: " + estudantes.stream().filter((estudante) ->
                estudante.toLowerCase().contains("r")).collect(Collectors.toList()));

        // Retorna uma nova coleção, com os nomes concatenados e a quantidade de letra de cada nome
        System.out.println("Retorna uma nova coleção com a quantidade de letras: " +
                estudantes.stream().map(estudante -> estudante.concat(" - ")
                        .concat(String.valueOf(estudante.length()))).collect(Collectors.toList()));

        // Retorna os N primeiros elementos da coleção
        System.out.println("Retorna os 3 primeiros nomes: " +
                estudantes.stream().limit(3).collect(Collectors.toList()));

        // Exibe cada elemento no console e retorna a coleção
        System.out.println("Elementos: " +
                estudantes.stream().peek(System.out::println).collect(Collectors.toList()));

        // Exibe cada elemento sem retornar a coleção
        System.out.println("Retorna os elementos novamente: ");
        estudantes.stream().forEach(System.out::println);

        // Retorna true se TODOS os elementos possuirem determinada letra no nome
        System.out.println("Todos os elementos possuem a letra W? - " +
                estudantes.stream().allMatch((elemento) -> elemento.contains("W")));

        // Retorna true se ALGUM elemento possuir determinada letra no nome
        System.out.println("Algum elemento possui a letra a? - " +
                estudantes.stream().anyMatch((elemento) -> elemento.contains("a")));

        // Retorna true se NENHUM elemento possuir determinada letra
        System.out.println("Nenhum elemento possui a letra a? - " +
                estudantes.stream().noneMatch((elemento) -> elemento.contains("a")));

        // Retorna o primeiro elemento da coleção e exibe no console, se existir
        System.out.print("Primeiro elemento da coleção: ");
        estudantes.stream().findFirst().ifPresent(System.out::println);

        // Exemplo de operação encadeada
        System.out.println("Operação encadeada: ");
        System.out.println(estudantes.stream()
                .peek(System.out::println)
                .map(estudante ->
                        estudante.concat(" - ").concat(String.valueOf(estudante.length())))
                .peek(System.out::println)
                .filter((estudante) ->
                        estudante.toLowerCase().contains("r"))
                .collect(Collectors.toList()));

        }
    }

