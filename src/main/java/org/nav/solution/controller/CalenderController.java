package org.nav.solution.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class CalenderController {
    @RequestMapping(value="/calender",method= RequestMethod.GET)
    public String returnCalender(){
        return "calender";
    }
}
