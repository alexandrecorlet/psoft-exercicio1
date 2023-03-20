package fachada;

import java.util.Date;

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

    public Produto consultarProduto(String id) {
        return produtoService.consultarProduto(id);
    }

    public void listarProdutos() {

        for (Produto p : produtoService.listarProdutos()) {
            System.out.println(p.toString());
            System.out.println();
        }

    }

    public String adicionarLote(Produto p, int quantidade, Date dataDeValidade) {
        return loteService.criarLote(p, quantidade, dataDeValidade);
    }

    public Lote consultarLote(String id) {
        return loteService.consultarLote(id);
    }

    public void listarLotes() {

        for (Lote l : loteService.listarLotes()) {
            System.out.println(l.toString());
            System.out.println();
        }

    }

}
