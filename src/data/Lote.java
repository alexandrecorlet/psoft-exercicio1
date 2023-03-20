package data;

import java.util.Date;
import java.util.UUID;

import data.Produto;

public class Lote {

    private Produto produto;

    private int quantidade;

    private final String ID;

    private Date dataDeValidade;

    public Lote(Produto produto, int quantidade, Date dataDeValidade) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.dataDeValidade = dataDeValidade;
        this.ID = UUID.randomUUID().toString();
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String getID() {
        return ID;
    }

    public Date getDataDeValidade() {
        return dataDeValidade;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setDataDeValidade(Date dataDeValidade) {
        this.dataDeValidade = dataDeValidade;
    }

    @Override
    public String toString() {
        return produto.toString() + '\n'
                + "QUANTIDADE: " + quantidade + '\n'
                + "DATA DE VALIDADE: " + dataDeValidade.toString() + '\n'
                + "ID LOTE: " + ID;
    }
}
