import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme filmeMatrix = new Filme();
        filmeMatrix.setNome("The Matrix");
        filmeMatrix.setAnoDeLancamento(1999);
        filmeMatrix.setDuracaoEmMinutos(135);
        filmeMatrix.setIncluidoNoPlano(true);

        Filme filmeJohnWick = new Filme();
        filmeJohnWick.setNome("John Wick");
        filmeJohnWick.setAnoDeLancamento(2014);
        filmeJohnWick.setDuracaoEmMinutos(101);
        filmeJohnWick.setIncluidoNoPlano(true);

        Serie serieLaCasaDePapel = new Serie();
        serieLaCasaDePapel.setNome("La Casa de Papel");
        serieLaCasaDePapel.setAnoDeLancamento(2017);
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
    }
}
