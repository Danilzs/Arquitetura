package com.unifor.arquiteturas.controller;

import com.unifor.arquiteturas.Model.Stock;
import com.unifor.arquiteturas.Services.StockInterface;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("stocks")
public class StockController {

    private final StockInterface stockInterface;

    public StockController(StockInterface stockInterface) {
        this.stockInterface = stockInterface;
    }

    @PostMapping("/create")
    public ResponseEntity<Stock> createStock(@RequestBody Stock stock) {
        return ResponseEntity.ok(stockInterface.createStock(stock));
    }

    @GetMapping("/all")
    public ResponseEntity<List<Stock>> getAllStocks() {
        return ResponseEntity.ok(stockInterface.getAllStocks());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Stock> getStockById(@PathVariable long id) {
        return ResponseEntity.ok(stockInterface.getStockById(id));
    }
}
