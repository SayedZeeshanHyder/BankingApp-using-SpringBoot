package com.BankingApp.BankingApp.services;

import com.BankingApp.BankingApp.model.AccountModel;
import com.BankingApp.BankingApp.model.TransactionModel;
import com.BankingApp.BankingApp.repository.AccountRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AccountServices {

    @Autowired
    private AccountRepository accountRepository;

    public AccountModel createNewUser(AccountModel newAccount){
        return accountRepository.save(newAccount);
    }

    public AccountModel getAccountById(ObjectId accountId){
        return accountRepository.findById(accountId).orElse(null);
    }

    public void deleteAccountById(ObjectId accountId){
        accountRepository.deleteById(accountId);
    }

    public List<AccountModel> getAllAccounts(){
        return accountRepository.findAll();
    }

    public void addTransactionsToUsers(TransactionModel transaction){
        AccountModel senderAccount = getAccountById(transaction.getSender());
        senderAccount.getTransactions().add(transaction);
        accountRepository.save(senderAccount);

        AccountModel recieverAccount = getAccountById(transaction.getReciever());
        recieverAccount.getTransactions().add(transaction);
        accountRepository.save(recieverAccount);
    }

}
