package com.andrezza.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.andrezza.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
