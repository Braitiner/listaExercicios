//Faça um Programa que leia três números e mostre-os em ordem decrescente.



package br.com.lista_exercicio.estrutura_de_decisao;

import java.util.Random;

public class Exercicio09 {

    public static void main(String[] args) {

        Random random = new Random();


        int numeroUm = random.nextInt(100);
        int numeroDois = random.nextInt(100);
        int numeroTres = random.nextInt(100);
        int primeiro = 0, segundo= 0, terceiro = 0;


        System.out.println("1º: " + numeroUm + " 2º: " + numeroDois + " 3º: " + numeroTres);

        if (numeroUm > numeroDois & numeroUm > numeroTres) {
            primeiro =numeroUm;
        } else if (numeroDois > numeroUm & numeroDois > numeroTres) {
            primeiro = numeroDois;
        } else
            primeiro = numeroTres;


        if (numeroUm < numeroDois & numeroUm < numeroTres) {
            terceiro = numeroUm;
        } else if (numeroDois < numeroUm & numeroDois < numeroTres) {
            terceiro = numeroDois;
        } else
           terceiro = numeroTres;


        if ((numeroUm > numeroDois & numeroUm < numeroTres) | (numeroUm < numeroDois & numeroUm > numeroTres) ){
            segundo = numeroUm;
        } else if ((numeroDois > numeroUm & numeroDois < numeroTres) | (numeroDois < numeroUm & numeroDois > numeroTres) ){
            segundo = numeroDois;
        } else
            segundo = numeroTres;





        System.out.println(primeiro+"\n"+segundo+"\n"+terceiro);


    }
}