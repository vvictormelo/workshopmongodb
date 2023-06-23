package com.vvictormelo.workshopmongodb.config;

import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.vvictormelo.workshopmongodb.domain.Post;
import com.vvictormelo.workshopmongodb.domain.User;
import com.vvictormelo.workshopmongodb.repository.PostRespository;
import com.vvictormelo.workshopmongodb.repository.UserRespository;

@Configuration
public class Instantiation implements CommandLineRunner {

    @Autowired
    private UserRespository userRepository;

    @Autowired
    private PostRespository postRespository;

    @Override
    public void run(String... args) throws Exception {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        userRepository.deleteAll();
        postRespository.deleteAll();

        User maria = new User(null, "Maria Brown", "maria@gmail.com");
        User alex = new User(null, "Alex Green", "alex@gmail.com");
        User bob = new User(null, "Bob Grey", "bob@gmail.com");

        Post post1 = new Post(null, sdf.parse("21/03/2018"), "Partiu Viagem", "Vou viajar para São Paulo. Abs!", maria);
        Post post2 = new Post(null, sdf.parse("23/03/2018"), "Tenha um ótimo dia!", "Acordei feliz hoje!", maria);

        userRepository.saveAll(Arrays.asList(maria, alex, bob));
        postRespository.saveAll(Arrays.asList(post1, post2));
    }

}