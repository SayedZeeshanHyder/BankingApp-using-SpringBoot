package com.BankingApp.BankingApp.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "Transactions")
public class TransactionModel {

    @Id
    private ObjectId transactionId;
    private ObjectId sender;
    private ObjectId reciever;
    private Double amount;
    private LocalDateTime transactionTime;

}
