package com.rewardprogram.rewardsprogram.repository;

import com.rewardprogram.rewardsprogram.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
