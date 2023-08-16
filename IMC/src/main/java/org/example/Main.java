package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //exercicio IMC

        Scanner entrada = new Scanner(System.in);//Classe para entrada de dados


        //entrando com valores
        System.out.println("Entre com seu peso:");
        float peso = entrada.nextFloat();//variavel para entrada de pesos
        System.out.println("Entre com sua altura");
        float altura = entrada.nextFloat();//variavel para entrada de altura

        float imc;//variavel para imc

        imc = (float) (peso / (Math.pow(altura, 2)));//calculando imc

        //verificando o grau do imc
        if (imc < 18.5) {
            System.out.println("Abaixo do peso");
        }
        else if (imc >= 18.5 && imc <= 24.9)
                System.out.println("Peso Normal");
        else if (imc >= 25 && imc <= 29.9)
                System.out.println("Sobre Peso");
        else if (imc >= 30 && imc <= 34.9)
                System.out.println("Obesidade grau I");
        else if (imc >= 35 && imc <= 39.9)
                System.out.println("Obesidade grau II");
        else
                System.out.println("Obesidade grau III ou Morbida");

        }
    }
