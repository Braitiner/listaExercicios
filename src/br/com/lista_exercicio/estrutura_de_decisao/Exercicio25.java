//Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
//"Telefonou para a vítima?"
//"Esteve no local do crime?"
//"Mora perto da vítima?"
//"Devia para a vítima?"
//"Já trabalhou com a vítima?" O programa deve no final emitir uma classificação sobre a participação da pessoa no crime.
// Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita",
// entre 3 e 4 como "Cúmplice" e 5 como "Assassino". Caso contrário, ele será classificado como "Inocente".

package br.com.lista_exercicio.estrutura_de_decisao;


import java.util.Scanner;

public class Exercicio25 {

    public static void main(String[] args) {
        Exercicio25Metodos verifica = new Exercicio25Metodos();

        Scanner scan = new Scanner(System.in);
        int cont = 0;
        boolean pontua;
        String resposta;

        System.out.println("Telefonou para a vítima? ");
        resposta = verifica.formata(scan.next());
        pontua = verifica.pontua(resposta);

       if(pontua == true){
           cont ++;
       }







    }
}

class Exercicio25Metodos{

    public boolean pontua(String resposta){
       boolean retorno = false;
        if(resposta.contains("S")){
            retorno = true;

        }else {retorno = false;}

        return retorno;
    }

    public String formata(String resposta){
        return resposta.toUpperCase().substring(0,1);
    }
}


