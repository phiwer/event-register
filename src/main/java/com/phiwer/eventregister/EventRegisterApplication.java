package com.phiwer.eventregister;

import com.phiwer.eventregister.domain.User;
import com.phiwer.eventregister.domain.UserRepository;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class EventRegisterApplication {

    public static void main(String[] args) {
        SpringApplication.run(EventRegisterApplication.class, args);
    }

    @Bean
    CommandLineRunner init(UserRepository userRepository) {
        return args -> {
            Stream.of(
                            new ImmutablePair<>("John", "Doe"),
                            new ImmutablePair<>("Julie", "Dawson"),
                            new ImmutablePair<>("Jennifer", "Johnson"),
                            new ImmutablePair<>("Helen", "Davidson"),
                            new ImmutablePair<>("Rachel", "Larsson"))
                    .forEach(name -> {
                        User user = new User(name.getLeft(), name.getRight(), name.getRight() + "@domain.com");
                        userRepository.save(user);
                    });
            userRepository.findAll().forEach(System.out::println);
        };
    }
}
