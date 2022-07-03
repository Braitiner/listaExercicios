//Faça um Programa que peça um número correspondente a um determinado ano e em seguida informe se este ano é ou
// não bissexto.


package br.com.lista_exercicio.estrutura_de_decisao;


import java.util.Random;

public class Exercicio17 {

    public static void main(String[] args) {

        Random ramdon = new Random();

        int ano = ramdon.nextInt(2500);


        if (ano % 4 == 0 & ano % 100 == 0 & ano % 400 == 0 ){
            System.out.println("Ano bissexto!");

        }else if(ano % 4 == 0 & ano % 100 != 0){
            System.out.println("Ano bissexto!");

        }else System.out.println("Não é bissexto!");

    }
}
