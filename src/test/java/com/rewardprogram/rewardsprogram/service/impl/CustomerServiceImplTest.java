package com.rewardprogram.rewardsprogram.service.impl;

import com.rewardprogram.rewardsprogram.entity.Customer;
import com.rewardprogram.rewardsprogram.repository.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

@ExtendWith(SpringExtension.class)
public class CustomerServiceImplTest {

    @InjectMocks
    private CustomerServiceImpl customerServiceImpl;
    @Mock
    private CustomerRepository customerRepository;

    @Test
    public void save() {
        when(customerRepository.save(Mockito.any())).thenReturn(getCustomerDetails());
        assertNotNull(customerServiceImpl.save(getCustomerDetails()));
    }

    private Customer getCustomerDetails() {

        Customer customerDetails = new Customer();
        customerDetails.setCustomerId(1L);
        customerDetails.setEmailId("customerDetailsEmail@gmail.com");
        customerDetails.setFirstName("test-01");
        customerDetails.setLastName("test-02");
        customerDetails.setUserName("tester");
        customerDetails.setMobileNumber("2203304400");
        return customerDetails;
    }
}
