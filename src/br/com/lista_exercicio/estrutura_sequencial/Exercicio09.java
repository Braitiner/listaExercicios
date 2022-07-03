//Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius.
//C = 5 * ((F-32) / 9).
package br.com.lista_exercicio.estrutura_sequencial;

import java.util.Scanner;

public class Exercicio09 {

    public static void main(String[] args) {

        Scanner entradaUsuario = new Scanner(System.in);

        System.out.println("Informe a temperatura em Fahrenheit: ");
        int fahrenheit = entradaUsuario.nextInt();

        double celsius = 5 * ((fahrenheit - 32)/9);

        System.out.println("A temperatura em graus Celsius é: " + celsius + "º.");
    }
}

