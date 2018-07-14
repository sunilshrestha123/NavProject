package org.nav.solution.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class EmailController {
    @RequestMapping(value = "/email",method = RequestMethod.GET)
    public String returnemail(){
        return"email";

    }
@RequestMapping(value = "/compose",method = RequestMethod.GET)
    public String returnComposeemail(){
        return"compose";

}
@RequestMapping(value = "/read",method = RequestMethod.GET)
    public String returnRead(){

        return "read";
}
}