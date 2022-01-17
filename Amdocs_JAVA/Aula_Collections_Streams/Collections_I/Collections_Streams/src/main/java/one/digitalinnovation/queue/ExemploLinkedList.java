package one.digitalinnovation.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

// Exemplo de estrutura de fila - First In First Out - utilizando implementação Linked e Queue

public class ExemploLinkedList {

    public static void main(String[] args) {

        Queue<String> filaBanco = new LinkedList<>();

        filaBanco.add("Pâmela");
        filaBanco.add("Patrícia");
        filaBanco.add("Roberto");
        filaBanco.add("Flávio");
        filaBanco.add("Anderson");

        System.out.println("Fila: " + filaBanco);

        String clienteASerAtendido = filaBanco.poll();

        System.out.println("Próximo Cliente: " + clienteASerAtendido + " (POLL - será atendida e removida da fila)");

        System.out.println("Fila Atual : " + filaBanco);

        String primeiroCliente = filaBanco.peek();

        System.out.println("Próximo cliente: " + primeiroCliente +
                " (PEEK - apenas mostra o primeiro da fila, mas não remove - se a fila estiver vazia retorna null)");

        System.out.println("Fila Atual: " + filaBanco + " - continua inalterada");

        String primeiroClienteouErro = filaBanco.element();

        System.out.println("Próximo Cliente: " + primeiroClienteouErro +
                " (ELEMENT - mostra o primeiro da fila, mas não remove - se a fila estiver vazia retorna uma exceção)");

        System.out.println("Fila atual: " + filaBanco + " - inalterada");

        for (String client: filaBanco) {
            System.out.println
                    ("Método for each, que irá navegar pelos elementos da fila, como ocorre com as listas: " +
                            client);
        }

        Iterator<String> iteratorFilaBanco = filaBanco.iterator();

        while (iteratorFilaBanco.hasNext()) {
            System.out.println("Iterator e while: " + iteratorFilaBanco.next());
        }

    }

}
