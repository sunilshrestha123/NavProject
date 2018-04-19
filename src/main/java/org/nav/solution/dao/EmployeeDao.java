package org.nav.solution.dao;


import org.nav.solution.model.Employee;

import java.util.List;

public interface EmployeeDao {
void insert(Employee employee);
List<Employee> getAllEmployee();
void delete(Employee employee);
 Employee getEmployeeById(int employeeId);

}
