package com.example.basic.Spring0628;

import org.apache.catalina.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserRepositoryInterface userRepository;


    public UserService(UserRepositoryInterface userRepository1) {
        this.userRepository = userRepository1;
    }

    public void createUser(User user) {
        userRepository.save(user);
    }

    public void deleteUser(User user) {
        userRepository.delete(user);
    }
}

