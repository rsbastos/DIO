package one.digitalinnovation.map;

import java.util.HashMap;
import java.util.Map;

// NÃO SEGUE ORDEM DE INSERÇÃO

public class ExemploHashMap {

    public static void main(String[] args) {

        Map<String, Integer> campeoesMundiaisFifa = new HashMap<>();

        // Adiciona os campeões mundiais Fifa no mapa - método .put, que recebe 2 argumentos
        campeoesMundiaisFifa.put("Brasil", 5);
        campeoesMundiaisFifa.put("Alemanha", 4);
        campeoesMundiaisFifa.put("Italia", 4);
        campeoesMundiaisFifa.put("Uruguai", 2);
        campeoesMundiaisFifa.put("Argentina", 2);
        campeoesMundiaisFifa.put("França", 2);
        campeoesMundiaisFifa.put("Inglaterra", 1);
        campeoesMundiaisFifa.put("Espanha", 1);

        System.out.println("Campeões mundiais FIFA: " + campeoesMundiaisFifa);

        // Atualiza o valor para a chave Brasil
        campeoesMundiaisFifa.put("Brasil", 6);

        System.out.println("Mapa Atualizado: " + campeoesMundiaisFifa);

        // Retorna a Argentina
        System.out.println("Vitórias da Argentina utilizando get: " + campeoesMundiaisFifa.get("Argentina"));

        // Retorna se existe um campeão França
        System.out.println("Existe campeão França? (utilizando containsKey): " +
                campeoesMundiaisFifa.containsKey("França"));

        // Remove o campeão França
        campeoesMundiaisFifa.remove("França");
        System.out.println("** Remoção do campeão França, utilizando remove **");

        // Retorna se existe um campeão França
        System.out.println("Existe campeão França? (utilizando containsKey): " +
                campeoesMundiaisFifa.containsKey("França"));

        // Retorna se existe uma seleção hexacampeã
        System.out.println("Existe seleção Hexacampeã? (utilizando containsValue): " +
                campeoesMundiaisFifa.containsValue(6));

        // Retorna o tamanho do mapa
        System.out.println("Quantidade de seleções: " + campeoesMundiaisFifa.size());

        System.out.println("Mapa atualizado: " + campeoesMundiaisFifa);

        // Navega nos registros do mapa
        for (Map.Entry<String, Integer> entry : campeoesMundiaisFifa.entrySet()) {
            System.out.println("Navegação pelos itens do mapa utilizando forEach - entry.getKey/entry.getValue: " +
                    entry.getKey() + " -- " + entry.getValue());
        }

        // Navega nos registros do mapa
        for (String key : campeoesMundiaisFifa.keySet()) {
            System.out.println("Navegação pelos itens do mapa utilizando forEach - .get: " +
                    key + " -- " + campeoesMundiaisFifa.get(key));
        }

    }
}
