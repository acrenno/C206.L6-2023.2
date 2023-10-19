package org.example;

public class Animal {

    String nome;
    int idade;
    String raca;

    public Animal(String nome, int idade, String raca) {
        this.nome = nome;
        this.idade = idade;
        this.raca = raca;
    }

    public void cadastrar() throws IdadeVelhaException {
            if (this.idade > 10) {
                throw new IdadeVelhaException();
            } else {
                System.out.println("animal pode ser cadastrado");
            }


        }
    }

