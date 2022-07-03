//As Organizações Tabajara resolveram dar um aumento de salário aos seus colaboradores e lhe contrataram para
// desenvolver o programa que calculará os reajustes.
//Faça um programa que recebe o salário de um colaborador e o reajuste segundo o seguinte critério, baseado no salário atual

//- salários até R$ 1212,00 (incluindo) : aumento de 20%
//- salários entre R$ 1212,00 e R$ 3030,00 : aumento de 15%
//- salários entre R$ 3030,00 e R$ 6500,00 : aumento de 10%
//- salários de R$ 6500,00 em diante : aumento de 5% Após o aumento ser realizado, informe na tela:
//- o salário antes do reajuste;
//- o percentual de aumento aplicado;
//- o valor do aumento;
//- o novo salário, após o aumento.


package br.com.lista_exercicio.estrutura_de_decisao;

import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Salario atual: ");

        double salarioAtual = scan.nextDouble();
        double aumento = 0;
        double salarioAjustado;


        if (salarioAtual > 6500){
            aumento = salarioAtual*0.05;
            salarioAjustado = salarioAtual + aumento;
            System.out.printf("Salario atual: %.2f", salarioAtual);
            System.out.println("\nPercentual do rejuste salarial: 5%");
            System.out.printf("valor do reajuste: %.2f", aumento);
            System.out.printf("\nSalario ajustado: %.2f", salarioAjustado);

        } else if (salarioAtual <= 6500 & salarioAtual > 3030){
            aumento = salarioAtual*0.1;
            salarioAjustado = salarioAtual + aumento;
            System.out.printf("Salario atual: %.2f", salarioAtual);
            System.out.println("\nPercentual do rejuste salarial: 10%");
            System.out.printf("valor do reajuste: %.2f", aumento);
            System.out.printf("\nSalario ajustado: %.2f", salarioAjustado);

        } else if (salarioAtual <= 3030 & salarioAtual > 1212) {
            aumento = salarioAtual * 0.15;
            salarioAjustado = salarioAtual + aumento;
            System.out.printf("Salario atual: %.2f", salarioAtual);
            System.out.println("\nPercentual do rejuste salarial: 15%");
            System.out.printf("valor do reajuste: %.2f", aumento);
            System.out.printf("\nSalario ajustado: %.2f", salarioAjustado);

        } else {
            aumento = salarioAtual * 0.20;
            salarioAjustado = salarioAtual + aumento;
            System.out.printf("Salario atual: %.2f", salarioAtual);
            System.out.println("\nPercentual do rejuste salarial: 20%");
            System.out.printf("valor do reajuste: %.2f", aumento);
            System.out.printf("\nSalario ajustado: %.2f", salarioAjustado);
        }


    }
}
