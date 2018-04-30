package org.nav.solution.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DepartmentController {
    @RequestMapping(value = "/department",method = RequestMethod.GET)
    public String returnDepartment(){
        return "department";


    }
}
