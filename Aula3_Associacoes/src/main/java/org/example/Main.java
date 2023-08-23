package org.example;

public class Main {
    public static void main(String[] args) {




        //instanciando uma nova arma
        Arma armete = new Arma(); //dando erro porque precisa passar os parametros
        armete.tipo = "Fogo";
        armete.poder = 20;


       // instanciando nova nave e , adicionando armete como arma da navinha
        Nave navinha = new Nave("Xuniz", 200, armete.tipo, armete.poder);

        //saindo com A REFERENCIA/ENDERECO DE MEMORIA DA ARMA
       System.out.println(navinha.arma);

       //metodo a ser utilizado caso seja agregacao
       // navinha.addArma(armete);

        //saindo com o tipo da arma da nave
        System.out.println(navinha.arma.tipo);
    }
}