//Faça um programa para a leitura de duas notas parciais de um aluno. O programa deve calcular a média alcançada
// por aluno e apresentar:
//A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
//A mensagem "Reprovado", se a média for menor do que sete;
//A mensagem "Aprovado com Distinção", se a média for igual a dez.



package br.com.lista_exercicio.estrutura_de_decisao;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a 1ª nota:  ");
        double primeiraNota = scan.nextDouble();

        System.out.println("Informe a 2ª nota:  ");
        double segundaNota = scan.nextDouble();

        double media = (primeiraNota + segundaNota) / 2;

        if (media == 10){
            System.out.println("Aprovado com destinção");
        } else if (media >= 7){
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }







    }
}
