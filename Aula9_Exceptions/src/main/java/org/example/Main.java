package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Animal[] animais = new Animal[10];

        Animal a1 = new Animal("peppa", 12, "porco");
        animais[0] = a1;
        Animal a2 = new Animal("horse", 3, "cavalo");
        animais[1] = a2;
        Animal a3 = new Animal("dog", 9, "cachorro");
        animais[2] = a3;

        try {

            a2.cadastrar();
            a3.cadastrar();
            a1.cadastrar();
        }catch (IdadeVelhaException e ){
            e.idadeavancada();
        }


        /*
        try {
            for (int i = 0; i < animais.length; i++) {
                System.out.println(animais[i].nome);
                System.out.println(animais[i].idade);
                System.out.println(animais[i].raca);

            }
        }catch (NullPointerException e){
            System.out.println(e);
        }

        System.out.println("blablabla");


        Scanner sc = new Scanner(System.in);

        float n3 = 0;
        try{
        int n1=0;
        int n2 = 0;


        n1= sc.nextInt();
        n2 = sc.nextInt();
            //n4 = n1+n2;
            System.out.println((n1/n2));
            n3=n1+n2;
        }catch(InputMismatchException e){
            System.out.println("O numero colocado nao é um int");
            System.out.println(e.fillInStackTrace());
        }catch (ArithmeticException e){
            System.out.println("o numero nao pode ser divisivel por 0");
        }
            System.out.println(n3);



         */
    }
}