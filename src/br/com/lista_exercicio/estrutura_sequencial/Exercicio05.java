//Faça um Programa que converta metros para centímetros.

package br.com.lista_exercicio.estrutura_sequencial;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o valor em metros: ");
        double valor = scan.nextDouble();

        System.out.println(String.format("%.2f",valor) + "m =  "
                + String.format("%.2f", valor*100) + "cm");

    }
}
