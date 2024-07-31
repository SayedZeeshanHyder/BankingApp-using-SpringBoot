package com.BankingApp.BankingApp.Models.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserModelDto {
    @Id
    private ObjectId userId;
    private String profileUrl;
    private String email;
    private String phoneNumber;
    private String userName;
}
