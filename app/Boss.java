package app;

import java.util.List;

public class Boss {

    public static final int MAX_ANSWER_OPTIONS = 4;

    protected String name;
    protected Theme theme;
    protected int hp;
    // This will be in form String[] questions = {"Question 1", "question 2", "question 3"}
    protected String[] questions;
    // This will be in form String[] wrongAnswers = {{"first wrong answer for question 1", "second answer for question 1", "third wrong answer for question 1"},
    //                                               {"first wrong answer for question 2", "second answer for question 2", "third wrong answer for question 2"},
    //                                               {"first wrong answer for question 3", "second answer for question 3", "third wrong answer for question 3"},
    protected List[] wrongAnswers;
    // This will be in form String right Answer = {"right answer for question 1", "right answer for question 2", "right answer for question 3"};
    protected String[] rightAnswers;
    // TODO: add a field that keeps track of rightAnswerPosition in promptAnswer -> this will tell you what the right answer is.
    
    private int numOfQuestionsAsked;
    
    private int rightAnswerIndex;

    public Boss(Theme theme, String name, int hp, int totalNumberOfQuestions) {

        this.name = name;
        this.theme = theme;

        questions = Question.getQuestions(theme, totalNumberOfQuestions);

        wrongAnswers = Question.getWrongAnswers(theme, questions, MAX_ANSWER_OPTIONS - 1);

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
    
    public int getRightAnswerIndex() {
        return rightAnswerIndex;
    }

    public String askQuestion() {
        return questions[numOfQuestionsAsked++];

    }

    public StringBuilder promptAnswer() {
        int rightAnswerPosition = (int) (Math.random() * Boss.MAX_ANSWER_OPTIONS);
        rightAnswerIndex = rightAnswerPosition;
        int wrongAnswersGiven = 0;
        StringBuilder prompt = new StringBuilder();
        for (int i = 0; i < Boss.MAX_ANSWER_OPTIONS; ++i) {
            if (i == rightAnswerPosition)
                prompt.append(rightAnswers[numOfQuestionsAsked - 1] + "abc");
            else {
                prompt.append(wrongAnswers[numOfQuestionsAsked - 1].get(wrongAnswersGiven) + "abc");
                wrongAnswersGiven++;
            }
        }
        return prompt;
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
