//Faça um Programa que leia três números e mostre o maior e o menor deles.



package br.com.lista_exercicio.estrutura_de_decisao;

import java.util.Random;

public class Exercicio07 {

    public static void main(String[] args) {

        Random random = new Random();


        int numeroUm = random.nextInt(100);
        int numeroDois = random.nextInt(100);
        int numeroTres = random.nextInt(100);


        System.out.println("1º: " + numeroUm + " 2º: " + numeroDois + " 3º: " + numeroTres);

        if (numeroUm > numeroDois & numeroUm > numeroTres) {
            System.out.println("Maior numero é: " + numeroUm);


        } else if (numeroDois > numeroUm & numeroDois > numeroTres) {
            System.out.println("Maior numero é: " + numeroDois);


        } else {
            System.out.println("Maior numero é: " + numeroTres);

        }

        if (numeroUm < numeroDois & numeroUm < numeroTres) {
            System.out.println("Menor numero é: " + numeroUm);


        } else if (numeroDois < numeroUm & numeroDois < numeroTres) {
            System.out.println("Menor numero é: " + numeroDois);


        } else {
            System.out.println("Menor numero é: " + numeroTres);


        }
    }
}