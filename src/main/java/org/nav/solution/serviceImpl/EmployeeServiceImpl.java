package org.nav.solution.serviceImpl;


import org.nav.solution.dao.EmployeeDao;
import org.nav.solution.model.Employee;
import org.nav.solution.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
@Autowired
private EmployeeDao employeeDao;

    public void insert(Employee employee) {
        employeeDao.insert(employee);
    }

    public List<Employee> listAllEmployee() {
       return employeeDao.getAllEmployee();
    }


    public Employee getEmpoyeeById(int employeeId) {
        return employeeDao.getEmployeeById(employeeId);


    }
    public void delete(Employee employee){
        employeeDao.delete(employee);

    }
}

