package org.example;

public class Main {
    public static void main(String[] args) {

        Funcionario fun1 = new Funcionario("Marcelo", 111111, 21, 300);
        Funcionario fun2 = new Funcionario("Luiz", 22222, 20, 500);

        /*
        fun1.nome = "Marcelo";
        fun1.cpf = 1111111;
        fun1.idade = 21;
        fun1.salario = 300;

        fun2.nome = "Luiz";
        fun2.cpf = 2222222;
        fun2.idade=20;
        fun2.salario = 500;



        fun2.tirarFerias("Dezembro", 2);
        System.out.println(fun1.salarioAnual());
        System.out.println("Marcelo pos dezembro");
        System.out.println(fun1.salarioAnual(1000));

         */

        System.out.println("Funcionario 1: "+ fun1);
    }
}