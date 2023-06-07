package com.vvictormelo.workshopmongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.vvictormelo.workshopmongodb.domain.User;

@Repository
public interface UserRespository extends MongoRepository<User, String> {

}