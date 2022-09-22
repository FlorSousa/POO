package ExAula;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SteamPOOHash implements SteamPOO {

    private Map<String, Jogo> jogos;

    public SteamPOOHash() {
        this.jogos = new HashMap<>();
    }

    public int contaJogosDaCategoria(CategoriaDeJogo categoria) {
        int cont = 0;
        for (Jogo j : this.jogos.values()) {
            if (j.ehDaCategoria(categoria)) {
                cont++;
            }
        }
        return cont;


    }


    public double pesquisaPrecoDoJogo(String nome) throws JogoInexistenteException {
        for (Jogo j : this.jogos.values()) {
            if (j.getNome().equals(nome)) {
                return j.getPreco();
            }
        }

        throw new JogoInexistenteException("Não existe jogo com o nome " + nome);

    }


    @Override
    public void cadastraJogo(Jogo jogo) throws JogoJaExisteException {
        if (this.jogos.containsKey(jogo.getNome())) {
            throw new JogoJaExisteException("Já existe jogo com o nome "
                    + jogo.getNome());
        } else {
            this.jogos.put(jogo.getNome(), jogo);
        }

    }

    @Override
    public void adicionaCategoriaEmJogo(String nomeJogo, CategoriaDeJogo categoria) throws JogoInexistenteException {

    }


    @Override
    public boolean existeJogoComNome(String nomeJogo) {
        return this.jogos.containsKey(nomeJogo);
    }


    @Override
    public List<Jogo> pesquisaJogosDaCategoria(CategoriaDeJogo categoria) {
        List<Jogo> jogosDaCategoria = new ArrayList<Jogo>();
        for (Jogo j : this.jogos.values()) {
            if (j.ehDaCategoria(categoria)) {
                jogosDaCategoria.add(j);
            }
        }
        return jogosDaCategoria;
    }
}
