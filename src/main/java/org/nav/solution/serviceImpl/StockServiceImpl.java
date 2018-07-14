package org.nav.solution.serviceImpl;

import org.nav.solution.dao.StockDao;
import org.nav.solution.model.Stock;
import org.nav.solution.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class StockServiceImpl implements StockService {
    @Autowired
    private StockDao stockDao;
    public void insert(Stock stock){
        stockDao.insert(stock);


    }
}
