package com.rewardprogram.rewardsprogram.service;

import com.rewardprogram.rewardsprogram.dto.TotalRewards;
import com.rewardprogram.rewardsprogram.dto.TransactionDto;

import java.text.ParseException;

public interface CustomerRewardService {

    String transaction(TransactionDto transaction);
    String getRewardsBytransactionId(long transactionId);

    TotalRewards getTotalRewardsPointsByDateRange(long customerId, String startDate, String endDate) throws ParseException;

}
