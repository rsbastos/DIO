package br.com.rsb.collections.list;

/*
1 - Faça um programa que receba a temperatura média dos 6 primeiros meses do ano e armazene-as em uma lista;
2 - Após isto, calcule a média semestral das temperaturas;
3 - Mostre todas as temperaturas acima desta média,e em que mês elas ocorreram;
 obs: mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro e etc.
*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ExercicioListTemperaturas {
    public static void main(String[] args) {

        // 1 - Faça um programa que receba a temperatura média dos 6 primeiros meses do ano e armazene-as em uma lista;

        Scanner scan = new Scanner(System.in);
        List<Double> temperatura = new ArrayList<Double>();

        // Obs: A entrada de dados pode ser feita através de um iterador, com uma mensagem padrão, como abaixo:

//        int count = 0;
//        while (true) {
//            if (count == 6) break;
//
//            System.out.print("Digite a temperatura: ");
//            double temp = scan.nextDouble();
//            temperaturas.add(temp);
//            count++;
//        }

        // Obs: Como são poucas entradas, optei por adicionar um a um, com mensagens diferentes:

        System.out.println("Digite a temperatura de Janeiro, em graus Celsius: ");
        temperatura.add(scan.nextDouble());

        System.out.println("Digite a temperatura de Fevereiro, em graus Celsius: ");
        temperatura.add(scan.nextDouble());

        System.out.println("Digite a temperatura de Março, em graus Celsius: ");
        temperatura.add(scan.nextDouble());

        System.out.println("Digite a temperatura de Abril, em graus Celsius: ");
        temperatura.add(scan.nextDouble());

        System.out.println("Digite a temperatura de Maio, em graus Celsius: ");
        temperatura.add(scan.nextDouble());

        System.out.println("Digite a temperatura de Junho, em graus Celsius: ");
        temperatura.add(scan.nextDouble());

    //   2 - Após isto, calcule a média semestral das temperaturas;

    // Obs: Com as temperaturas adicionadas na List, poderia usar o stream / map para fazer a soma e média dos dados:

//        double media = temperaturas.stream()
//                .mapToDouble(Double::doubleValue)
//                .average()
//                .orElse(0d);
//        System.out.printf("\nMédia das temperaturas: %.1f\n", media);

    // Obs: Por se tratar de exercício relativo à List, farei de outro modo, utilizando Iterator,
    // deixando o stream para exercício específico:

        Iterator<Double> iterator = temperatura.iterator();
        Double soma = 0.0;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }

        Double media = soma/temperatura.size();
        System.out.printf("\nA média de temperatura do primeiro semestre é de %.1f", media);
        System.out.println("ºC");


    //  3 - Mostre todas as temperaturas acima desta média,e em que mês elas ocorreram;

        System.out.println("\nMeses das temperaturas acima da média: ");
        Iterator<Double> iterator1 = temperatura.iterator();

        int count = 0;
        while (iterator1.hasNext()) {
            Double temp = iterator1.next();
            if (temp > media) {
                switch (count) {
                    case (0):
                        System.out.printf("1 - janeiro: %.1f ", temp);
                        System.out.println("ºC");
                        break;
                    case (1):
                        System.out.printf("2 - fevereiro: %.1f", temp);
                        System.out.println("ºC");
                        break;
                    case (2):
                        System.out.printf("3 - março: %.1f", temp);
                        System.out.println("ºC");
                        break;
                    case (3):
                        System.out.printf("4 - abril: %.1f", temp);
                        System.out.println("ºC");
                        break;
                    case (4):
                        System.out.printf("5 - maio: %.1f", temp);
                        System.out.println("ºC");
                        break;
                    case (5):
                        System.out.printf("6 - junho: %.1f", temp);
                        System.out.println("ºC");
                        break;
                    default:
                        System.out.println("Não houve temperatura acima da média.");
                }
            }
            count++;
        }
    }
}


