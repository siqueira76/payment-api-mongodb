package com.siqueira76.payment.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.siqueira76.payment.domain.Client;

@Repository
public interface ClientRepository extends MongoRepository<Client, String> {

}
