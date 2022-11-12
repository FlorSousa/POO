package Ex8;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws FilmeJaExisteException{
        SistemaFilmesMap sis = new SistemaFilmesMap();
        List<CategoriaFilme> categorias = new ArrayList<>();
        categorias.add(CategoriaFilme.ACAO);
        categorias.add(CategoriaFilme.DRAMA);
        Filme novoFilme = new Filme("2se2dfzs","bola",2022,84,categorias);
        sis.cadastraFilme(novoFilme);
    }
}
