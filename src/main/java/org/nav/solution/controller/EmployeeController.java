package org.nav.solution.controller;

import org.nav.solution.model.Employee;
import org.nav.solution.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;

@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @RequestMapping(value="/employee",method = RequestMethod.GET)
        public String returnEmployee(){
            return "employee";

    }
    @RequestMapping(value="/displayemployee")
    public String returnDisplayemployee(Model model){
        model.addAttribute("employeeList",employeeService.listAllEmployee());
        return "displayemployee";
    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String returnHello() {
        return "hello";
    }

    @RequestMapping(value="/saveemployee",method = RequestMethod.POST)
    public String save(@Valid@ModelAttribute("employee")
            @RequestParam("employeeFname") String employeeFname,
                       @RequestParam("employeeLname")String employeeLname,
                        @RequestParam("employeeBdate")String employeeBdate,
                        @RequestParam("employeeGender")String employeeGender,
                       @RequestParam("employeeEmail") String employeeEmail,
                      // int result = Integer.parseInt(number);
                        @RequestParam("employeePhone")String employeePhone,
                       @RequestParam("employeeMobile")String employeeMobile,
                       @RequestParam("employeeTitle")String employeeTitle,
                       @RequestParam("employeeCountry")String employeeCountry,
                       @RequestParam("employeeState")String employeeState,
                        @RequestParam("employeeCity")String employeeCity,
                        @RequestParam("employeeStreet")String employeeStreet,
                        @RequestParam("employeePostal")String empoyeePostal,
                       @RequestParam("employeeTempCountry")String employeeTempCountry,
                       @RequestParam("employeeTempState")String employeeTempState,
                       @RequestParam("employeeTempCity")String employeeTempCity,
                       @RequestParam("employeeTempStreet")String employeeTempStreet,
                       @RequestParam("employeeTempPostal")String employeeTempPostal,

                       @RequestParam("employeeAbout")String employeeAbout,
                        @RequestParam("employeeHiredate")String employeeHiredate,
                       @RequestParam("employeePhoto")byte[] employeePhoto,
                       @RequestParam("employeeDocument")byte[] employeeDocument
                       ){


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
                        employee.setEmployeeState(employeeState);
                        employee.setEmployeeCity(employeeCity);
                        employee.setEmployeeStreet(employeeStreet);
                        employee.setEmployeePostal(empoyeePostal);
                        employee.setEmployeeTempCountry(employeeTempCountry);
                        employee.setEmployeeTempState(employeeTempState);
                        employee.setEmployeeTempCity(employeeTempCity);
                        employee.setEmployeeTempStreet(employeeTempStreet);
                        employee.setEmployeeTempPostal(employeeTempPostal);
                         employee.setEmployeeAbout(employeeAbout);
                        employee.setEmployeePhoto(employeePhoto);
                        employee.setEmployeeHiredate(employeeHiredate);
                        employee.setEmployeeDocument(employeeDocument);


    //  if (employee.hasErrors()) {
     //      return "addEmployee";
                      //  employee.setEmployeeSalary(employeeSalary);
                        employeeService.insert(employee);
        return "redirect:/employee";
}




}
