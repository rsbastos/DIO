package br.com.rsb.collections.map;

/*
Crie um conjunto contendo as cores do arco-íris e:
1 - Exiba todas as cores uma abaixo da outra
2 - A quantidade de cores que o arco-íris tem
3 - Exiba as cores em ordem alfabética
4 - Exiba as cores na ordem inversa da que foi informada
5 - Exiba todas as cores que começam com a letra ”v”
6 - Remova todas as cores que não começam com a letra “v”
7 - Limpe o conjunto
8 - Confira se o conjunto está vazio

cores: vermelho, laranja, amarelo, verde, azul, anil (ou índigo) e violeta
 */

import com.sun.source.doctree.SeeTree;

import java.util.*;

public class ExercicioMapCores {
    public static void main(String[] args) {

        Set<String> cores = new LinkedHashSet<>(Arrays.asList(
                "vermelho", "laranja", "amarelo", "verde", "azul", "indigo", "violeta"));

        System.out.println("1 - Exiba todas as cores do Arco-Iris, uma abaixo da outra: ");
//      UTILIZANDO O WHILE
//        Iterator<String> iterator = cores.iterator();
//    while(iterator.hasNext()){
//        String next = iterator.next();
//        System.out.println(next);
//    }
//         UTILIZANDO O FOR
        for(String cor : cores) {
            System.out.println(cor);
        }

        System.out.println("\n2 - A quantidade de cores que o arco-íris tem: " + cores.size());

        System.out.println("\n3 - Exiba as cores em ordem alfabética: ");
        Set<String> cores2 = new TreeSet<>(cores);
        System.out.println(cores2);

        System.out.println("\n4 - Exiba as cores na ordem inversa da que foi informada: ");
        Set<String> cores3 = new TreeSet<>(Collections.reverseOrder());
        cores3.addAll(cores2);
        System.out.println(cores3);

        System.out.println("\n5 - Exiba todas as cores que começam com a letra v: ");
        for(String cor : cores) {
            if(cor.startsWith("v")) System.out.println(cor);
        }


    }
}
