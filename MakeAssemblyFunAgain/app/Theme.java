package app;

/*
 * @author whabbot
 * The themes of the Boss's questions.
 */

public enum Theme {
    ARCHITECTURE, ASSEMBLY;
    
    
    /*
     * This method selects a random theme from the above values.
     * @return a random theme
     */
    public static Theme randomTheme() {
        int len = values().length;
        int index = (int)(Math.random() * len);
        return values()[index];
    }
}
