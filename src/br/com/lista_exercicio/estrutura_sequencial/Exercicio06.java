//Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.

package br.com.lista_exercicio.estrutura_sequencial;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);



        System.out.println("Informe o valor do raio: ");
        var raio = scan.nextDouble();
        var area = Math.PI*Math.pow(raio,2);

        System.out.println(String.format("%.2f", area) + "metros");

    }
}
