package one.digitalinnovation.map;

import java.util.Hashtable;

public class ExemploHashTable {

    public static void main(String[] args) {

        Hashtable<String, Integer> estudantes = new Hashtable<>();

        estudantes.put("Carlos", 21);
        estudantes.put("Mariana", 33);
        estudantes.put("Rafaela", 18);
        estudantes.put("Pedro", 44);

        System.out.println("Estudantes: " + estudantes);

        estudantes.put("Pedro", 55);
        System.out.println("** Atualização da idade de Pedro, com put **");

        System.out.println("Lista atualizada: " + estudantes);

        // Remove um estudante no índice 0
        estudantes.remove("Pedro");

        System.out.println("Lista atualizada: " + estudantes);

        //Recupera um estudante no índice 2
        int idadeEstudante = estudantes.get("Mariana");

        System.out.println("Idade de Mariana: " + idadeEstudante);

        System.out.println("Quantidade de itens da tabela: " + estudantes.size());
    }
}
