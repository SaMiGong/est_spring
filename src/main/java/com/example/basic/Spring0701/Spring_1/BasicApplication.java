package com.example.basic.Spring0701.Spring_1;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BasicApplication {
    public static void main(String[] args) {

        EmailService emailService = new EmailService(new SmtpEmailSender());
        EmailService emailService1 = new EmailService(new AwsSesEmailSender());
    }
}
