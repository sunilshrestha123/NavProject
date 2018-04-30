package org.nav.solution.controller;

import org.nav.solution.model.Employee;
import org.nav.solution.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @RequestMapping(value="/employee",method = RequestMethod.GET)
        public String returnEmployee(){
            return "employee";

    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String returnHello() {
        return "hello";
    }
    @RequestMapping(value="/employee",method = RequestMethod.POST)
    public String save(@RequestParam("employeeFname") String employeeFname,
                       @RequestParam("employeeLname")String employeeLname,
                        @RequestParam("employeeBdate")String employeeBdate,
                        @RequestParam("employeeGender")String employeeGender,
                       @RequestParam("emplyeeEmail") String employeeEmail,
                        @RequestParam("employeePhone")int employeePhone,
                       @RequestParam("employeeMobile")int employeeMobile,
                       @RequestParam("employeeTitle")String employeeTitle,
                       @RequestParam("employeeCountry")String employeeCountry,
                       @RequestParam("employeeAddress")String employeeAddress,
                       @RequestParam("employeeRegion")String employeeRegion,
                       @RequestParam("employeeCity")String employeeCity,
                        @RequestParam("employeePostal")String empoyeePostal,
                       @RequestParam("em[ployeeAbout")String employeeAbout,
                        @RequestParam("employeeHierdate")String employeeHierdate,
                       @RequestParam("employeePhoto")byte employeePhoto,
                       @RequestParam("employeeSalary") int employeeSalary){


                       Employee employee=new Employee();
                        employee.setEmployeeFname(employeeFname);
                        employee.setEmployeeLname(employeeLname);
                        employee.setEmployeeBdate(employeeBdate);
                        employee.setEmployeeGender(employeeGender);
                        employee.setEmployeeEmail(employeeEmail);
                        employee.setEmployeePhone(employeePhone);
                        employee.setEmployeeMobile(employeeMobile);
                        employee.setEmployeeTitle(employeeTitle);
                        employee.setEmployeeCountry(employeeCountry);
                      //  employee.setEmployeeAddress(employeeAddress);
                        //employee.setEmployeeRegion(employeeRegion);
                        employee.setEmployeeCity(employeeCity);
                        employee.setEmployeePostal(empoyeePostal);
                        employee.setEmployeeHiredate(employeeHierdate);
                        employee.setEmployeePhone(employeePhoto);
                      //  employee.setEmployeeSalary(employeeSalary);
                        employeeService.insert(employee);
        return "redirect:/displayemployee";
}




}
