package app;

public class MiniBoss {

    private static final int NUMBER_OF_QUESTIONS = 3;

    private final String name;
    private final Theme theme;

    private int hp;

    private String[] questions;
    private String[] wrongAnswers;
    private String rightAnswer = "test";
    private int numOfQuestionsAsked;


    public MiniBoss(Theme theme) {
        this.theme = theme;
        hp = 30;

        name = "MIPS";

        questions = Question.getQuestions(theme, NUMBER_OF_QUESTIONS);

        wrongAnswers = Question.getWrongAnswers(theme, questions, NUMBER_OF_QUESTIONS - 1);
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
    }

//    public void promptAnswers() {
//        System.out.println(Question.getPossibleAnswers(theme, numberOfQsAsked - 1));
//    }

    public void introduceSelf() {
        System.out.println("I am " + name + " the " + theme.toString());
        System.out.println("Answer my questions if you want to live!");
    }

}
