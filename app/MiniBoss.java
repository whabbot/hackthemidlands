package app;
import java.util.*;
public class MiniBoss {

    public static final int NUMBER_OF_QUESTIONS = 3;


    private final String name;
    private final Theme theme;

    private int hp;

    // This will be in form String[] questions = {"Question 1", "question 2", "question 3"}
    private String[] questions;

    // This will be in form String[] wrongAnswers = {{"first wrong answer for question 1", "second answer for question 1", "third wrong answer for question 1"},
    //                                               {"first wrong answer for question 2", "second answer for question 2", "third wrong answer for question 2"},
    //                                               {"first wrong answer for question 3", "second answer for question 3", "third wrong answer for question 3"},
    private List[] wrongAnswers;

    // This will be in form String right Answer = {"right answer for question 1", "right answer for question 2", "right answer for question 3"};
    private String[] rightAnswers;
    private int numOfQuestionsAsked;


    public MiniBoss(Theme theme) {
        this.theme = theme;
        hp = 30;

        name = "MIPS";

        questions = Question.getQuestions(theme, NUMBER_OF_QUESTIONS);

        wrongAnswers = Question.getWrongAnswers(theme, questions, NUMBER_OF_QUESTIONS - 1);

        rightAnswers = Question.getRightAnswers(theme, questions);
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public Theme getTheme() {
        return theme;
    }

    public void askQuestion() {
        System.out.println(questions[numOfQuestionsAsked]);
        numOfQuestionsAsked++;
    }

    public void promptAnswer() {
        System.out.println(wrongAnswers[numOfQuestionsAsked - 1]);
        System.out.println(rightAnswers[numOfQuestionsAsked - 1]);

    }

    public void introduceSelf() {
        System.out.println("I am " + name + " the " + theme.toString());
        System.out.println("Answer my questions if you want to live!");
    }

    public void displayQsAndAs() {
        for (int i = 0; i < wrongAnswers.length; ++i)
            System.out.println(wrongAnswers[i]);
        for (int i = 0; i < rightAnswers.length; ++i)
            System.out.println(rightAnswers[i]);
        for (int i = 0; i < questions.length; ++i)
            System.out.println(questions[i]);
    }

}
