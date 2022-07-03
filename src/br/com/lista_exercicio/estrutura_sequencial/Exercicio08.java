//Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o
// total do seu salário no referido mês.

package br.com.lista_exercicio.estrutura_sequencial;

import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Quanto você ganha por hora?");
        var valorHoraTrabalhada = scan.nextDouble();
        System.out.println("Quantas horas trabalhou no mês?");
        var horasTrabalhadas = scan.nextInt();

        var salario = valorHoraTrabalhada * horasTrabalhadas;

        System.out.println("Seu salario é: R$" + String.format("%.2f", salario));

    }
}
