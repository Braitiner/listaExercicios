//Faça um Programa que calcule a área de um quadrado,
// em seguida mostre o dobro desta área para o usuário.

//colaboração de ana paula

package br.com.lista_exercicio.estrutura_sequencial;

import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a medida de um lado do quadrado");
        var base = scan.nextDouble();
        var altura = base;

        var area = altura * base;

        System.out.println("O dobro da area é: "+ area*2);



    }
}
