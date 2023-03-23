package fachada;

import java.util.Date;
import java.util.Collection;

import service.LoteService;
import service.ProdutoService;
import data.Produto;
import data.Lote;

public class Fachada {

    private final LoteService loteService;

    private final ProdutoService produtoService;

    public Fachada() {
        this.loteService = new LoteService();
        this.produtoService = new ProdutoService();
    }

    public String adicionarProduto(String nome, String fabricante, double preco) {
       return produtoService.criarProduto(nome, fabricante, preco);
    }

    public String removerProduto(String id) {
        return produtoService.removerProduto(id);
    }

    public Produto consultarProduto(String id) {
        return produtoService.consultarProduto(id);
    }

    public Collection<Produto> listarProdutos() {
        return produtoService.listarProdutos();
    }

    public String adicionarLote(Produto p, int quantidade, Date dataDeValidade) {
        return loteService.criarLote(p, quantidade, dataDeValidade);
    }

    public String removerLote(String id) {
        return loteService.removerLote(id);
    }

    public Lote consultarLote(String id) {
        return loteService.consultarLote(id);
    }

    public Collection<Lote> listarLotes() {
        return loteService.listarLotes();
    }

}
