package com.rewardprogram.rewardsprogram.controller;

import com.rewardprogram.rewardsprogram.dto.TotalRewards;
import com.rewardprogram.rewardsprogram.dto.TransactionDto;
import com.rewardprogram.rewardsprogram.service.CustomerRewardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;

@RestController
public class CustomerRewardsController {

    @Autowired
    CustomerRewardService customerRewardService;
    @PostMapping("/transaction")
    public String transaction(@RequestBody TransactionDto transaction){
        return customerRewardService.transaction(transaction);
    }
    @GetMapping("/reward_points/{transactionId}")
    public String getRewardsBytransactionId(@PathVariable long transactionId) {
        return customerRewardService.getRewardsBytransactionId(transactionId);
    }
    @GetMapping("/total_reward_points/{customerId}")
    public TotalRewards getTotalRewardsPointsByDateRange(@PathVariable long customerId, @RequestHeader(required = false) String startDate, @RequestHeader(required = false) String endDate) throws ParseException {
        return customerRewardService.getTotalRewardsPointsByDateRange(customerId,startDate,endDate);
    }
}
