//Faça um Programa que verifique se uma letra digitada é "F" ou "M". Conforme a letra escrever:
// F - Feminino, M - Masculino, Sexo Inválido.



package br.com.lista_exercicio.estrutura_de_decisao;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Escreva F para feminino e M para masculino: ");
        String letra = scan.next().toUpperCase();



        if (letra.contains("F")){
            System.out.println("F - Feminino");

        }else if (letra.contains("M")){
            System.out.println("M - Masculino");

        }else {
            System.out.println("Sexo invalido");
        }





    }
}
