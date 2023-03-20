package data;

import java.util.UUID;

public class Produto {

    private String nome;

    private String fabricante;

    private final String ID;

    private double preco;

    public Produto(String nome, String fabricante, double preco) {
        this.nome = nome;
        this.fabricante = fabricante;
        this.preco = preco;
        this.ID = UUID.randomUUID().toString();
    }

    public String getNome() {
        return nome;
    }

    public String getFabricante() {
        return fabricante;
    }

    public double getPreco() {
        return preco;
    }

    public String getID() {
        return ID;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "PRODUTO: " + nome + '\n'
                + "ID: " + ID + '\n'
                + "FABRICANTE: " + fabricante + '\n'
                + "PRECO: " + preco;
    }

}
