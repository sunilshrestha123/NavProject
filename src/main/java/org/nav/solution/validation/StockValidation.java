//package org.nav.solution.validation;
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.stereotype.Component;
//import org.springframework.validation.Errors;
//import org.springframework.validation.Validator;
//@Component
//public class StockValidation implements Validator {
//@Autowired
//@Qualifier()
//
//    @Override
//    public boolean supports(Class<?> aClass) {
//        return false;
//    }
//
//    @Override
//    public void validate(Object o, Errors errors) {
//
//    }
//    @RequestMapping(method = RequestMethod.POST)
//    public String submitForm(@ModelAttribute("employee") EmployeeVO employeeVO,
//                             BindingResult result, SessionStatus status)
//    {
//        //Validation code start
//        boolean error = false;
//
//        System.out.println(employeeVO); //Verifying if information is same as input by user
//
//        if(employeeVO.getFirstName().isEmpty()){
//            result.rejectValue("firstName", "error.firstName");
//            error = true;
//        }
//
//        if(employeeVO.getLastName().isEmpty()){
//            result.rejectValue("lastName", "error.lastName");
//            error = true;
//        }
//
//        if(employeeVO.getEmail().isEmpty()){
//            result.rejectValue("email", "error.email");
//            error = true;
//        }
//
//        if(error) {
//            return "addEmployee";
//        }
//        //validation code ends
//
//        //Store the employee information in database
//        //manager.createNewRecord(employeeVO);
//
//        //Mark Session Complete
//        status.setComplete();
//        return "redirect:addNew/success";
//    }