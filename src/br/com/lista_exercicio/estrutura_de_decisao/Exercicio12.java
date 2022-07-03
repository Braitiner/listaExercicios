//Faça um programa para o cálculo de uma folha de pagamento, sabendo que os descontos são do Imposto de Renda, que
// depende do salário bruto (conforme tabela abaixo), Inss e o FGTS corresponde a 8% do Salário
// Bruto, mas não é descontado (é a empresa que deposita). O Salário Líquido corresponde ao Salário Bruto menos os
// descontos. O programa deverá pedir ao usuário o valor da sua hora e a quantidade de horas trabalhadas no mês.

//Desconto do IR:
//Salário Bruto até 1.903,98 (inclusive) - isento
//Salário Bruto de R$ 1.903,99 a R$ 2.826,65 - 7,5% - R$ 142,80.
//Salário Bruto de R$ 2.826,66 a R$ 3.751,05 - 15% - R$ 354,80.
//Salário Bruto de R$ 3.751,06 a R$ 4.664,68 - 22,5% - R$ 636,13.
//Salário Bruto acima de R$ 4.664,68         - 27,5% - R$ 869,36.

//Desconto INSS
//Até R$ 1.212,00 (salário-mínimo) – 7,5%
//Entre R$ 1.100,01 e R$ 2.427,35 – 9%
//Entre R$ 2.427,36 e R$ 3.641,03 – 12%
//Entre R$ 3.641,04 e 7.087,22. – 14%

// Imprima na tela as informações, dispostas conforme o exemplo abaixo.
// No exemplo o valor da hora é 18,21 e a quantidade de hora é 200.


package br.com.lista_exercicio.estrutura_de_decisao;

import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Exercicio12Metodos calculos = new Exercicio12Metodos();

        System.out.println("Horas trabalhdas: ");
        int horastrabalhadas = scan.nextInt();

        System.out.println("Valor hora: ");
        double valorhora = scan.nextDouble();


        double salarioBruto = horastrabalhadas*valorhora;
        double inss = calculos.calculaInss(salarioBruto);
        double percentaulInss = calculos.percentualInss(salarioBruto,inss);
        double valorIr = calculos.calculoIr(salarioBruto-inss);


        System.out.printf("Salario Bruto: ( %2.2f * %d).........R$%2.2f",valorhora, horastrabalhadas,salarioBruto);

        System.out.printf("\n(-) INSS (%2.1f%%).......................R$%2.2f",calculos.percentualInss(salarioBruto,inss),inss);
        System.out.printf("\n(-) IR (%2.1f%%)....................R$%2.2f", calculos.percentualIr(salarioBruto-inss),valorIr);
        System.out.printf("\nFGTS (8%%).............................R$%2.2f", salarioBruto*0.08);
        System.out.printf("\nTotal de descontos..................R$%2.2f", inss + valorIr);
        System.out.printf("\nSalário Líquido......................R$%2.2f", salarioBruto-(valorIr+inss));

    }
}

class Exercicio12Metodos {

    public double calculaInss(double salarioBruto) {

        double valorInss = 0;
        if (salarioBruto < 7087.22){

            if(salarioBruto > 3641.04){
                salarioBruto -= 3641.03;
                valorInss += (salarioBruto * 0.14) + 345.92;
            }else if (salarioBruto > 2427.36){
                salarioBruto -= 2427.35;
                valorInss += (salarioBruto * 0.12) + 200.28;
            }else if (salarioBruto > 1212.01){
                salarioBruto -= 1212;
                valorInss += (salarioBruto * 0.09) + 90.90;
            } else valorInss+=(salarioBruto*0.075001);

        } else valorInss+= 828.38;

        return valorInss;
    }

    public double percentualInss(double salarioBruto, double inss){

        return (inss*100)/salarioBruto;
    }

    public  double calculoIr(double salarioLiquido){

        double valorIr = 0;

        if (salarioLiquido > 1903.98){
            if(salarioLiquido > 4664.68) valorIr = (salarioLiquido * 0.275) - 839.66;
            else if (salarioLiquido > 3751.06) valorIr = (salarioLiquido * 0.225) - 636.13;
            else if (salarioLiquido > 2826.66) valorIr = (salarioLiquido * 0.15) - 354.80;
            else if (salarioLiquido > 1903.98) valorIr = (salarioLiquido * 0.075) - 142.80;
        }else valorIr = 0;

        if (valorIr <= 10) valorIr = 0;

        return valorIr;
    }

    public  double percentualIr(double salarioLiquido) {

        double percentualIr = 0;

        if (salarioLiquido > 1903.98) {
            if (salarioLiquido > 4664.68) percentualIr = 27.5;
            else if (salarioLiquido > 3751.06) percentualIr = 22.5;
            else if (salarioLiquido > 2826.66) percentualIr = 15;
            else if (salarioLiquido > 1903.98) percentualIr = 7.5;

        }
        return percentualIr;
    }

}


