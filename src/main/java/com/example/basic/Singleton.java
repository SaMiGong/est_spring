package com.example.basic;

import lombok.Getter;

@Getter
public class Singleton {
    private static final Singleton instance = new Singleton();

    Singleton() {

    }

    public static Singleton getInstance() {
        return instance;
    }

}