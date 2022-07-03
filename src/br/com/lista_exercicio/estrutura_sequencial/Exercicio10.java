//Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre em graus Fahrenheit.
package br.com.lista_exercicio.estrutura_sequencial;

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("temperatura em graus Celsius: ");
        var celsius = scan.nextInt();

        var fahrenheit = (celsius * 1.8) + 32;

        System.out.println("O valor em fahrenheit é: "+ fahrenheit);
    }


}
