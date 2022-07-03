//Faça um programa que peça o tamanho de um arquivo para download (em MB) e a velocidade de um link de Internet
// (em Mbps), calcule e informe o tempo aproximado de download do arquivo usando este link (em minutos).


package br.com.lista_exercicio.estrutura_sequencial;

import java.util.Scanner;

public class Exercicio18 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o tamanho do arquivo em MB: ");
        double tamanho = scan.nextDouble();

        System.out.println("Informe o velocidade do link da internet: ");
        int velocidade = scan.nextInt();

        double download = tamanho / velocidade;

        System.out.println("O tempo aproximado para download é " + download/60 + " minutos");




    }
}
