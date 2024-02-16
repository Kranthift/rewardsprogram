package com.rewardprogram.rewardsprogram.service.impl;

import com.rewardprogram.rewardsprogram.entity.Customer;
import com.rewardprogram.rewardsprogram.repository.CustomerRepository;
import com.rewardprogram.rewardsprogram.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public String save(Customer customer){
        Customer customerDetails = customerRepository.save(customer);
        return "The Customer Id is : "+customerDetails.getCustomerId();
    }
}
