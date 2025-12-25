package com.mycompany.pontodelivery_etapa6.model;

import java.util.Date;
import java.util.List;

public class Pedido {

    private int id;
    private String cliente;
    private Date data;
    private String status;
    private Usuario usuario;
    private List<ItemPedido> itens;

    public Pedido(int id, String cliente, Date data, String status,
            Usuario usuario, List<ItemPedido> itens) {
        this.id = id;
        this.cliente = cliente;
        this.data = data;
        this.status = status;
        this.usuario = usuario;
        this.itens = itens;
    }

    public int getId() {
        return id;
    }

    public String getCliente() {
        return cliente;
    }

    public Date getData() {
        return data;
    }

    public String getStatus() {
        return status;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }

    public double calcularTotal() {
        return itens.stream()
                .mapToDouble(ItemPedido::getSubtotal)
                .sum();
    }
}
