package com.BankingApp.BankingApp.repository;

import com.BankingApp.BankingApp.model.TransactionModel;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TransactionRepository extends MongoRepository<TransactionModel, ObjectId> {
}
