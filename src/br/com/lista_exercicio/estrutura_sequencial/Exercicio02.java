//Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número].

package br.com.lista_exercicio.estrutura_sequencial;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("informe um número: ");
        int numero = scan.nextInt();
        System.out.println("O número informado foi " + numero);
    }
}
