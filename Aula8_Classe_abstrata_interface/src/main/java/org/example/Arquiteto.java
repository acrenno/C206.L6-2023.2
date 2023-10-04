package org.example;

public class Arquiteto extends Funcionario{
    private String especialidade;

    @Override
    public void executaAcao() {
        System.out.println("O arquiteto esta desenhando");
    }

    @Override
    public double salarioBonus() {
        double sn = getSalario()+100;
        setSalario(sn);
        return getSalario();
    }
}
