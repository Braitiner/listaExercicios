//Faça um Programa que verifique se uma letra digitada é vogal ou consoante.



package br.com.lista_exercicio.estrutura_de_decisao;

import java.util.Scanner;

public class Exercicio04A {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe uma letra ");
        String letra = scan.next().toUpperCase();

        if (letra.substring(0,1).contains("A") | letra.substring(0,1).contains("E") | letra.substring(0,1).contains("I")
                | letra.substring(0,1).contains("O") | letra.substring(0,1).contains("U") ){

            System.out.println("vogal");

    } else {
            System.out.println("consoante");
        }






    }
}
