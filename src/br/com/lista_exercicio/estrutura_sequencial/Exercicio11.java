//Faça um Programa que peça 2 números inteiros e um número real. Calcule e mostre:
//o produto do dobro do primeiro com metade do segundo .
//a soma do triplo do primeiro com o terceiro.
//o terceiro elevado ao cubo.
package br.com.lista_exercicio.estrutura_sequencial;

import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe os numeros abaixo: ");
        System.out.println("Inteiro: ");
        int valorInteiroUm = scan.nextInt();
        System.out.println("Inteiro: ");
        int valorInteiroDois = scan.nextInt();
        System.out.println("Real: ");
        double valorReal = scan.nextDouble();

        System.out.println("o produto do dobro do primeiro com metade do segundo: ");
        var calculoProduto = (valorInteiroUm*2) * (valorInteiroDois/2);
        System.out.println(calculoProduto);

        System.out.println("a soma do triplo do primeiro com o terceiro: ");
        var calculoTriplo = (valorInteiroUm*3) + valorReal;
        System.out.println(calculoTriplo);

        System.out.println("o terceiro elevado ao cubo.");
        var calculoCubo = Math.pow(valorReal, 3);
        System.out.println(calculoCubo);




    }


}
