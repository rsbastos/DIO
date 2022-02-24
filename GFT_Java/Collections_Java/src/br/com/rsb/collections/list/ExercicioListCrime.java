package br.com.rsb.collections.list;

/*
Utilizando listas, faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
1. "Telefonou para a vítima?"
2. "Esteve no local do crime?"
3. "Mora perto da vítima?"
4. "Devia para a vítima?"
5. "Já trabalhou com a vítima?"

 - Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita";
 - entre 3 e 4 como "Cúmplice";
 - positivamente à 5, como "Assassina".
 - Caso contrário, ela será classificado como "Inocente".

 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ExercicioListCrime {
    public static void main(String[] args) {

    List<String> resp = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    System.out.print("\nTelefonou para vítima? ");
    String resposta = scanner.next();
    resp.add(resposta.toLowerCase());

    System.out.println("\nEsteve  no local do crime? ");
    resposta = scanner.next();
    resp.add(resposta.toLowerCase());

    System.out.println("\nMora perto da vítima? ");
    resposta = scanner.next();
    resp.add(resposta.toLowerCase());

    System.out.println("\nDevia para a vítima? ");
    resposta = scanner.next();
    resp.add(resposta.toLowerCase());

    System.out.println("\nJá trabalhou para a vítima? ");
    resposta = scanner.next();
    resp.add(resposta.toLowerCase());

    int count = 0;
        Iterator<String> contador = resp.iterator();
            while(contador.hasNext()) {
                String r = contador.next();
                if(r.contains("s")) {
                    count ++;
                }
            }

            switch(count) {
                case 2:
                    System.out.println("== SUSPEITO(A) ==");
                    break;
                case 3:
                case 4:
                    System.out.println("== CÚMPLICE ==");
                    break;
                case 5:
                    System.out.println("== ASSASSINO ==");
                    break;
                default:
                    System.out.println("== INOCENTE ==");
            }
    }
}
