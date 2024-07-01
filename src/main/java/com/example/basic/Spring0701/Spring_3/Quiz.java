package com.example.basic.Spring0701.Spring_3;

import lombok.Getter;


@Getter
public class Quiz {
    private String question;
    private String answer;

    public Quiz(String question, String answer) {
        this.answer = answer;
        this.question = question;
    }
}


