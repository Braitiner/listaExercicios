//Faça um programa que calcule as raízes de uma equação do segundo grau, na forma ax2 + bx + c. O programa deverá pedir
// os valores de a, b e c e fazer as consistências, informando ao usuário nas seguintes situações:

//A -Se o usuário informar o valor de A igual a zero, a equação não é do segundo grau e o programa não deve fazer pedir
//   os demais valores, sendo encerrado;

//B - Se o delta calculado for negativo, a equação não possui raizes reais. Informe ao usuário e encerre o programa;

//C - Se o delta calculado for igual a zero a equação possui apenas uma raiz real; informe-a ao usuário;

//D - Se o delta for positivo, a equação possui duas raiz reais; informe-as ao usuário;


package br.com.lista_exercicio.estrutura_de_decisao;


import java.util.Random;
import java.util.Scanner;

public class Exercicio16 {

    public static void main(String[] args) {

        Random ramdon = new Random();

        int numeroA = ramdon.nextInt(10);
        System.out.println("A: "+numeroA);
        int numeroB = 0;
        int numeroC = 0;
        if(numeroA == 0){
            System.out.println("Fim do programa");


        }else
            numeroB = ramdon.nextInt(10);
            numeroC = ramdon.nextInt(10);
            System.out.println("B: "+ numeroB + "\nC: " + numeroC );

            double delta = ((numeroB*numeroB)-(4*numeroA*numeroC));
            System.out.println("\nDelta: "+delta);
            if (delta < 0 ){
                System.out.println("a equação não possui raizes reais.");

            }else if(delta == 0) {

                double x1 = (-numeroB +(Math.sqrt(delta)))/(2*numeroA);
                System.out.println("X vale: " + x1);

            } else if(delta > 0){
                double x1 = (-numeroB +(Math.sqrt(delta)))/(2*numeroA);
                System.out.println("X1 vale: " + x1);

                double x2 = (-numeroB -(Math.sqrt(delta)))/(2*numeroA);
                System.out.println("X2 vale: " + x2);

            }






    }
}
