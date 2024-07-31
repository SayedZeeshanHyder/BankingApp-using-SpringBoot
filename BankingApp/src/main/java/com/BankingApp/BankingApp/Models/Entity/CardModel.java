package com.BankingApp.BankingApp.Models.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CardModel {

    @Id
    private String cardNumber;
    private String accountHolderName;
    private String email;
    private String passCode;

}
