package com.example.basic.Spring0701.Spring_1;

public class EmailService {
    private final EmailSender emailSender;

    public EmailService(EmailSender emailSender) {
        this.emailSender = emailSender;
    }
    public void sendEmail(String to, String subject, String text) {
        emailSender.sendEmail(to, subject, text);
    }

}
