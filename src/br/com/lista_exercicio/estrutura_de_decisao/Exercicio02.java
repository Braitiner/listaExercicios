//Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo.



package br.com.lista_exercicio.estrutura_de_decisao;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Informe um valor: ");
        int valor = scan.nextInt();

        if (valor > 0){
            System.out.println("Valor possitivo");
        } else {
            System.out.println("valor negativo");
        }





    }
}
