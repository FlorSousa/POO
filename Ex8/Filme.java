package Ex8;
import java.util.ArrayList;
import java.util.List;

public class Filme {
	private String codigo;
	private String nome;
	private int anoLancamento;
	private int duracaoEmMinutos;
	private List<CategoriaFilme> categorias;
	
	public Filme(String codigo) {
		this(codigo,"",0,0, new ArrayList<>());
	}
	
	public Filme(String codigo,String nome, int anoLancamento, int duracaoEmMinutos, 
			List<CategoriaFilme> categorias) {
		this.codigo = codigo;
		this.nome = nome;
		this.anoLancamento = anoLancamento;
		this.duracaoEmMinutos = duracaoEmMinutos;
		this.categorias = categorias;
	}
	
	public boolean ehDaCategoria(CategoriaFilme categoria) {
		for (CategoriaFilme cat: this.categorias) {
			if (cat ==categoria) {
				return true;
			}
		}
		return false;
	}
	
	public String getCodigo(){
		return this.codigo;
	}

	public int getAnoLancamento(){
		return this.anoLancamento;
	}

	public String getNome(){
		return this.nome;
	}
}
