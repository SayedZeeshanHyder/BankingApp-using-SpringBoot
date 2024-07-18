package com.BankingApp.BankingApp.services;

import com.BankingApp.BankingApp.model.TransactionModel;
import com.BankingApp.BankingApp.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class TransactionServices {

    @Autowired
    private TransactionRepository transactionRepository;

    @Autowired
    private AccountServices accountServices;

    public TransactionModel createTransaction(TransactionModel newTransaction){
        newTransaction.setTransactionTime(LocalDateTime.now());
        accountServices.addTransactionsToUsers(newTransaction);
        return transactionRepository.save(newTransaction);
    }

}
