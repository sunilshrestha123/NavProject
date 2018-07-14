package org.nav.solution.controller;

import org.nav.solution.model.Department;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DepartmentController {
    @RequestMapping(value = "/department",method = RequestMethod.GET)
    public String returnDepartment(){
        return "department";


    }
    @RequestMapping(value="saveDepartment",method = RequestMethod.POST)
    public String save(@RequestParam("departmentName")String departmentName,
                       @RequestParam("departmemtLocation")String departmentLocation) {

        Department department = new Department();
      //  department.setDepartmentName(departmentName);
      //  department.setDepartmentLocation(departmentLocation);
        //   departmentService.insert(department);
        return "redirect:/displayDepartment";


    }
}
