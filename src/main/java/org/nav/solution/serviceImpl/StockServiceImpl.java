package org.nav.solution.serviceImpl;

import org.nav.solution.dao.StockDao;
import org.nav.solution.model.Stock;
import org.nav.solution.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class StockServiceImpl implements StockService {
    @Autowired
    private StockDao stockDao;
    public void insert(Stock stock){
        stockDao.insert(stock);


    }

    @Override
    public List<Stock>listAllStock() {
        return stockDao.getAllStock();
    }

    @Override
    public Stock  getStockById(long productId) {
        return stockDao.getStockById(productId);

    }

    @Override
    public void delete(long productId, Stock stock) {
        stockDao.delete(productId,stock);
    }

    @Override
    public void update(long productId) {
stockDao.update(productId);
    }


}


