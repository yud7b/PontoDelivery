package com.mycompany.pontodelivery_etapa6.app;

import com.mycompany.pontodelivery_etapa6.model.*;
import com.mycompany.pontodelivery_etapa6.service.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Criando usuário
        Usuario usuario = new Usuario(1, "Yudi", "yudi", "123", "ADMIN");

        // Criando produto
        Produto produto = new Produto("Pizza", 50.0, 10);

        // Criando item do pedido
        ItemPedido item = new ItemPedido(1, produto, 2, produto.getPreco());
        List<ItemPedido> itens = new ArrayList<>();
        itens.add(item);

        // Criando pedido
        Pedido pedido = new Pedido(
                1001,
                "Cliente Teste",
                new Date(),
                "ABERTO",
                usuario,
                itens
        );

        // Usando services
        ProdutoService produtoService = new ProdutoService();
        PedidoService pedidoService = new PedidoService();

        produtoService.cadastrarProduto(produto);
        pedidoService.finalizarPedido(pedido);

        System.out.println("Teste da aplicação finalizado com sucesso.");
    }
}
