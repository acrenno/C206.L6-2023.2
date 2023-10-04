package org.example;

public class Main {
    public static void main(String[] args) {

        /*
        Professor p1 = new Professor();
        p1.executaAcao();

        Engenherio e1 = new Engenherio();
        e1.gerencia();

         */

        Funcionario [] funcs = new Funcionario[5];

        Professor p1 = new Professor();
        funcs [0] = p1;
        Engenherio e1 = new Engenherio();
        funcs [1] = e1;
        Arquiteto a1 = new Arquiteto();
        funcs [2] = a1;

        for (int i = 0; i < funcs.length; i++) {
            if(funcs[i]!=null){
                if(funcs[i] instanceof Professor){
                    Professor auxp = (Professor) funcs[i];
                    auxp.getNome();
                    auxp.setSalario(500);
                    auxp.corrigirProvas();
                }
                if(funcs[i] instanceof Engenherio){
                    Engenherio auxe = (Engenherio) funcs[i];
                    auxe.getNome();
                    auxe.setSalario(500);
                    auxe.gerencia();
                }
            }

        }

    }
}