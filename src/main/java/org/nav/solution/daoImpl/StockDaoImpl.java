package org.nav.solution.daoImpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.nav.solution.dao.StockDao;
import org.nav.solution.model.Stock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
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



        }
