package org.example;

public class Main {
    public static void main(String[] args) {

        /*

        Teste t1 = new Teste();
        Teste t2 = new Teste();
        Teste t3 = new Teste();

        System.out.println(Teste.qtd);

         */

        Conta[] continhas = new Conta[4];

        Conta c1 = new Conta("Victor", 00000, 100);

        continhas[0] = c1;

        Conta c2 = new Conta("Pedro Braz", 11111, 900);

        continhas[1] = c2;

        Conta c3 = new Conta("Luiz", 22222, 1200);

        continhas[2] = c3;

        for (int i = 0; i < continhas.length; i++) {
            if (continhas[i]!= null){
                System.out.println(continhas[i].getSaldo());
            }

        }


    }
}