package com.JavaSunbaseDataAssignment.Services;

import com.JavaSunbaseDataAssignment.Model.CustomerDetailsClass;
import com.JavaSunbaseDataAssignment.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServices {

    @Autowired
    private CustomerRepository customerRepository;



    public CustomerDetailsClass saveCustomer(CustomerDetailsClass customerDetailsClass) {
       return customerRepository.save(customerDetailsClass);
    }
}
