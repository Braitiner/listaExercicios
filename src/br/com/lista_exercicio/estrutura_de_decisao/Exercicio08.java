//Faça um programa que pergunte o preço de três produtos e informe qual produto você deve comprar, sabendo que a decisão
// é sempre pelo mais barato.



package br.com.lista_exercicio.estrutura_de_decisao;

import java.util.Random;

public class Exercicio08 {

    public static void main(String[] args) {

        Random random = new Random();


        int produtoUm = random.nextInt(100);
        int produtoDois = random.nextInt(100);
        int produtoTres = random.nextInt(100);


        System.out.println("1º: R$" + produtoUm + ",00 2º: R$" + produtoDois + ",00 3º: R$" + produtoTres + ",00");


        if (produtoUm < produtoDois & produtoUm < produtoTres) {
            System.out.println("Menor preço é: " + produtoUm);

        } else if (produtoDois < produtoUm & produtoDois < produtoTres) {
            System.out.println("Menor preço é: " + produtoDois);

        } else {
            System.out.println("Menor preço é: " + produtoTres + ",00");


        }
    }
}