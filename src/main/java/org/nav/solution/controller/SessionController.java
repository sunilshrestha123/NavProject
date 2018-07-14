package org.nav.solution.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class SessionController {
    @RequestMapping(value ="/session", method = RequestMethod.GET)
    public String returnRegister() {
        return "session";
    }
}
