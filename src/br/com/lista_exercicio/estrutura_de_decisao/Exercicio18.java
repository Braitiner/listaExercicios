//Faça um Programa que peça uma data no formato dd/mm/aaaa e determine se a mesma é uma data válida.


package br.com.lista_exercicio.estrutura_de_decisao;


import java.util.Scanner;

public class Exercicio18 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Informe uma datano formato dd/mm/aaaa: ");
        String data = scan.next();

        String dia = data.substring(0, 2);
        int nDia = Integer.parseInt(dia);

        String mes = data.substring(3, 5);
        int nMes = Integer.parseInt(mes);

        String ano = data.substring(6, 10);
        int nAno = Integer.parseInt(ano);


        if (nMes == 1 | nMes == 3 | nMes == 5 | nMes == 7 | nMes == 8 | nMes == 10 | nMes == 12) {
            if (nDia > 0 & nDia <= 31 & nAno > 0 & ano.length() == 4) {
                System.out.println(data + "\nData valida!");
            } else System.out.println("Formato invalido!");

        } else if (nMes == 4 | nMes == 6 | nMes == 9 | nMes == 11) {
            if (nDia > 0 & nDia <= 30 & nAno > 0 & ano.length() == 4) {
                System.out.println(data + "\nData valida!");
            } else System.out.println("Formato invalido!");

        } else if (nMes == 2) {
            if (nAno % 4 == 0 & nAno % 100 == 0 & nAno % 400 == 0) {

                if (nDia > 0 & nDia <= 29 & nAno > 0 & ano.length() == 4) {
                    System.out.println(data + "\nData valida!");

                } else if (nAno % 4 == 0 & nAno % 100 != 0) {

                    if (nDia > 0 & nDia <= 29 & nAno > 0 & ano.length() == 4) {
                        System.out.println(data + "\nData valida!");
                    } else System.out.println("Formato invalido!");

                } else {

                    System.out.println("Formato invalido!");

                }


            } else {

                if (nDia > 0 & nDia <= 28 & nAno > 0 & ano.length() == 4) {
                    System.out.println(data + "\nData valida!");
                } else System.out.println("Formato invalido!");

            }


        } else System.out.println("Data invalida!");

    }
}
