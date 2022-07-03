//Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule seu peso ideal, usando a
// seguinte fórmula: (72.7*altura) - 58
package br.com.lista_exercicio.estrutura_sequencial;

import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a altura em Metros: (ex 1,77):  ");
        double altura = scan.nextDouble();

        var formulaImc = (72.7*altura)-58;

        System.out.println("Seu peso ideal é: "+ String.format("%.2f", formulaImc));






    }


}
