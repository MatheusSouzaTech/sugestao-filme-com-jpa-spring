package br.com.alura.screenmatch.model;

public enum Categoria {

    // Enum que define as categorias de filmes ou séries com os rótulos do OMDb
    ACAO("Action"),          // Categoria "ACAO" mapeada para "Action" no OMDb
    ROMANCE("Romance"),      // Categoria "ROMANCE" mapeada para "Romance"
    COMEDIA("Comedy"),       // Categoria "COMEDIA" mapeada para "Comedy"
    DRAMA("Drama"),          // Categoria "DRAMA" mapeada para "Drama"
    CRIME("Crime");          // Categoria "CRIME" mapeada para "Crime"

    // Campo privado para armazenar o nome da categoria conforme usado no OMDb
    private String categoriaOmdb;

    // Construtor do enum, chamado ao definir cada valor (ACAO, ROMANCE, etc.)
    Categoria(String categoriaOmdb){
        this.categoriaOmdb = categoriaOmdb;
    }

    // Método estático para converter uma String em uma instância do enum Categoria
    public static Categoria fromString(String text){
        // Percorre todos os valores possíveis do enum Categoria
        for(Categoria categoria : Categoria.values()){
            // Compara ignorando maiúsculas/minúsculas
            if(categoria.categoriaOmdb.equalsIgnoreCase(text)){
                return categoria;  // Retorna a correspondência encontrada
            }
        }
        // Lança exceção se nenhuma categoria corresponder ao texto fornecido
        throw new IllegalArgumentException("Nenhuma categoria encontrada para a String fornecida: " + text);
    }

}
