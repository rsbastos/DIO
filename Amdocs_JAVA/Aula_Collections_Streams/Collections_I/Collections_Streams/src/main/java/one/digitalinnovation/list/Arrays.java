package one.digitalinnovation.list;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Collections;

@SpringBootApplication
public class Arrays {

	public static void main(String[] args) {

		// Exercício Final - Array List

		// Primeiro, instanciar uma lista

		java.util.List<String> nomes = new ArrayList<>();

		// 1 - Adicione 5 nomes: Juliano, Pedro, Carlos, Larissa e João

		nomes.add("Juliana");
		nomes.add("Pedro");
		nomes.add("Carlos");
		nomes.add("Larissa");
		nomes.add("João");
		System.out.println("1 - Lista 1: " + nomes);

		// 2 - Substitua o nome Carlos por Roberto

		nomes.set(2, "Roberto");
		System.out.println("2 - " + nomes);

		// 3 - Retorne o nome da posição 1

		String pos1 = nomes.get(0);
		System.out.println("3 - " + pos1);

		// 4 - Remova o nome da posição 4

		nomes.remove(3);
		System.out.println("4 - " + nomes);

		// 5 - Remova o nome João

		nomes.remove("João");
		System.out.println("5 - " + nomes);

		// 6 - Retorne a quantidade de itens da lista

		int quantidade = nomes.size();
		System.out.println("6 - A lista tem " + quantidade + " itens");

		// 7 - Verifique se o nome juliano existe na lista

		boolean existeJuliano = nomes.contains("Juliano");
		System.out.println("7 - Existe o nome Juliano? - " + existeJuliano);

		// 8 - Crie nova lista com nomes Ismael e Rodrigo

		java.util.List<String> nomes2 = new ArrayList<String>();

		nomes2.add("Ismael");
		nomes2.add("Rodrigo");
		System.out.println("8 - Lista 2: " + nomes2);

		// 9 - Adidione os nomes da nova lista na primeira criada

		nomes.addAll(nomes2);
		System.out.println("9 - " + nomes);

		// 10 - Ordene os itens em ordem alfabética

		Collections.sort(nomes);
		System.out.println("10 - " + nomes);

		// 11 - Verifique se a lista está vazia

		boolean vazia = nomes.isEmpty();
		System.out.println("11 - A lista está vazia? - " + vazia);
	}
}
