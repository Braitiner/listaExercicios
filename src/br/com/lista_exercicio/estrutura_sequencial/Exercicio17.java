//Faça um Programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser pintada.
// Considere que a cobertura da tinta é de 1 litro para cada 6 metros quadrados e que a tinta é vendida em latas de
// 18 litros, que custam R$ 80,00 ou em galões de 3,6 litros, que custam R$ 25,00.
//Informe ao usuário as quantidades de tinta a serem compradas e os respectivos preços em 3 situações:
//comprar apenas latas de 18 litros;
//comprar apenas galões de 3,6 litros;
//misturar latas e galões, de forma que o desperdício de tinta seja menor. Acrescente 10% de folga e sempre arredonde os
// valores para cima, isto é, considere latas cheias.


package br.com.lista_exercicio.estrutura_sequencial;

import java.util.Scanner;

public class Exercicio17 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Informe a quantidade de M²: ");
        var  litrosDeTinta = ((scan.nextInt()*1.1) / 6);
        int lata = (int) Math.ceil(litrosDeTinta/18);
        int galao = (int) Math.ceil(litrosDeTinta/3.6);
        int lataEGalao = (int) litrosDeTinta / 18;
        var galaoELata = litrosDeTinta % 18;
        int galaoELata2 = (int) Math.ceil(galaoELata/3.6);



        System.out.println("litros: " + litrosDeTinta );
        System.out.println("lata: "+ lata + " valor total: R$" + lata*80);
        System.out.println("Galão: "+ galao + " valor total: R$" + galao*25);
        System.out.println("lata: " + lataEGalao + " ///galão: " + galaoELata2 + " ///total: R$" + ((lataEGalao*80)+(galaoELata2*25)));



    }
}
