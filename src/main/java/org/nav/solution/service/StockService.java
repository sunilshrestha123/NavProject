package org.nav.solution.service;

import org.nav.solution.model.Employee;
import org.nav.solution.model.Stock;

import java.util.List;

public interface StockService {
    void insert(Stock stock);

    List<Stock> listAllStock();

    Stock getStockById(long productId);

    void delete(long productId, Stock stock);

    void update(long productId);
}