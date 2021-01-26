package com.mauriciogoulart.workshopmongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mauriciogoulart.workshopmongodb.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

	
	
}
