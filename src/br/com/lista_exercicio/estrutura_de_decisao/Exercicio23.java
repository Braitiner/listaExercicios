//Faça um Programa que peça um número e informe se o número é inteiro ou decimal. Dica: utilize uma função de arredondamento.

package br.com.lista_exercicio.estrutura_de_decisao;


import java.util.Scanner;

public class Exercicio23 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Numero: ");
        double numero = scan.nextDouble();

        double auxiliar = Math.floor(numero);

        if ((numero - auxiliar) > 0 ){
            System.out.println("decinal");
        } else System.out.println("Inteiro");


    }
}


