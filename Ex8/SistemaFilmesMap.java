package Ex8;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SistemaFilmesMap implements SistemaFilmes {
	
private Map<String, Filme> filmes;
	
	public SistemaFilmesMap() {
		this.filmes = new HashMap<String, Filme>();
	}
	
	@Override
	public void cadastraFilme(Filme f) throws FilmeJaExisteException{
		if (this.filmes.containsKey(f.getCodigo())) {
			throw new FilmeJaExisteException("Já existe filme com este código");
		} else {
			this.filmes.put(f.getCodigo(), f);
		}
	}	

	@Override
	public Filme pesquisaFilme(String codigo) throws FilmeNaoExisteException{
		Filme filmeEncontrado = null;

		for(Filme filme:this.filmes.values()){
			if(filme.getCodigo().equals(codigo)) filmeEncontrado = filme;
		}

		if(filmeEncontrado != null){
			return filmeEncontrado;
		}
		
		throw new FilmeNaoExisteException("Não existe esse filme!");
	}

	@Override
	public List<Filme> obterFilmesLancadosEm(int ano){
		List<Filme> filmesEncontrados = new ArrayList<>();
		for(Filme filme:this.filmes.values()){
			if(filme.getAnoLancamento() == ano) filmesEncontrados.add(filme);
		}
		return filmesEncontrados;
	}

	@Override
	public List<Filme> obterFilmesComNome(String nome){
		List<Filme> filmesEncontrados = new ArrayList<>();
		for(Filme filme:this.filmes.values()){
			if(filme.getNome().equals(nome)) filmesEncontrados.add(filme);
		}
		return filmesEncontrados;
	}

	@Override
	public boolean existemFilmesDaCategoria(CategoriaFilme categoria){
		boolean out =  false;
		for(Filme filme:this.filmes.values()){
			out = filme.ehDaCategoria(categoria);
		}
		return out;
	}

	@Override
	public int contaFilmesDaCategoria(CategoriaFilme categoria){
		int numFilmes = 0;
		for(Filme filme:this.filmes.values()){
			if(filme.ehDaCategoria(categoria)) numFilmes++;
		}
		return numFilmes;
	}

}