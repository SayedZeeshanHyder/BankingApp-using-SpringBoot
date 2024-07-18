package com.BankingApp.BankingApp.controller;

import com.BankingApp.BankingApp.model.TransactionModel;
import com.BankingApp.BankingApp.services.TransactionServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/transactions")
public class TransactionController {

    @Autowired
    private TransactionServices transactionServices;

    @PostMapping("/transact")
    public ResponseEntity<TransactionModel> transact(@RequestBody TransactionModel newTransaction){
        return new ResponseEntity<>(transactionServices.createTransaction(newTransaction), HttpStatus.CREATED);
    }
}
