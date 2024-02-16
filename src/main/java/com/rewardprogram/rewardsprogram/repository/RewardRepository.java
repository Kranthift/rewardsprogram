package com.rewardprogram.rewardsprogram.repository;

import com.rewardprogram.rewardsprogram.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface RewardRepository extends JpaRepository<Transaction, Long> {

    List<Transaction> findByCustomerIdAndTransactionDateGreaterThanEqual(long customerId, Date date);
    List<Transaction> findByCustomerIdAndTransactionDateBetween(long customerId, Date startDate, Date endDate);

}
