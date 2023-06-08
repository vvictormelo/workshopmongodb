package com.vvictormelo.workshopmongodb.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.vvictormelo.workshopmongodb.domain.User;
import com.vvictormelo.workshopmongodb.repository.UserRespository;

@Configuration
public class Instantiation implements CommandLineRunner {

    @Autowired
    private UserRespository userrepository;

    @Override
    public void run(String... args) throws Exception {

        userrepository.deleteAll();

        User maria = new User(null, "Maria Brown", "maria@gmail.com");
        User alex = new User(null, "Alex Green", "alex@gmail.com");
        User bob = new User(null, "Bob Grey", "bob@gmail.com");

        userrepository.saveAll(Arrays.asList(maria, alex, bob));
    }

}