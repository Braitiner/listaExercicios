//Faça um Programa para um caixa eletrônico. O programa deverá perguntar ao usuário a valor do saque e depois informar
// quantas notas de cada valor serão fornecidas. As notas disponíveis serão as de 20, 50 e 100 reais. O valor
// mínimo é de 20 reais e o máximo de 1000 reais. O programa não deve se preocupar com a quantidade de notas existentes
// na máquina.

//Exemplo 1: Para sacar a quantia de 270 reais, o programa fornece 2 notas de 100, 1 nota de 50, 1 nota de 20;


package br.com.lista_exercicio.estrutura_de_decisao;


import java.util.Scanner;

public class Exercicio21 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Valor do Saque? ");
        int valorSaque = scan.nextInt();
        int auxiliar = valorSaque;


        int nota20 = 0;
        int nota50 = 0;
        int nota100 = 0;

        if (valorSaque < 20 | valorSaque > 1000) {

            System.out.println("Valor invalido, saque permitido entre os valores de R$20,00 a R$1000,00");

        } else {
            if (valorSaque >= 100) {

                nota100 = auxiliar / 100;
                auxiliar -= nota100 * 100;
                nota50 = auxiliar / 50;
                auxiliar -= nota50 * 50;
                nota20 = auxiliar / 20;
                System.out.printf("Valor saque R$%d,00: \nCedula de 100: %d \nCedula de 50: %d \nCedula de 20: %d",
                        valorSaque, nota100, nota50, nota20);


            } else if (valorSaque >= 50) {

                nota50 = auxiliar / 50;
                auxiliar -= nota50 * 50;
                nota20 = auxiliar / 20;
                System.out.printf("Valor saque R$%d,00: \nCedula de 50: %d \nCedula de 20: %d", valorSaque, nota50, nota20);

            } else if (valorSaque > 20) {
                nota20 = auxiliar / 20;
                System.out.printf("Valor saque R$%d,00: \nCedula de 20: %d", valorSaque, nota20);

            }

        }

    }
}


