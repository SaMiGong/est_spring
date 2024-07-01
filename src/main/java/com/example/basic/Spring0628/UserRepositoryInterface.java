package com.example.basic.Spring0628;

import org.apache.catalina.User;

public interface UserRepositoryInterface {
    void save(User user);

    void delete(User user);
}
