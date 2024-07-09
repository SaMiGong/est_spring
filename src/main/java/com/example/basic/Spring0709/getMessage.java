package com.example.basic.Spring0709;

import org.aspectj.bridge.IMessage;
import org.springframework.stereotype.Component;

@Component
public class getMessage implements Message {

    @Override
    public void print() {
        System.out.println("Hello, World!2");
    }
}
