package com.mycompany.pontodelivery;

import java.util.Date;
import java.util.List;

public class Pedido {
    private int id;
    private String cliente;
    private Date data;
    private String status;
    private double total;
    private Usuario usuario;
    private List<ItemPedido> itens;

    public Pedido(int id, String cliente, Date data, String status, double total, Usuario usuario, List<ItemPedido> itens) {
        this.id = id;
        this.cliente = cliente;
        this.data = data;
        this.status = status;
        this.total = total;
        this.usuario = usuario;
        this.itens = itens;
    }

    public int getId() { return id; }
    public String getCliente() { return cliente; }
    public Date getData() { return data; }
    public String getStatus() { return status; }
    public double getTotal() { return total; }
    public Usuario getUsuario() { return usuario; }
    public List<ItemPedido> getItens() { return itens; }
}
