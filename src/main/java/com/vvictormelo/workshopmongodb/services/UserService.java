package com.vvictormelo.workshopmongodb.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vvictormelo.workshopmongodb.domain.User;
import com.vvictormelo.workshopmongodb.repository.UserRespository;

@Service
public class UserService {

    @Autowired
    private UserRespository repo;

    public List<User> findAll() {
        return repo.findAll();
    }

}