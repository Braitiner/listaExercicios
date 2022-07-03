//Faça um Programa que pergunte em que turno você estuda. Peça para digitar M-matutino ou V-Vespertino ou N- Noturno.
// Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor Inválido!", conforme o caso.



package br.com.lista_exercicio.estrutura_de_decisao;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual seu turno? Informe M-matutino ou V-Vespertino ou N- Noturno");
        String turno = scan.next().toUpperCase();

        if(turno.length() > 1 ) System.out.println("Valor Inválido!");
        else if (turno.contains("M")) System.out.println("Bom dia");
        else if(turno.contains("V")) System.out.println("Boa tarde");
        else if (turno.contains("N")) System.out.println("Boa noite");
        else System.out.println("Valor Inválido");


    }
}
