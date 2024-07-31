package com.BankingApp.BankingApp.Repository;

import com.BankingApp.BankingApp.Models.Entity.UserModel;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;


public interface UserRepository extends MongoRepository<UserModel, ObjectId> {

    Optional<UserModel> findByUserName(String userName);

}
