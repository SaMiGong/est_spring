package com.example.basic.Spring0701.Spring_3;

public class QuizController {
    private Quiz quiz;
    private QuizView view;

    public QuizController(Quiz quiz , QuizView view) {
        this.quiz = quiz;
        this.view = view;
    }

    public void startQuiz(){
        view.displayQuestion(quiz.getQuestion());
        String userAnswer = view.getUserAnswer();
        boolean isCorrect = userAnswer.equalsIgnoreCase(quiz.getAnswer());
        view.displayResult(isCorrect);
    }
}
