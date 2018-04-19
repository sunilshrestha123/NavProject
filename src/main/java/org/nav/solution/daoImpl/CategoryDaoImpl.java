package org.nav.solution.daoImpl;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.nav.solution.dao.CategoryDao;
import org.nav.solution.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CategoryDaoImpl implements CategoryDao {
    @Autowired
    private SessionFactory sessionFactory;
    public void insert(Category category) {
        Session session= sessionFactory.openSession();
        session.save(category);
        session.beginTransaction().commit();
        session.close();

    }
    public List<Category> getAllCategory(){
        Session session=sessionFactory.openSession();
        Criteria criteria=session.createCriteria(Category.class);
        criteria.addOrder(Order.asc("categoryName"));
        List<Category>categoryList=criteria.list();
        session.close();
        return categoryList;

    }
    public void delete(Category category) {
        Session session=sessionFactory.openSession();
        session.delete(category);
        session.beginTransaction().commit();
        session.close();

    }
}
