package org.example;

public abstract class Funcionario {

    //atributos funcionario
    private String nome;
    private int idade;
    private double salario;

    public void mostraInfo(){
        System.out.println("Nome do funcionario:" + nome);
        System.out.println("Idade do funcionario:" + idade);
        System.out.println("Salario do funcionario:" + salario);
    }

    public abstract void executaAcao();

    public abstract double salarioBonus();

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
