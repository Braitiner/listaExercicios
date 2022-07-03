//Faça um programa que lê as duas notas parciais obtidas por um aluno numa disciplina ao longo de um semestre,
// e calcule a sua média. A atribuição de conceitos obedece à tabela abaixo:

//  Média de Aproveitamento  Conceito
//  Entre 9.0 e 10.0        A
//  Entre 7.5 e 9.0         B
//  Entre 6.0 e 7.5         C
//  Entre 4.0 e 6.0         D
//  Entre 4.0 e zero        E

//O algoritmo deve mostrar na tela as notas, a média, o conceito correspondente e a mensagem “APROVADO” se o conceito
// for A, B ou C ou “REPROVADO” se o conceito for D ou E.


package br.com.lista_exercicio.estrutura_de_decisao;


import java.util.Scanner;

public class Exercicio14 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Informe a 1ª nota: ");
        double notaUm = scan.nextDouble();
        System.out.println("Informe a 2ª nota: ");
        double notaDois = scan.nextDouble();

        double media = (notaUm + notaDois)/2;

        if(media >= 9){
            System.out.printf("1ª nota: %.2f\n2ª nota: %.2f\nMedia: %.2f\nConceito: A\nAprovado!",notaUm,notaDois,media);

        }else if (media >= 7.5){
            System.out.printf("1ª nota: %.2f\n2ª nota: %.2f\nMedia: %.2f\nConceito: B\nAprovado!",notaUm,notaDois,media);

        }else if(media >= 6){
            System.out.printf("1ª nota: %.2f\n2ª nota: %.2f\nMedia: %.2f\nConceito: C\nAprovado!",notaUm,notaDois,media);

        }else if(media >= 4){
            System.out.printf("1ª nota: %.2f\n2ª nota: %.2f\nMedia: %.2f\nConceito: D\nReprovado!",notaUm,notaDois,media);

        }else
            System.out.printf("1ª nota: %.2f\n2ª nota: %.2f\nMedia: %.2f\nConceito: E\nReprovado!",notaUm,notaDois,media);

    }
}
