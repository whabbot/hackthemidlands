package app;

/*
 * @author whabbot
 * 
 * A class for questions. Fields are:
 *      "theme" - the type of question - currently "architecture" or "assembly"
 *      "content" - the content of the question
 */

public class Question {
    private final String[] ARCHITECTURE_QS = {"What is a CPU?"};
    private final String[] ASSEMBLY_QS = {"How many operands does sll take?"};
    
    private Theme theme;
    private String content;
    
    /*
     * The constructor for the Question class.
     * @param theme: the theme of the Boss's questions.
     */
    public Question(Theme theme) {
        this.theme = theme;
        if (theme == Theme.ARCHITECTURE)
                content = ARCHITECTURE_QS[(int)(Math.random() * ARCHITECTURE_QS.length)];
        else if (theme == Theme.ASSEMBLY)
            content = ASSEMBLY_QS[(int)(Math.random() * ASSEMBLY_QS.length)];
    }
    
    public String getContent() {
        return content;
    }
    
    public Theme getTheme() {
        return theme;
    }
}
