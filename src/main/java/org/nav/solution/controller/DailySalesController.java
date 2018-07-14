package org.nav.solution.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DailySalesController {
@RequestMapping(value = "/dailySales",method = RequestMethod.GET)
    public String returnDailySales(){
    return "dailysales";

}


}
