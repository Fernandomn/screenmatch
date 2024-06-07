package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Pessoa;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme filmeMatrix = new Filme("The Matrix", 1999);
        filmeMatrix.setDuracaoEmMinutos(135);
        filmeMatrix.setIncluidoNoPlano(true);

        Filme filmeJohnWick = new Filme("John Wick", 2014);
        filmeJohnWick.setDuracaoEmMinutos(101);
        filmeJohnWick.setIncluidoNoPlano(true);

        Serie serieLaCasaDePapel = new Serie("La Casa de Papel", 2017);

        serieLaCasaDePapel.setIncluidoNoPlano(true);
        serieLaCasaDePapel.setAtiva(true);
        serieLaCasaDePapel.setTemporadas(5);
        serieLaCasaDePapel.setEpisodiosPorTemporada(10);
        serieLaCasaDePapel.setMinutosPorEpisodio(45);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(filmeMatrix);
        calculadora.inclui(filmeJohnWick);
        calculadora.inclui(serieLaCasaDePapel);

        System.out.println("Tempo total: " + calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(filmeMatrix);
        filtro.filtra(filmeJohnWick);

        Episodio episodioLaCasa = new Episodio();
        episodioLaCasa.setNumero(1);
        episodioLaCasa.setSerie(serieLaCasaDePapel);
        episodioLaCasa.setTotalVisualizacoes(300);
        filtro.filtra((episodioLaCasa));

        var filmeFerna = new Filme("Senhor dos Anéis",2021);
        filmeFerna.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeFerna);
        listaDeFilmes.add(filmeMatrix);
        listaDeFilmes.add(filmeJohnWick);
        System.out.println("Tamanho da lista: %d.".formatted(listaDeFilmes.size()));
        System.out.println("Primeiro filme: %s.".formatted(listaDeFilmes.get(0).getNome()));
        System.out.println(listaDeFilmes);

        var pessoaFerna = new Pessoa("Fernando", 33);
        var pessoaCamila = new Pessoa("Camila", 26);
        var pessoaOnix=new Pessoa("Onix", 13);
        var pessoaMago=new Pessoa("Mago", 13);

        ArrayList<Pessoa> listaDePessoas = new ArrayList<Pessoa>();
        listaDePessoas.add(pessoaFerna);
        listaDePessoas.add(pessoaCamila);
        listaDePessoas.add(pessoaOnix);
        listaDePessoas.add(pessoaMago);

        System.out.println("Tamanho da lista de pessoas: %d".formatted(listaDePessoas.size()));
        System.out.println("Primeira pessoa: %s".formatted(listaDePessoas.get(0)));
        System.out.println("Lista de pessoas:");
        for (Pessoa pessoa:listaDePessoas){
            System.out.println(pessoa);
        }
    }
}
