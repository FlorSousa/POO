/*
package Ex8;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class SistemaFilmesMapTest {

	@Test
	void testaCadastroEPesquisa() {
		SistemaFilmesMap sistema = new SistemaFilmesMap();
		List<CategoriaFilme> categorias = new ArrayList<>();
		categorias.add(CategoriaFilme.ACAO);
		try {
			sistema.cadastraFilme(new Filme("001","Matrix",1999,136,categorias));
			Filme f = sistema.pesquisaFilme("001");
			assertEquals("Matrix", f.getNome());
		} catch (FilmeJaExisteException | FilmeNaoExisteException e) {
			fail("Não deveria lançar exceção ao cadastrar e pesquisar depois");
		}
	}
}
*/
