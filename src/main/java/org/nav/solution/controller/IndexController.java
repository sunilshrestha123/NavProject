package org.nav.solution.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {
    @GetMapping("/login") //@RequestMapping(value="/login",method=RequestMethod.GET)
    public String login(){
        return "login";
    }


    @RequestMapping(value = {"/index","/"}, method = RequestMethod.GET)
    public String returnIndex() {
        return "index";
    }



    @RequestMapping(value = "/index2",method = RequestMethod.GET)
    public String returnIndex2(){
        return "index2"; }
    @RequestMapping(value = "/display", method = RequestMethod.GET)
    public String returnDisplay() {
        return "display";
    }

    @RequestMapping(value = "/model", method = RequestMethod.GET)
    public String returnModel() {
        return "model";
    }
}
