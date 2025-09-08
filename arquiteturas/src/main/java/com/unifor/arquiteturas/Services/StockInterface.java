package com.unifor.arquiteturas.Services;

import com.unifor.arquiteturas.Model.Stock;
import java.util.List;

public interface StockInterface {
    Stock createStock(Stock stock);
    List<Stock> getAllStocks();
    Stock getStockById(long id);
}
