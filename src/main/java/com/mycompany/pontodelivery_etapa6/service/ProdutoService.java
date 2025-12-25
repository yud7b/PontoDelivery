package com.mycompany.pontodelivery_etapa6.service;

import com.mycompany.pontodelivery_etapa6.model.Produto;

public class ProdutoService {

    public void cadastrarProduto(Produto produto) {
        if (produto == null) {
            throw new IllegalArgumentException("Produto inválido");
        }
        if (produto.getPreco() <= 0) {
            throw new IllegalArgumentException("Preço do produto deve ser maior que zero");
        }
        System.out.println("Produto cadastrado: " + produto.getNome());
    }

    public void atualizarEstoque(Produto produto, int quantidade) {
        System.out.println("Estoque atualizado para o produto: " + produto.getNome());
    }
}
