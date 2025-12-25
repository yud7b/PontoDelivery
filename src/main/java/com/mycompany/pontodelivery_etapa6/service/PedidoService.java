package com.mycompany.pontodelivery_etapa6.service;

import com.mycompany.pontodelivery_etapa6.model.Pedido;

public class PedidoService {

    public double calcularTotalPedido(Pedido pedido) {
        if (pedido == null) {
            throw new IllegalArgumentException("Pedido inválido");
        }
        return pedido.calcularTotal();
    }

    public void finalizarPedido(Pedido pedido) {
        double total = calcularTotalPedido(pedido);
        System.out.println("Pedido finalizado. Total: R$ " + total);
    }
}
