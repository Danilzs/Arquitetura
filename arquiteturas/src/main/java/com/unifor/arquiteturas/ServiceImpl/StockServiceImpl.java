package com.unifor.arquiteturas.ServiceImpl;

import com.unifor.arquiteturas.Model.Stock;
import com.unifor.arquiteturas.Repository.StockRepository;
import com.unifor.arquiteturas.Services.StockInterface;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockServiceImpl implements StockInterface {

    private final StockRepository stockRepository;

    public StockServiceImpl(StockRepository stockRepository) {
        this.stockRepository = stockRepository;
    }

    @Override
    public Stock createStock(Stock stock) {
        return stockRepository.save(stock);
    }

    @Override
    public List<Stock> getAllStocks() {
        return stockRepository.findAll();
    }

    @Override
    public Stock getStockById(long id) {
        return stockRepository.findById(id).orElse(null);
    }
}
