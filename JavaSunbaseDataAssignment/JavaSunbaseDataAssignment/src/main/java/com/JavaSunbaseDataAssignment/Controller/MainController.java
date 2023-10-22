package com.JavaSunbaseDataAssignment.Controller;

import com.JavaSunbaseDataAssignment.Model.CustomerDetailsClass;
import com.JavaSunbaseDataAssignment.Repository.CustomerRepository;
import com.JavaSunbaseDataAssignment.Services.CustomerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class MainController {
    @Autowired
    private CustomerServices customerServices;
    @Autowired
    private CustomerRepository customerRepository;
    @RequestMapping(value = "/savecustormer", method = RequestMethod.POST)
    public CustomerDetailsClass customerDetails(@ModelAttribute CustomerDetailsClass customerDetailsClass){
        return customerServices.saveCustomer(customerDetailsClass);
    }
    @RequestMapping(value = "/getallcustomer",method = RequestMethod.GET)
    public String listoftodos(ModelMap model){
        List<CustomerDetailsClass> customer= customerRepository.findAll();
        model.addAttribute("allcustomer",customer);
        return "ListofallCustomer";
    }
}
