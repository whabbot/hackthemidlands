package app;

/*
 * @author whabbot
 * 
 * A class for the Bosses. Each has a randomly chosen name, hp (initially set to 100) and a theme.
 * The theme decides the pool the questions come from.
 */

public class Boss {

    private static final String[] BOSS_NAMES = {"Jerry", "Harry", "Hilda"};
    private static final int MAX_HP = 100;

    private final String name;
    private final Theme theme;

    private int hp;

    public Boss() {
        hp = MAX_HP;

        int name_index = (int)(Math.random() * BOSS_NAMES.length);
        name = BOSS_NAMES[name_index];

        theme = Theme.randomTheme();
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
        return;
//        Question randomQuestion = new Question(theme);
//        System.out.println(randomQuestion.getContent());
    }

    public void introduceSelf() {
        System.out.println("I am " + name + " the " + theme.toString() + " demon!");
        System.out.println("Answer my questions if you want to live!");
    }

}
