package com.BankingApp.BankingApp.Mapper;

import com.BankingApp.BankingApp.Models.Entity.UserModel;
import com.BankingApp.BankingApp.Models.dto.UserModelDto;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public UserModelDto mapUserToUserDto(UserModel userModel) {
        return new UserModelDto(userModel.getUserId(), userModel.getProfileUrl(), userModel.getEmail(), userModel.getPhoneNumber(), userModel.getUserName());
    }

}
