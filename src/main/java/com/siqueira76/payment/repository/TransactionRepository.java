package com.siqueira76.payment.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.siqueira76.payment.domain.Transaction;

public interface TransactionRepository extends MongoRepository<Transaction, String> {

}
