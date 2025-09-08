package com.unifor.arquiteturas.controller;

import com.unifor.arquiteturas.Model.Produto;
import com.unifor.arquiteturas.Services.ProdutoInterface;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("produtos")
public class ProdutoController {

    private final ProdutoInterface produtoInterface;

    public ProdutoController(ProdutoInterface produtoInterface) {
        this.produtoInterface = produtoInterface;
    }

    @PostMapping("/create")
    public ResponseEntity<Produto> createProduto(@RequestBody Produto produto) {
        return ResponseEntity.ok(produtoInterface.createProduto(produto));
    }

    @GetMapping("/all")
    public ResponseEntity<List<Produto>> getAllProdutos() {
        return ResponseEntity.ok(produtoInterface.getAllProdutos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Produto> getProdutoById(@PathVariable long id) {
        return ResponseEntity.ok(produtoInterface.getProdutoById(id));
    }
}
