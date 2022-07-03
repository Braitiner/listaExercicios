//Faça um Programa para leitura de três notas parciais de um aluno. O programa deve calcular a média alcançada por aluno
// e presentar:

//A - A mensagem "Aprovado", se a média for maior ou igual a 7, com a respectiva média alcançada;
//B - A mensagem "Reprovado", se a média for menor do que 7, com a respectiva média alcançada;
//C - A mensagem "Aprovado com Distinção", se a média for igual a 10.


package br.com.lista_exercicio.estrutura_de_decisao;


import java.util.Scanner;

public class Exercicio20 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a 1ª nota: ");
        int primeiraNota = scan.nextInt();
        System.out.println("Informe a 2ª nota: ");
        int segundaNota = scan.nextInt();
        System.out.println("Informe a 3ª nota: ");
        int terceiraNota = scan.nextInt();

        double media = (primeiraNota + segundaNota + terceiraNota) / 3;

        if (media == 10){
            System.out.printf("%.2f: Aprovado com Destinção!", media);
        } else if (media >= 7){
            System.out.printf("%.2f: Aprovado!", media);

        } else System.out.printf("%.2f: Reprovado!", media);

    }
}
