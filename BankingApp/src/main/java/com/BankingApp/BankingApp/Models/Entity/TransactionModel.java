package com.BankingApp.BankingApp.Models.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TransactionModel {

    @Id
    private ObjectId transactionId;
    private ObjectId senderId;
    private ObjectId recieverId;
    private Long amount;
    private LocalDateTime transactionTime;
    private CardModel cardInfo;
    private String transactionCategory;

}
