//Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser pintada.
// Considere que a cobertura da tinta é de 1 litro para cada 3 metros quadrados e que a tinta é vendida em latas de,
// 18 litros, que custam R$ 80,00. Informe ao usuário a quantidades de latas de tinta a serem compradas e o preço total.


package br.com.lista_exercicio.estrutura_sequencial;

import java.util.Scanner;

public class Exercicio16 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Informe a quantidade de M²: ");
        var litrosTinta = (scan.nextInt() / 3) / 18;
        if(litrosTinta % 18 > 0){
            litrosTinta += 1;
        }
        System.out.println("Vai precisar de: " + litrosTinta + " lata(s) de tinta, no valor de: R$" + litrosTinta*80);

    }
}
