//Faça um Programa que peça um número inteiro e determine se ele é par ou impar.

package br.com.lista_exercicio.estrutura_de_decisao;


import java.util.Scanner;

public class Exercicio22 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Numero: ");
        int numero = scan.nextInt();

        if (numero % 2 == 0) System.out.println("Par"); else System.out.println("Ímpar");


    }
}


