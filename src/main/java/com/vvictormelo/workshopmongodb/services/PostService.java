package com.vvictormelo.workshopmongodb.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vvictormelo.workshopmongodb.domain.Post;
import com.vvictormelo.workshopmongodb.repository.PostRespository;
import com.vvictormelo.workshopmongodb.services.exception.ObjectNotFoundException;

@Service
public class PostService {

    @Autowired
    private PostRespository repo;

    public Post findById(String id) {
        Optional<Post> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

}