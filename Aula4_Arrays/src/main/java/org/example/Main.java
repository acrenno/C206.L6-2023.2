package org.example;

public class Main {
    public static void main(String[] args) {


        //array de primitivos
        int [] numeros = {1,3,45,2,67, 34};

        //System.out.println(numeros[4]);

        /*
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        for (int n: numeros) {
            System.out.println(n);
        }
         */

        //arrays do tipo conta
        Conta[] continhas = new Conta[5];

        //instanciando conta do luiz (primeira forma)
        Conta c1 = new Conta("Luiz", 1000.40);
        continhas[0] = c1;
        //instanciando conta do Victor (segunda forma)
        continhas[1] = new Conta("Victor", 100.35);

        /*
        NAO RECOMENDADO
        for (Conta c: continhas) {
            System.out.println(c.dono);

        }
         */

        //adicionando c1 nas outras posicoes do array
        for (int i = 0; i < continhas.length; i++) {
            if(continhas[i] ==null){
                continhas[i] = c1;
            }

        }

        int qtd=0;



        //varrendo o array todo completo
        for (Conta c:continhas) {
            System.out.println(c.dono);
            System.out.println(c.saldo);

        }

        for (int i = 0; i < continhas.length; i++) {
            if (continhas[i] !=null){
                if(continhas[i].dono.equals("Luiz")){
                    qtd++;
                }
            }

        }

        System.out.println(qtd);







    }
}