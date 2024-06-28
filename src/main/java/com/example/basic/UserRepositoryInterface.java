package com.example.basic;

import org.apache.catalina.User;

public interface UserRepositoryInterface {
    void save(User user);

    void delete(User user);
}
