package com.BankingApp.BankingApp.services;

import com.BankingApp.BankingApp.Mapper.UserMapper;
import com.BankingApp.BankingApp.Models.Entity.UserModel;
import com.BankingApp.BankingApp.Models.dto.UserModelDto;
import com.BankingApp.BankingApp.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class UserServices {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserRepository userRepository;

    public UserModelDto getUserByUserName(String userName) throws NoSuchFieldException {
        Optional<UserModel> foundUser = userRepository.findByUserName(userName);
        if(foundUser.isPresent()){
            return userMapper.mapUserToUserDto(foundUser.get());
        }else{
            throw new NoSuchFieldException("No User Found");
        }
    }

}
