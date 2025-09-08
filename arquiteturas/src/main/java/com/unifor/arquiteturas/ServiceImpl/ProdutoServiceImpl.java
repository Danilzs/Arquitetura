package com.unifor.arquiteturas.ServiceImpl;

import com.unifor.arquiteturas.Model.Produto;
import com.unifor.arquiteturas.Repository.ProdutoRepository;
import com.unifor.arquiteturas.Services.ProdutoInterface;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoServiceImpl implements ProdutoInterface {

    private final ProdutoRepository produtoRepository;

    public ProdutoServiceImpl(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @Override
    public Produto createProduto(Produto produto) {
        return produtoRepository.save(produto);
    }

    @Override
    public List<Produto> getAllProdutos() {
        return produtoRepository.findAll();
    }

    @Override
    public Produto getProdutoById(long id) {
        return produtoRepository.findById(id).orElse(null);
    }
}
