package com.mycompany.pontodelivery_etapa6.repository;

import com.mycompany.pontodelivery_etapa6.model.Produto;

public class ProdutoRepository {

    public void salvar(Produto produto) {
        System.out.println("Produto salvo no banco de dados (simulado): " + produto.getNome());
    }
}
