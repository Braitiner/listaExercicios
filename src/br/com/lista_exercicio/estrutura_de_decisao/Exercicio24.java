//Faça um Programa que leia 2 números e em seguida pergunte ao usuário qual operação ele deseja realizar. O resultado da
// operação deve ser acompanhado de uma frase que diga se o número é:

//A - par ou ímpar;
//B - positivo ou negativo;
//C - inteiro ou decimal.

package br.com.lista_exercicio.estrutura_de_decisao;


import java.util.Scanner;

public class Exercicio24 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Primeiro numero: ");
        double primeiroNumero = scan.nextDouble();

        System.out.println("Segundo numero: ");
        double ssegundoNumero = scan.nextDouble();

        double resultadoOperacao = 0;

        System.out.println("Escolha uma opção abaixo: \n1 - Soma\n2 - Subtração\n3 - Multiplicação\n4 - Divisão");
        int escolhaOperação = scan.nextInt();

        if (escolhaOperação == 1){
            resultadoOperacao = primeiroNumero + ssegundoNumero;
            double verificaDcimal = Math.floor(resultadoOperacao);

            System.out.println("Resultado: " + resultadoOperacao);
            if (resultadoOperacao % 2 == 0) System.out.println("Par"); else System.out.println("Ímpar");
            if (resultadoOperacao > 0) System.out.println("Positivo"); else System.out.println("Negativo");
            if ((resultadoOperacao - verificaDcimal) > 0 ) System.out.println("decinal"); else System.out.println("Inteiro");


        } else if(escolhaOperação == 2){
            resultadoOperacao = primeiroNumero - ssegundoNumero;
            double verificaDcimal = Math.floor(resultadoOperacao);

            System.out.println("Resultado: " + resultadoOperacao);
            if (resultadoOperacao % 2 == 0) System.out.println("Par"); else System.out.println("Ímpar");
            if (resultadoOperacao > 0) System.out.println("Positivo"); else System.out.println("Negativo");
            if ((resultadoOperacao - verificaDcimal) > 0 ) System.out.println("decinal"); else System.out.println("Inteiro");

        } else if (escolhaOperação ==3){
            resultadoOperacao = primeiroNumero * ssegundoNumero;
            double verificaDcimal = Math.floor(resultadoOperacao);

            System.out.println("Resultado: " + resultadoOperacao);
            if (resultadoOperacao % 2 == 0) System.out.println("Par"); else System.out.println("Ímpar");
            if (resultadoOperacao > 0) System.out.println("Positivo"); else System.out.println("Negativo");
            if ((resultadoOperacao - verificaDcimal) > 0 ) System.out.println("decinal"); else System.out.println("Inteiro");

        }else if (escolhaOperação == 4){
            resultadoOperacao = primeiroNumero / ssegundoNumero;
            double verificaDcimal = Math.floor(resultadoOperacao);

            System.out.println("Resultado: " + resultadoOperacao);
            if (resultadoOperacao % 2 == 0) System.out.println("Par"); else System.out.println("Ímpar");
            if (resultadoOperacao > 0) System.out.println("Positivo"); else System.out.println("Negativo");
            if ((resultadoOperacao - verificaDcimal) > 0 ) System.out.println("decinal"); else System.out.println("Inteiro");


        }else System.out.println("Valor invalido.");



    }
}


