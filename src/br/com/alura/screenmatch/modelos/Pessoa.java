package br.com.alura.screenmatch.modelos;

public class Pessoa {
    String nome;
    int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pessoa: %s (idade: %d)".formatted(nome, idade);
    }
}
