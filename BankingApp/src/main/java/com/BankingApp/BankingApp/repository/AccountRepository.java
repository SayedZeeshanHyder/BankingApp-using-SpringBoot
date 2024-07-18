package com.BankingApp.BankingApp.repository;

import com.BankingApp.BankingApp.model.AccountModel;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AccountRepository extends MongoRepository<AccountModel, ObjectId> {
}
