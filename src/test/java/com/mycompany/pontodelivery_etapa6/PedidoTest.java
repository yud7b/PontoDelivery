package com.mycompany.pontodelivery_etapa6;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.mycompany.pontodelivery_etapa6.model.*;

import java.util.ArrayList;
import java.util.List;

public class PedidoTest {

    @Test
    public void testCalcularTotalPedido() {

        Produto produto = new Produto("Pizza", 50.0, 10);
        ItemPedido item = new ItemPedido(1, produto, 2, produto.getPreco());

        List<ItemPedido> itens = new ArrayList<>();
        itens.add(item);

        Pedido pedido = new Pedido(
                1,
                "Cliente Teste",
                new java.util.Date(),
                "ABERTO",
                null,
                itens
        );

        double totalEsperado = 100.0;
        double totalCalculado = pedido.calcularTotal();

        assertEquals(totalEsperado, totalCalculado);
    }
}
