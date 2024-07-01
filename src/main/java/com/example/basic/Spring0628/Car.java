package com.example.basic.Spring0628;

import org.apache.catalina.Engine;

public class Car {
    private Engine engine;

    public Car(Engine engine) { // 외부에서 객체를 받음.
        this.engine = engine;
    }
}