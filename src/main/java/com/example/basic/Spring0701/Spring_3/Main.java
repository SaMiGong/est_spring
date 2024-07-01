package com.example.basic.Spring0701.Spring_3;

public class Main {
    public static void main(String[] args) {

        Quiz quiz = new Quiz("한국의 수도는? ", "서울");

        QuizView view = new QuizView();

        QuizController controller = new QuizController(quiz, view);

        controller.startQuiz();
    }
}
