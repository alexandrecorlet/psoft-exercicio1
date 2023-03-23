package service;

import java.util.Collection;

import data.Produto;
import repository.ProdutoRepository;

public class ProdutoService {

    private final ProdutoRepository produtoRepository;

    public ProdutoService() {
        this.produtoRepository = new ProdutoRepository();
    }

    public String criarProduto(String nome, String fabricante, double preco) {
        Produto p = new Produto(nome, fabricante, preco);
        return produtoRepository.adicionaProduto(p);
    }

    public String removerProduto(String id) {
        return produtoRepository.removerProduto(id);
    }

    public Produto consultarProduto(String id) {
        return produtoRepository.consultarProduto(id);
    }

    public Collection<Produto> listarProdutos() {
        return produtoRepository.listarProdutos();
    }

}
