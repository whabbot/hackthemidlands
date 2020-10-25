package app;
import java.util.*;
/*
 * @author whabbot
 * 
 * A class for questions. Fields are:
 *      "theme" - the type of question - currently "architecture" or "assembly"
 *      "content" - the content of the question
 */

public class Question {

    private static final ArrayList<String> ASSEMBLY_QS_EASY = new ArrayList<>(Arrays.asList("How many register operands does ori take?",
            "What does a no-op instruction do?",
            "What value is in the register $t0 after the intruction 'ori $t0, $zero, 1' then 'addi $t0, $t0, 1'?",
            "What bit pattern is in the register $0?",
            "What is the difference between .asciiz and .ascii?",
            "What type of program is responsible for turning assembly code into machine code?"));

    private static final Map<String, String> ASSEMBLY_RIGHT_ANSWER_EASY = new HashMap();
    static {
        ASSEMBLY_RIGHT_ANSWER_EASY.put("How many register operands does ori take?", "Two");
        ASSEMBLY_RIGHT_ANSWER_EASY.put("What does a no-op instruction do?", "Has no effect");
        ASSEMBLY_RIGHT_ANSWER_EASY.put("What value is in the register $t0 after the intruction 'ori $t0, $zero, 1' then 'addi $t0, $t0, 1'?", "2");
        ASSEMBLY_RIGHT_ANSWER_EASY.put("What bit pattern is in the register $0?", "All zeros");
        ASSEMBLY_RIGHT_ANSWER_EASY.put("What is the difference between .asciiz and .ascii?", ".asciiz means a character sequence terminated with ASCII '\\0'");
        ASSEMBLY_RIGHT_ANSWER_EASY.put("What type of program is responsible for turning assembly code into machine code?", "An assembler");
    };

    private static final Map<String, ArrayList<String>> ASSEMBLY_WRONG_ANSWERS_EASY = new HashMap();
    static {
        // Probably need a more elegant way of dealing with this.
        ArrayList<String> temp;

        temp = new ArrayList<>(Arrays.asList("None", "One", "Three", "Four"));
        ASSEMBLY_WRONG_ANSWERS_EASY.put("How many register operands does ori take?", temp);

        temp = new ArrayList<>(Arrays.asList("Goes through a loop backwards", "Deletes an operation from memory", "Adds two immediates together", "Stores the value 'NO' in a register"));
        ASSEMBLY_WRONG_ANSWERS_EASY.put("What does a no-op instruction do?", temp);

        temp = new ArrayList<>(Arrays.asList("0", "1", "3", "These are not valid instructions"));
        ASSEMBLY_WRONG_ANSWERS_EASY.put("What value is in the register $t0 after the intruction 'ori $t0, $zero, 1' then 'addi $t0, $t0, 1'?", temp);

        temp = new ArrayList<>(Arrays.asList("All ones", "Alternating ones and zeros", "The binary representation of 64", "The binary representation of 32"));
        ASSEMBLY_WRONG_ANSWERS_EASY.put("What bit pattern is in the register $0?", temp);

        temp = new ArrayList<>(Arrays.asList(".asciiz means multiple ASCII characters, .ascii is just one", "There is no difference", ".asciiz is twice as long as .ascii", ".ascii is twice as long as .asciiz"));
        ASSEMBLY_WRONG_ANSWERS_EASY.put("What is the difference between .asciiz and .ascii?", temp);

        temp = new ArrayList<>(Arrays.asList("A compiler", "A lexer", "A constructor", "An interpreter"));
        ASSEMBLY_WRONG_ANSWERS_EASY.put("What type of program is responsible for turning assembly code into machine code?", temp);

    }

    public static String[] getQuestions(Theme theme, int numberOfQuestions) {
        ArrayList<String> questionsList = (ArrayList<String>) ASSEMBLY_QS_EASY.clone();
        Collections.shuffle(questionsList);


        List<String> questions = new ArrayList();
        switch (theme) {
            case ASSEMBLY:
                for (int i = 0; i < numberOfQuestions; ++i)
                    questions.add(questionsList.get(i));
                break;
            default:
                questions = null;
        }

        return Arrays.stream(questions.toArray()).toArray(String[]::new);
    }

    public static List[] getWrongAnswers(Theme theme, String[] questions, int numberOfWrongAnswers) {
        ArrayList<List<String>> wrongAnswers = new ArrayList<>();

        ArrayList<String> wrongAnswerForQuestion;
        for (String str: questions) {

            wrongAnswerForQuestion = ASSEMBLY_WRONG_ANSWERS_EASY.get(str);
            Collections.shuffle(wrongAnswerForQuestion);

            wrongAnswers.add(wrongAnswerForQuestion.subList(0, numberOfWrongAnswers));


        }

        return Arrays.stream(wrongAnswers.toArray()).toArray(List[]::new);
    }

    public static String[] getRightAnswers(Theme theme, String[] questions) {
        ArrayList<String> rightAnswers = new ArrayList<>();

        for (String str: questions)
            rightAnswers.add(ASSEMBLY_RIGHT_ANSWER_EASY.get(str));
        return Arrays.stream(rightAnswers.toArray()).toArray(String[]::new);
    }
}
