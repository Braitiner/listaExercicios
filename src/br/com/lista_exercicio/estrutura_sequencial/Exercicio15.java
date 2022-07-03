//Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o
// total do seu salário no referido mês, sabendo-se que são descontados 11% para o Imposto de Renda, 8% para o INSS e 5%
// para o sindicato, faça um programa que nos dê:
//A) - salário bruto.
//B) - quanto pagou ao INSS.
//C) - quanto pagou ao sindicato.
//D) - quanto pagou de IR
//E) - o salário líquido.


package br.com.lista_exercicio.estrutura_sequencial;

import java.util.Scanner;

public class Exercicio15 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Valor hora trabalhada: ");
        var valorHora = scan.nextDouble();

        System.out.println("quantidade horas trabalhdas: ");
        var quantidadeHoras = scan.nextInt();

        var salarioBruto = valorHora * quantidadeHoras;
        System.out.println("Salario bruto: R$" + salarioBruto);

        var inss = salarioBruto*0.08;
        System.out.println("Inss: R$" + inss);

        var sindicato = salarioBruto*0.05;
        System.out.println("Sindicato: " + sindicato);

        var ir = salarioBruto * 0.11;
        System.out.println("IR: R$" + ir);

        var salarioLiquido = salarioBruto - (inss + sindicato + ir);
        System.out.println("Salario líquido: " + salarioLiquido);








    }
}
