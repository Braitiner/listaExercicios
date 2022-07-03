//Faça um Programa que peça dois números e imprima a soma.

package br.com.lista_exercicio.estrutura_sequencial;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System  .out.println("Informe um numero: ");
        double primeiroNumero = scan.nextInt();
        System  .out.println("Informe outo numero: ");
        double segundoNumero = scan.nextInt();

        System.out.println("A soma é: " + (primeiroNumero + segundoNumero));


    }
}
