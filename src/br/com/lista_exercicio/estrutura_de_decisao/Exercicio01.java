//Faça um Programa que peça dois números e imprima o maior deles.



package br.com.lista_exercicio.estrutura_de_decisao;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Primeiro numero: ");
        int primeiroNumero = scan.nextInt();

        int segundoNumero = scan.nextInt();
        System.out.println("Segundo numero: ");

        if (primeiroNumero > segundoNumero){
            System.out.println("Maior é: " + primeiroNumero);
        } else {
            System.out.println("Maior é: " + segundoNumero);
        }




    }
}
