package app;

public class MiniBoss extends Boss {

    public static final int NUMBER_OF_QUESTIONS = 3;
    public static String image;

    public MiniBoss(Theme theme) {
        super(theme, "MIPS", 30, NUMBER_OF_QUESTIONS);
        image = "                \"~llllllll_}!lllllll!\"                  ,,,,,,,\",+_,\"\"\"\"\"               \n"
                + "                 ~-:,,,,,,,,,,,,,,,,I_:                i~!!!!!!!!~+!!!iii!+[\"           \n"
                + "                  I_,                ,_l             :_l                 I+:            \n"
                + "                   ,_I                 ~~           l+,                 ~~              \n"
                + "                     ~!                 l_,       \"+!                 :_I               \n"
                + "                      !+\"                :_;     ;_:                 l+,                \n"
                + "                       ;_:                 ~i   i~\"                \"~i                  \n"
                + "                        \"_l                 !+;_I                 :_;                   \n"
                + "                          ii                 :+,                 !+\"                 \n"
                + "                           -[,                                 \"_~\n"
                + "                            ~_;                               ;_l\n"
                + "                             \"+!         /\\  |    |   |      i~\"            \n"
                + "                               !+\"      /--\\ |    |   |    ,+l                          \n"
                + "                                ;_:    /    \\|___ |___|   I_:                           \n"
                + "                                 ,_I                     ~~                             \n"
                + "                                   ~i                  ,_I                              \n"
                + "                                    l+\"               l_,                               \n"
                + "                                     :_l;;;;;;;;;;;;;~i                                 \n"
                + "                                      \"IIIIIII+IIIIII:";
    }

}
