package org.nav.solution.daoImpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.nav.solution.dao.ShipperDao;
import org.nav.solution.model.Shipper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ShipperDaoImpl implements ShipperDao {
    @Autowired
    private SessionFactory sessionFactory;

    public void insert(Shipper shipper) {
        Session session = sessionFactory.openSession();
        session.save(shipper);
        session.beginTransaction().commit();
        session.close();
    }
}
