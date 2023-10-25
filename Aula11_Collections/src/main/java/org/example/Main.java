package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {


        /*
        //arraylist heterogeneo
        ArrayList itens = new ArrayList();

        Conta c1 = new Conta();

        //adicionando coisas no array
        itens.add(7);
        itens.add("Anna");
        itens.add(10.4);
        itens.add(c1);

        //remover pelo index
        //itens.remove(2);
        //remover pelo nome
        //itens.remove("Anna");


        //mostrando infos
        for (int i = 0; i < itens.size(); i++) {
            System.out.println(itens.get(i));

        }


        ArrayList <Integer> inteiros = new ArrayList<>();

        inteiros.add(2);
        inteiros.add(24);
        inteiros.add(8);
        inteiros.add(12);
        inteiros.add(4);
        inteiros.add(9);


        for (int i = 0; i < inteiros.size(); i++) {
            System.out.println(inteiros.get(i));
        }

        //ordenando por numeros crescentes
      // Collections.sort(inteiros);
        //ordenando por numeros decrescentes
      //  Collections.reverse(inteiros);

        //metodos adicionais
        //System.out.println(inteiros.indexOf(12));
        //System.out.println(inteiros.isEmpty());
        //inteiros.clear();


        for (int i = 0; i < inteiros.size(); i++) {
            System.out.println(inteiros.get(i));
        }

        System.out.println("jsjsjjsjs");

         */

        ArrayList <Conta> contas = new ArrayList<>();

        Conta c1 = new Conta("Zooo", 600);
        Conta c2 = new Conta("Gustavo", 200);
        Conta c3 = new Conta("Silas", 900);

        contas.add(c1);
        contas.add(c2);
        contas.add(c3);

        for (int i = 0; i < contas.size(); i++) {
            System.out.println(contas.get(i).getDono());
            System.out.println(contas.get(i).getNum());
        }

        Collections.sort(contas);
        Collections.reverse(contas);

        for (int i = 0; i < contas.size(); i++) {
            System.out.println(contas.get(i).getDono());
            System.out.println(contas.get(i).getNum());
        }






    }
}