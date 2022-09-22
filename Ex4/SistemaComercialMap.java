package Ex4;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class SistemaComercialMap {
    public Map<String, Cliente> clientes;
    public Map<String, Produto> produtos;

    public boolean existeCliente(Cliente cliente){
        return clientes.containsValue(cliente);
    }

    public Cliente pesquisaCliente(String id) throws ClienteNaoExisteException{
        if(this.clientes.containsKey(id)) return this.clientes.get(id);
        throw new ClienteNaoExisteException("Não existe");
    }

    public List<Produto> pesquisaProdutosDaCategoria(CategoriaProduto categoria){
        ArrayList <Produto> produtosEncontrados = new ArrayList<>();
        for(Produto produto: produtos.values()){

        }
        return produtosEncontrados;
    }
}
