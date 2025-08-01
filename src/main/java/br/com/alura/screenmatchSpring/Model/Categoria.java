package br.com.alura.screenmatchSpring.Model;

public enum Categoria {
    ACAO("Action"), ROMANCE("Romance"), COMEDIA("Comedy"), DRAMA("Drama"), CRIME("Crime"), AVENTURA("Adventure");

    private String categoriaOmdb;

    Categoria(String categoriaOmdb){
        this.categoriaOmdb = categoriaOmdb;
    }

    public static Categoria fromString(String text) {
        for (Categoria categoria : Categoria.values()) {
            if (categoria.categoriaOmdb.equalsIgnoreCase(text)){
                return categoria;
            }
        }
        throw new IllegalArgumentException("Nenhuma Categoria Encontrada");
    }
}
