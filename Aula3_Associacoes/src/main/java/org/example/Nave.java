package org.example;

public class Nave {

    //atributos da nave
    String nome;
    int velocidade;
    //atributo implicito da arma
    Arma arma = null;

    //construtor para associar o todo nave e a parte arma como composiçao
    public Nave(String nome, int velocidade, String tipo, int poder) {
        this.nome = nome;
        this.velocidade = velocidade;
        //instanciar uma arma sempre que eu instanciar uma nave
        this.arma = new Arma(tipo, poder);
    }

    //metodo mostrar informacoes da nave
    public void mostraInfo(){
        System.out.println("Nome da nave: " +nome);
        System.out.println("Velocidade da nave: " +velocidade);
    }

    //metodo sugerido para associacao de agregacao
    /*

    public void addArma(Arma arminha){
        System.out.println("Arma adicionada");
        this.arma = arminha;
    }

     */
}
