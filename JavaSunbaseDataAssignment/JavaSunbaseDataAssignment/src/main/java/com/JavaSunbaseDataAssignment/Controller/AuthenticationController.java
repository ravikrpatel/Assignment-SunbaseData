package com.JavaSunbaseDataAssignment.Controller;

import com.JavaSunbaseDataAssignment.Services.AuthenticationServices;
import com.JavaSunbaseDataAssignment.Services.CustomerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AuthenticationController {
    @Autowired
    private AuthenticationServices authenticationServices;
    @Autowired
    private CustomerServices customerServices;

    @RequestMapping(value = "login",method = RequestMethod.GET)
    public String login(){
        return "loginpage";
    }
    @RequestMapping(value = "newcustomerpage",method = RequestMethod.POST)
    public String createNewCustomer(@RequestParam String loginId, @RequestParam String psw){
        if(authenticationServices.authenticate(loginId,psw)){
            return "newcustomerpage";
        }
        return "loginpage";
    }





}
