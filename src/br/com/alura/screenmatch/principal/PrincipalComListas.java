package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme filmeMatrix = new Filme("The Matrix", 1999);
        Filme filmeJohnWick = new Filme("John Wick", 2014);
        Serie serieLaCasaDePapel = new Serie("La Casa de Papel", 2017);
        var filmeFerna = new Filme("Senhor dos Anéis",2021);

        ArrayList<Titulo> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeFerna);
        listaDeFilmes.add(filmeMatrix);
        listaDeFilmes.add(filmeJohnWick);
        listaDeFilmes.add(serieLaCasaDePapel);

        for (Titulo titulo: listaDeFilmes){
            System.out.println(titulo);
            if (titulo instanceof Filme filme && filme.getClassificacao() > 2){
                System.out.println("Classificação: %d".formatted(filme.getClassificacao()));
            }
        }

        ArrayList<String> buscaPorArtista = new ArrayList<String>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Luana Piovani");
        buscaPorArtista.add("Seu Jorge");
        buscaPorArtista.add("Katerina Zeta Jones");
        System.out.println(buscaPorArtista);
        Collections.sort(buscaPorArtista);
        System.out.println(buscaPorArtista);

        System.out.println(listaDeFilmes);
        System.out.println("Ordenando por nome:");
        Collections.sort(listaDeFilmes);
        System.out.println(listaDeFilmes);

        listaDeFilmes.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano:");
        System.out.println(listaDeFilmes);
    }
}
