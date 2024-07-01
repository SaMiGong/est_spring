package com.example.basic.Spring0628;

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