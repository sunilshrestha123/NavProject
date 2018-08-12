package org.nav.solution.dao;

import org.nav.solution.model.Employee;
import org.nav.solution.model.Stock;

import java.util.List;

public interface StockDao {
    void insert(Stock stock);
    Stock getStockById(long productId);
     List<Stock>getAllStock();
    void delete(long productId,Stock stock);
    void update(long productId);


}
