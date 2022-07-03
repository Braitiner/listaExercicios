//Faça um Programa que leia um número e exiba o dia correspondente da semana. (1-Domingo, 2- Segunda, etc.),
// se digitar outro valor deve aparecer valor inválido.


package br.com.lista_exercicio.estrutura_de_decisao;


import java.util.Random;

public class Exercicio13 {

    public static void main(String[] args) {

        Random random = new Random();

        int dia = random.nextInt(10)+1;
        System.out.println("Valor soreteado: " + dia);

        switch (dia){
            case 1:
                System.out.println("1 - Domingo");
                break;
            case 2:
                System.out.println("2 - Seguda-Feira");
                break;
            case 3:
                System.out.println("3 - Terça-Feira");
                break;
            case 4:
                System.out.println("4 - Quarta-Feira");
                break;
            case 5:
                System.out.println("5 - Quinta-Feira");
                break;
            case 6:
                System.out.println("6 - Sexta-Feira");
                break;
            case 7:
                System.out.println("7 - Sabado");
                break;
            default:
                System.out.println("valor invalido");



        }






    }
}
