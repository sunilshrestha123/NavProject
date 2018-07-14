package org.nav.solution.daoImpl;


import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.nav.solution.dao.EmployeeDao;
import org.nav.solution.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmpoyeeDaoImpl implements EmployeeDao {
@Autowired
private SessionFactory sessionFactory;

    public void insert(Employee employee) {
        Session session=sessionFactory.openSession();
        session.save(employee);
        session.beginTransaction().commit();
        session.close();
    }

    public List<Employee> getAllEmployee() {
        Session session=sessionFactory.openSession();
        Criteria criteria=session.createCriteria(Employee.class);
        List<Employee>employeeList=criteria.list();
        session.close();
        return  employeeList;
    }

    public void delete(Employee employee) {
Session session=sessionFactory.openSession();
session.delete(employee);
session.beginTransaction().commit();;
session.close();
    }

    public Employee getEmployeeById(int employeeId) {
        Session session = sessionFactory.openSession();
        Employee employee= (Employee) session.get(Employee.class, employeeId);
        session.close();
        return employee;

    }
}

