package one.digitalinnovation.map;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class ExemploTreeMap {

    public static void main(String[] args) {

        TreeMap<String, String> treeCapitais = new TreeMap<>();

        // monta a árvore com as capitais
        treeCapitais.put("RS", "Porto Alegre");
        treeCapitais.put("SC", "Florianópolis");
        treeCapitais.put("PR", "Curitiba");
        treeCapitais.put("SP", "São Paulo");
        treeCapitais.put("RJ", "Rio de Janeiro");
        treeCapitais.put("MG", "Belo Horizonte");

        System.out.println("Capitais: " + treeCapitais);

        // Retorna a primeira chave no topo da árvore
        System.out.println("Primeiro estado no topo da árvore: " + treeCapitais.firstKey());

        // Retorna a última chave na base da árvore
        System.out.println("Último estado na base da árvore: " + treeCapitais.lastKey());

        // Retorna a primeira chave abaixo da chave parametrizada
        System.out.println("Primeiro estado abaixo do parametrizado (SC): " + treeCapitais.lowerKey("SC"));

        // Retorna a primeira chave acima da chave parametrizada
        System.out.println("Primeiro estado acima do parametrizado (SC): " + treeCapitais.higherKey("SC"));

        // Retorna o primeiro entrada no topo da árvore
        System.out.println("Primeira entrada: " +
                treeCapitais.firstEntry().getKey() + " - " + treeCapitais.firstEntry().getValue());

        // Retorna a última entrada na base da árvore
        System.out.println("Última entrada: " +
                treeCapitais.lastEntry().getKey() + " - " + treeCapitais.lastEntry().getValue());

        System.out.println("Mapa atualizado: " + treeCapitais);

        Map.Entry<String, String> firstEntry = treeCapitais.pollFirstEntry();
        Map.Entry<String, String> lastEntry = treeCapitais.pollLastEntry();

        // Retoorna a primeira entrada no topo da árvore, removendo do map
        System.out.println("Primeira entrada (removida após exibição): " +
                treeCapitais.firstEntry().getKey() + " - " + treeCapitais.firstEntry().getValue());

        // Retorna a última entrada na base da árvore, removaneo do map
        System.out.println("Última entrada (removida após exibição): " +
                treeCapitais.lastEntry().getKey() + " - " + treeCapitais.lastEntry().getValue());

        System.out.println("Mapa atualizado: " + treeCapitais);

        // Navega em todas as chaves do Iterador
        Iterator<String> iterator = treeCapitais.keySet().iterator();

        while (iterator.hasNext()) {
            String key= iterator.next();
            System.out.println("Navega por todas as chaves, utilizando while: " + key + " - " + treeCapitais.get(key));
        }

        for (String capital: treeCapitais.keySet()) {
            System.out.println("Navega por todas as chaves utilizando forEach (keySet): " +
                    capital + " - " + treeCapitais.get(capital));
        }

        for (Map.Entry<String, String> capital: treeCapitais.entrySet()) {
            System.out.println("Navega por todas as chaves utilizando forEach (Map.Entry): " +
                    capital.getKey() + " - " + capital.getValue());
        }
    }
}
