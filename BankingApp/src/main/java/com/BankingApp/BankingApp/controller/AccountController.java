package com.BankingApp.BankingApp.controller;
import com.BankingApp.BankingApp.model.AccountModel;
import com.BankingApp.BankingApp.services.AccountServices;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/accounts")
@RestController
public class AccountController {

    @Autowired
    private AccountServices accountServices;

    @GetMapping("/allAccounts")
    public ResponseEntity<List<AccountModel>> getAllAccount(){
        List<AccountModel> allAccounts = accountServices.getAllAccounts();
        return new ResponseEntity<>(allAccounts, HttpStatus.FOUND);
    }

    @GetMapping("/{id}")
    public ResponseEntity<AccountModel> getAccountByID(@PathVariable ObjectId id){
        AccountModel account = accountServices.getAccountById(id);
        return new ResponseEntity<>(account,HttpStatus.FOUND);
    }

    @PostMapping("/create")
    public ResponseEntity<AccountModel> createNewAccount(@RequestBody AccountModel newAccount){
        return new ResponseEntity<>(accountServices.createNewUser(newAccount),HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteUserById(@PathVariable ObjectId id){
        accountServices.deleteAccountById(id);
        return new ResponseEntity<>("User Deleted Successfully",HttpStatus.GONE);
    }

    @PostMapping("/withdraw/{id}")
    public ResponseEntity<String> withdraw(@PathVariable ObjectId id,@RequestBody Double amount){
        AccountModel withdrawReturn = accountServices.withdrawAmount(id,amount);
        if(withdrawReturn != null) {
            return new ResponseEntity<>(amount + " Successfully Withdrawn",HttpStatus.OK);
        }
        return new ResponseEntity<>("Insufficient Balance",HttpStatus.NOT_ACCEPTABLE);
    }

    @PostMapping("/withdraw/{id}")
    public ResponseEntity<String> deposit(@PathVariable ObjectId id,@RequestBody Double amount){
        AccountModel withdrawReturn = accountServices.depositAmount(id,amount);
        if(withdrawReturn != null) {
            return new ResponseEntity<>(amount + " Successfully Deposited",HttpStatus.OK);
        }
        return new ResponseEntity<>("Insufficient Balance",HttpStatus.NOT_ACCEPTABLE);
    }

}
