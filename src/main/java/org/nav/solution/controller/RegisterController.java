  package org.nav.solution.controller;

import org.nav.solution.model.Register;
import org.nav.solution.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

  @Controller
@SessionAttributes
public class RegisterController {
    @Autowired
    private RegisterService registerService;

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String returnRegister() {
        return "register";

    }

    @RequestMapping(value = "/displayregister")
    public String returnRegister(Model model) {
        model.addAttribute("registerList", registerService.listAllRegister());
        return "displayregister";

    }


    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(@RequestParam("registerName") String registerName,
                       @RequestParam("registerEmail") String registerEmail,
                       @RequestParam("registerPassword") String registerPassword,
                       @RequestParam("reRegisterPassword") String reRegisterPassword

    )  {
        Register register = new Register();

            String pass = PasswordEncription.encryptPassword(registerPassword);
            register.setRegisterName(registerName);
            register.setRegisterEmail(registerEmail);
            register.setRegisterPassword(pass);
            registerService.insert(register);
            return "redirect:/displayregister";
        }



@RequestMapping(value="/editregister/{id}",method = RequestMethod.GET)
    public String edit(@PathVariable int id,Model model) {
 Register register=registerService.getRegisterById(id);
 model.addAttribute("register",register);
        return "editregister1";

    }


@RequestMapping(value = "/deleteregister/{id}",method=RequestMethod.GET)
    public String delete(@PathVariable("id") int registerId){
        Register register=new Register();
        register.setRegisterId(registerId);
        registerService.delete(register);
        return "redirect:/displayregister";

}

}





