package one.digitalinnovation.set;

import java.util.Iterator;
import java.util.TreeSet;

// NÃO SEGUE ORDEM DE INSERÇÃO

public class ExemploTreeSet {

    public static void main(String[] args) {

        TreeSet<String> treeCapitais = new TreeSet<>();

        // Monta a árvore com as capitais
        treeCapitais.add("Porto Alegre");
        treeCapitais.add("Florianópolis");
        treeCapitais.add("Curitiba");
        treeCapitais.add("São Paulo");
        treeCapitais.add("Rio de Janeiro");
        treeCapitais.add("Belo Horizonte");

        System.out.println("Capitais: " + treeCapitais);

        // Retorna a primeira capital no topo da árvore
        System.out.println("Primeira capital no topo da árvore: " + treeCapitais.first());

        // Retorna a última capital no final da árvore
        System.out.println("Última capital no final da árvore: " + treeCapitais.last());

        // Retorna a primeira capital abaixo na árvore da capital parametrizada
        System.out.println
                ("Primeira capital abaixo da capital parametrizada (Florianópolis):" +
                        " " + treeCapitais.lower("Florianópolis"));

        // Retorna a primeira capital acima na árvore da capital parametrizada
        System.out.println
                ("Primeira capital acima da capital parametrizada (Florianópolis):" +
                        " " + treeCapitais.higher("Florianópolis"));

        // Retorna a primeira capital do topo da árvore, removendo do set
        System.out.println("Capital no topo da árvore (Removida após exibição): " + treeCapitais.pollFirst());

        // Retorna a última capital na base da árvore, removendo do set
        System.out.println("Capital na base da árvore (Removida após exibição): " + treeCapitais.pollLast() );

        System.out.println("Set atual: " + treeCapitais);

        // Navega por todos os itens do iterator
        Iterator<String> iterator = treeCapitais.iterator();

        while (iterator.hasNext()) {
            System.out.println("Itens da árvore utilizando while: " + iterator.next());
        }

        for (String capital: treeCapitais) {
            System.out.println("Itens da árvore utilizando forEach: " + capital);
            
        }
    }
}
