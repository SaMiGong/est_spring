package com.example.basic.Spring0708;


import com.example.util.Helper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.example")
public class BasicApplication {
    public static void main(String[] args) {

        MyService myService = new MyService();
        myService.hello();
        SpringApplication.run(BasicApplication.class, args);
    }
}
