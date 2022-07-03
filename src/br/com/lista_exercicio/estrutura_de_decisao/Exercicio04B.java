//Faça um Programa que verifique se uma letra digitada é vogal ou consoante.



package br.com.lista_exercicio.estrutura_de_decisao;

import java.util.Scanner;

public class Exercicio04B {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe uma letra ");
        String letra = scan.next().toUpperCase();


    switch (letra){
        case "A":
            System.out.println("vogal");
            break;
        case "E":
            System.out.println("vogal");
            break;
        case "I":
            System.out.println("vogal");
            break;
        case "O":
            System.out.println("vogal");
            break;
        case "U":
            System.out.println("vogal");
            break;
        default:
            System.out.println("Consoante");
    }






    }
}
