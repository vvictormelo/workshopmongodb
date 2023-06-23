package com.vvictormelo.workshopmongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.vvictormelo.workshopmongodb.domain.Post;

@Repository
public interface PostRespository extends MongoRepository<Post, String> {

}