//Faça um Programa que peça as 4 notas bimestrais e mostre a média.
package br.com.lista_exercicio.estrutura_sequencial;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double media = 0;
        for(int i = 1; i <= 4; i++){
            System.out.println("Informe o "+ i + "º + numero:");
            media += scan.nextDouble();
        }

        System.out.println("A media das notas são: " + media/4);
    }
}
