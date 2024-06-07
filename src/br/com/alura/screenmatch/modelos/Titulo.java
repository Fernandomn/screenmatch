package br.com.alura.screenmatch.modelos;

public class Titulo implements Comparable<Titulo>{
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaAvaliacoes;
    private int totalAvaliacoes;
    private int duracaoEmMinutos;

    public Titulo(String nome,int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
        this.nome = nome;
    }

    public void avalia(double nota) {
        somaAvaliacoes += nota;
        totalAvaliacoes += 1;
    }

    public double pegaMedia() {
        return somaAvaliacoes / totalAvaliacoes;
    }

    public void exibeFichaTecnica() {
        System.out.println("Título: %s".formatted(nome));
        System.out.println("Ano de lançamento: %d".formatted(anoDeLancamento));
        System.out.println("Duração em minutos: %d".formatted(duracaoEmMinutos));
        System.out.println("Incluído no plano: %s".formatted(incluidoNoPlano ? "sim" : "não"));

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    @Override
    public int compareTo(Titulo o) {
        return this.getNome().compareTo(o.getNome());
    }
}
