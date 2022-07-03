//Faça um Programa que peça os 3 lados de um triângulo. O programa deverá informar se os valores podem ser um triângulo.
// Indique, caso os lados formem um triângulo, se o mesmo é: equilátero, isósceles ou escaleno.
//Dicas:
//Três lados formam um triângulo quando a soma de quaisquer dois lados for maior que o terceiro;
//Triângulo Equilátero: três lados iguais;
//Triângulo Isósceles: quaisquer dois lados iguais;
//Triângulo Escaleno: três lados diferentes;


package br.com.lista_exercicio.estrutura_de_decisao;


import java.util.Scanner;

public class Exercicio15 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o A lado: ");
        double ladoA = scan.nextDouble();
        System.out.println("Informe o B lado: ");
        double ladoB = scan.nextDouble();
        System.out.println("Informe o C lado: ");
        double ladoC = scan.nextDouble();

        if((ladoA + ladoB)> ladoC & (ladoA + ladoC) > ladoB & (ladoB + ladoC) > ladoA){
            System.out.print("É um triangulo");
            if(ladoA == ladoB & ladoA == ladoC){
                System.out.print(" Equilátero");

            }else if(ladoA == ladoB | ladoA == ladoC | ladoB == ladoC){
                System.out.print(" Isósceles");

            } else System.out.print(" Escaleno");

        } else System.out.println("Não é um triangulo");

    }
}
