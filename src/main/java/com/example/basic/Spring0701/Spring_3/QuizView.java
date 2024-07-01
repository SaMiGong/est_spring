package com.example.basic.Spring0701.Spring_3;


import java.util.Scanner;

public class QuizView {
    private Scanner scanner;

    public QuizView() {
        scanner = new Scanner(System.in);
    }

    public void displayQuestion(String question) {
        System.out.println("Question: " + question);
    }

    public String getUserAnswer() {
        System.out.println("Your answer: ");
        return scanner.nextLine();
    }

    public void displayResult(boolean isCorrect) {
        if (isCorrect) {
            System.out.println("정답입니다.");
        } else {
            System.out.println("오답입니다.");
        }
    }
}



