package com.BankingApp.BankingApp.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "Accounts")
public class AccountModel {

    @Id
    private ObjectId accountId;
    private Double balance;
    private String accountHolderName;
    List<TransactionModel> transactions = new ArrayList<>();

}
