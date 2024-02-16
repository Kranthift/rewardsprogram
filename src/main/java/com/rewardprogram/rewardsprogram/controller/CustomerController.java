package com.rewardprogram.rewardsprogram.controller;

import com.rewardprogram.rewardsprogram.entity.Customer;
import com.rewardprogram.rewardsprogram.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;
    @PostMapping("/customerRegistration")
    public String customerRegistration(@RequestBody Customer customer){
        return customerService.save(customer);
    }
}
