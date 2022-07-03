//Tendo como dado de entrada a altura (h) de uma pessoa, construa um algoritmo que calcule seu peso ideal, utilizando as seguintes fórmulas:
//Para homens: (72.7*h) - 58
//Para mulheres: (62.1*h) - 44.7
package br.com.lista_exercicio.estrutura_sequencial;

import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a altura em Metros: (ex 1,77):  ");
        double altura = scan.nextDouble();

        var formulaPesoIdealHomem = (72.7*altura)-58;
        var formulaPesoIdealMulher = (62.1*altura)-44.7;

        System.out.println("Informe F para feminino e M para masculino");
        var sexo = scan.next();
        sexo.toUpperCase();
        while (true) {
            if (sexo.charAt(0) == 'F'  ){
                System.out.println("Seu peso é: " + String.format("%.2f",formulaPesoIdealMulher));
                break;
            }
            if (sexo.charAt(0) == 'M'){
                System.out.println("Seu peso é: " + String.format("%.2f",formulaPesoIdealHomem));
                break;

            }

        }










    }


}
