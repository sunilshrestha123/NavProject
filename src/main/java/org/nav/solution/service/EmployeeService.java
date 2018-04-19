package org.nav.solution.service;


import org.nav.solution.model.Employee;

import java.util.List;

public interface EmployeeService {
    void insert(Employee employee);

    List<Employee> listAllEmployee();
    Employee getEmpoyeeById(int employeeId);
    void delete(Employee employee);
}
