package org.nav.solution.daoImpl;

import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.nav.solution.dao.StockDao;
import org.nav.solution.model.Stock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class StockDaoImpl implements StockDao{
      @Autowired
      private SessionFactory sessionFactory;
      public  void insert(Stock stock){
              Session session=sessionFactory.openSession();
              session.save(stock);
              session.beginTransaction().commit();
              session.close();

      }

    @Override
    public Stock getStockById(long productId) {
Session session=sessionFactory.openSession();
Stock stock=(Stock) session.get(Stock.class,productId);
session.beginTransaction().commit();
session.close();
return stock;


    }

    @Override
    public List<Stock> getAllStock() {
        Session session=sessionFactory.openSession();
        Criteria criteria=session.createCriteria(Stock.class);
        criteria.addOrder(Order.asc("productName"));
        List<Stock>stocksList=criteria.list();
        session.close();
        return stocksList;
    }


    @Override
    public void delete(long productId, Stock stock) {
        Session session=sessionFactory.getCurrentSession();
    //    Stock stock= (Stock) session.byId(Stock.class).load(productId);
        session.delete(stock);
        session.beginTransaction().commit();
        session.close();
      }

    @Override
    public void update(long productId) {
          Session session=sessionFactory.getCurrentSession();
      //  session.update(stock);
        session.beginTransaction().commit();
        session.flush();



      }


}
