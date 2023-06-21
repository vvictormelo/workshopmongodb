package com.vvictormelo.workshopmongodb.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vvictormelo.workshopmongodb.domain.User;
import com.vvictormelo.workshopmongodb.dto.UserDTO;
import com.vvictormelo.workshopmongodb.repository.UserRespository;
import com.vvictormelo.workshopmongodb.services.exception.ObjectNotFoundException;

@Service
public class UserService {

    @Autowired
    private UserRespository repo;

    public List<User> findAll() {
        return repo.findAll();
    }

    public User findById(String id) {
        Optional<User> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

    public User insert(User obj) {
        return repo.insert(obj);
    }

    public User fromDto(UserDTO objDto) {
        return new User(objDto.getId(), objDto.getName(), objDto.getEmail());
    }

}