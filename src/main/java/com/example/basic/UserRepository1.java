package com.example.basic;

import org.apache.catalina.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository1 implements UserRepositoryInterface {

    @Override
    public void save(User user) {
        System.out.println("User1 saved");
    }

    @Override
    public void delete(User user1) {
        System.out.println("User1 deleted");
    }
}

