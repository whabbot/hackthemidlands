package app;

public class MainBoss extends Boss {

    public static final int NUMBER_OF_QUESTIONS = 5;

    public MainBoss(Theme theme) {
        super(theme, "CPU", 50, NUMBER_OF_QUESTIONS);
    }
}
