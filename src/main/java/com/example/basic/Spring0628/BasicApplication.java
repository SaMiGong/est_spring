package com.example.basic.Spring0628;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BasicApplication {


    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.println(singleton);
        System.out.println("====================================");
        System.out.println(singleton1);
        System.out.println("====================================");
        System.out.println(singleton2);
        System.out.println("====================================");

        Singleton singleton3 = new Singleton();
        System.out.println(singleton3);
        System.out.println("====================================");
        Singleton singleton4 = new Singleton();
        System.out.println(singleton4);

//        SpringApplication.run(BasicApplication.class, args);
    }
}