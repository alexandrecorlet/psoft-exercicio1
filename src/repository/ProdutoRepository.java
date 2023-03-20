package repository;

import java.util.Map;
import java.util.HashMap;
import java.util.Collection;

import data.Produto;

public class ProdutoRepository {

    Map<String, Produto> produtos;

    public ProdutoRepository() {
        this.produtos = new HashMap<>();
    }

    public String adicionaProduto(Produto p) {
        String id = p.getID();
        produtos.put(id, p);
        return id;
    }

    public Produto consultarProduto(String id) {
        return produtos.get(id);
    }

    public Collection<Produto> listarProdutos() {
        return produtos.values();
    }

}
