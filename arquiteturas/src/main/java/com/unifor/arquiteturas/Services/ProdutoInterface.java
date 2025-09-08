package com.unifor.arquiteturas.Services;

import com.unifor.arquiteturas.Model.Produto;
import java.util.List;

public interface ProdutoInterface {
    Produto createProduto(Produto produto);
    List<Produto> getAllProdutos();
    Produto getProdutoById(long id);
}
