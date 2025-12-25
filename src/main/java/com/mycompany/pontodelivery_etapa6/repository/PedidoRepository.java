package com.mycompany.pontodelivery_etapa6.repository;

import com.mycompany.pontodelivery_etapa6.model.Pedido;

public class PedidoRepository {

    public void salvar(Pedido pedido) {
        System.out.println("Pedido salvo no banco de dados (simulado). ID: " + pedido.getId());
    }
}
