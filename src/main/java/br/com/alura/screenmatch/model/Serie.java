package br.com.alura.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.sun.jdi.DoubleValue;

import java.util.OptionalDouble;

public class Serie {

    private String titulo;
    private Integer totalTemporadas;
    private Double avaliacao;
    private String ator;
    private String sinopse;
    private Categoria genero;
    private String poster;

    // Construtor da classe Serie que recebe um objeto DadosSerie como argumento
    public Serie(DadosSerie dadosSerie){

        // Atribui o título da série a partir do objeto DadosSerie
        this.titulo = dadosSerie.titulo();

        // Atribui o total de temporadas a partir do objeto DadosSerie
        this.totalTemporadas = dadosSerie.totalTemporadas();

        // Converte a avaliação (provavelmente String) em Double, e define 0.0 caso esteja ausente ou inválida
        this.avaliacao = OptionalDouble.of(Double.valueOf(dadosSerie.avaliacao())).orElse(0.0);

        // Atribui o ator principal ou atores a partir do objeto DadosSerie
        this.ator = dadosSerie.ator();

        // Atribui a sinopse da série a partir do objeto DadosSerie
        this.sinopse = dadosSerie.sinopse();

        // Extrai o primeiro gênero da lista de gêneros (separados por vírgula), remove espaços, e converte para enum Categoria
        this.genero = Categoria.fromString(dadosSerie.genero().split(",")[0].trim());
    }

}
