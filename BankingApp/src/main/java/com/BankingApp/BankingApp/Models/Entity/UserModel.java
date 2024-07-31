package com.BankingApp.BankingApp.Models.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserModel {

    @Id
    private ObjectId userId;
    private String profileUrl;
    private String email;
    private Long balance;
    private String phoneNumber;
    private String address;
    private String city;
    private String postCode;
    private String fullName;
    private String userName;
    private LocalDateTime dateOfBirth;
    private String country;
    private Long passCode;
    private List<CardModel> cards;
    private List<TransactionModel> userTransactions;

}
