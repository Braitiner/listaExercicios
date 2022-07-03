//Faça um Programa que leia um número inteiro menor que 1000 e imprima a quantidade de centenas, dezenas e unidades do mesmo.
//Observando os termos no plural a colocação do "e", da vírgula entre outros. Exemplo:
//326 = 3 centenas, 2 dezenas e 6 unidades
//12 = 1 dezena e 2 unidades Testar com: 326, 300, 100, 320, 310,305, 301, 101, 311, 111, 25, 20, 10, 21, 11, 1, 7 e 16


package br.com.lista_exercicio.estrutura_de_decisao;


import java.util.Scanner;

public class Exercicio19 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Informe um numero inteiro menor que 1000: ");
        String numero = scan.next();
        String unidade;
        String dezena;
        String centena;
        boolean soNumeros = numero.matches("^\\d+$");

        System.out.print(numero +" = ");

        if(numero.length() <= 3 & soNumeros == true){
            if (numero.length() == 3 ){
                 unidade = numero.substring(2,3);
                 dezena = numero.substring(1,2);
                 centena = numero.substring(0,1);

                 if (centena.contains("1") | centena.contains("0")){
                     System.out.print(centena + " centena ");
                 } else System.out.print(centena + " centenas");

                if (dezena.contains("1") | dezena.contains("0")){
                    System.out.print(" e "+dezena + " dezena ");
                } else System.out.print(" e "+ dezena + " dezenas");

                if(unidade.contains("1") | unidade.contains("0")){
                    System.out.print("e "+unidade +" unidade");
                } else System.out.print(" e "+unidade + " unidades");



            } else if (numero.length() == 2){
                unidade = numero.substring(1,2);
                dezena = numero.substring(0,1);

                if (dezena.contains("1") | dezena.contains("0")){
                    System.out.print(dezena + " dezena ");
                } else System.out.print(dezena + " dezenas");

                if(unidade.contains("1") | unidade.contains("0")){
                    System.out.print(" e "+unidade +" unidade");
                } else System.out.print(" e "+unidade + " unidades");


            } else if (numero.length() == 1){
                unidade = numero.substring(0);
                if(unidade.contains("1") | unidade.contains("0")){
                    System.out.print(unidade +" unidade");
                } else System.out.print(unidade + " unidades");
            }

        } else System.out.println("Valor invalido");

    }
}
