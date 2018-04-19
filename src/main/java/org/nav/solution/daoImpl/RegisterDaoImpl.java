
package org.nav.solution.daoImpl;


import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.nav.solution.dao.RegisterDao;
import org.nav.solution.model.Register;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RegisterDaoImpl implements RegisterDao {
    @Autowired
    private SessionFactory sessionFactory;

    public void insert(Register register) {
        Session session = sessionFactory.openSession();
        session.save(register);
        session.beginTransaction().commit();
        session.close();
    }

    public List<Register> getAllRegister() {
        Session session = sessionFactory.openSession();
        Criteria criteria = session.createCriteria(Register.class);
        criteria.addOrder(Order.asc("registerName"));
        List<Register> registerList = criteria.list();
        session.close();
        return registerList;


    }

    public void delete(Register register) {
        Session session = sessionFactory.openSession();
        session.delete(register);
        session.beginTransaction().commit();
        session.close();

    }

    public Register getRegisterById(int registerId) {
        Session session = sessionFactory.openSession();
        Register register = (Register) session.get(Register.class, registerId);
        session.close();
        return register;
    }


}


