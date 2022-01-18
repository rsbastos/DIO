package one.digitalinnovation.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

// DADOS MANTÉM A ORDEM DE ENTRADA

public class ExemploLinkedHashSet {

    public static void main(String[] args) {

        LinkedHashSet<Integer> sequenciaNumerica = new LinkedHashSet<>();

        // Adiciona os números no set
        sequenciaNumerica.add(1);
        sequenciaNumerica.add(2);
        sequenciaNumerica.add(4);
        sequenciaNumerica.add(8);
        sequenciaNumerica.add(16);

        System.out.println("Sequência numérica: " + sequenciaNumerica);

        // Remove número do set
        sequenciaNumerica.remove(4);

        System.out.println("Remoção do número 4: " + sequenciaNumerica);

        // Retorna a quantidade de itens no set
        System.out.println("Quantidade de itens no set: " + sequenciaNumerica.size());

        // Navega em todos os itens do Iterator
        Iterator<Integer> iterator = sequenciaNumerica.iterator();

        while (iterator.hasNext()) {
            System.out.println("Navega pelos itens com while: " + iterator.next());
        }

        for (Integer numero: sequenciaNumerica) {
            System.out.println("Navega pelos itens com forEach: " + numero);
        }

        // Verifica se o set está vazio
        System.out.println("O set está vazio? - " + sequenciaNumerica.isEmpty());
    }
}
