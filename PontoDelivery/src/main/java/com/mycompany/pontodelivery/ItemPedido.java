package com.mycompany.pontodelivery;

public class ItemPedido {
    private int id;
    private Produto produto;
    private int quantidade;
    private double precoUnitario;

    public ItemPedido(int id, Produto produto, int quantidade, double precoUnitario) {
        this.id = id;
        this.produto = produto;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    public int getId() { return id; }
    public Produto getProduto() { return produto; }
    public int getQuantidade() { return quantidade; }
    public double getPrecoUnitario() { return precoUnitario; }
}
