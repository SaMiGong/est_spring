package com.example.basic.Spring0701.Spring_4;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    private String email;
    private String name;
    private int age;

    public User(String email, String name, int age) {
        this.email = email;
        this.name = name;
        this.age = age;
    }
}
