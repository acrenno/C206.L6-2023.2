package org.example;

public class Funcionario {

    //atributos da classe
    String nome;
    int cpf;
    int idade;
    float salario;

    public Funcionario(String nome, int cpf, int idade, float salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.salario = salario;
    }

    public void tirarFerias(String mes, int dias){
        System.out.println( "o funcionario " +nome + " tirou " + dias + " dias no mes de " + mes);

    }

    public float salarioAnual(){
        float salarioAnual;
        salarioAnual = salario * 12;
        return salarioAnual;
    }

    public float salarioAnual(float decimoter){
        float salarioAnual;
        salarioAnual = (salario*12) + decimoter;
        return salarioAnual;
    }




}
