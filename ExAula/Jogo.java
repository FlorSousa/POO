package ExAula;

import java.util.List;

public class Jogo {

    private String nome;
    private double preco;
    private List<CategoriaDeJogo> categorias;

    public Jogo(String nome, double preco, List<CategoriaDeJogo> categorias) {
        this.nome = nome;
        this.preco = preco;
        this.categorias = categorias;
    }

    public boolean adicionaCategoria(CategoriaDeJogo categoria) {
        if (!this.categorias.contains(categoria)) {
            this.categorias.add(categoria);
            return true;
        } else {
            return false;
        }
    }

    public String getNome() {
        return this.nome;
    }

    public double getPreco(){
        return this.preco;
    }

    public boolean ehDaCategoria(CategoriaDeJogo categoria){
        return categorias.contains(categoria) ? true : false;
    }
}
