package app;

public class miniBoss {

    private final String name;
    private final Theme theme;

    private int hp;
    private int numberOfQsAsked;


    public miniBoss(Theme theme) {
        this.theme = theme;
        hp = 30;

        if (theme == Theme.ARCHITECTURE) {
            name = "ALU";
        }
        else if (theme == Theme.ASSEMBLY) {
            name = "MIPS";
        }
        else {
            name = null;
        }
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
        System.out.println(Question.getQuestion(theme, numberOfQsAsked));
        numberOfQsAsked++;
    }

    public void promptAnswers() {
        System.out.println(Question.getPossibleAnswers(theme, numberOfQsAsked - 1));
    }

    public void introduceSelf() {
        System.out.println("I am " + name + " the " + theme.toString());
        System.out.println("Answer my questions if you want to live!");
    }

}
