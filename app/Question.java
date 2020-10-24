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

    public static final int MAX_ANSWER_OPTIONS = 4;

    private static final Map<Integer, String> ARCHITECTURE_QS_EASY = new HashMap();
    static {
        ARCHITECTURE_QS_EASY.put(0, "What is a CPU0?");
        ARCHITECTURE_QS_EASY.put(1, "What is a CPU1?");
        ARCHITECTURE_QS_EASY.put(2, "What is a CPU2?");
        ARCHITECTURE_QS_EASY.put(3, "What is a CPU3?");
        ARCHITECTURE_QS_EASY.put(4, "What is a CPU4?");
        ARCHITECTURE_QS_EASY.put(5, "What is a CPU5?");
    }

    private static final Map<Integer, String> ARCHITECTURE_RIGHT_ANSWER_EASY = new HashMap();
    static {
        ARCHITECTURE_RIGHT_ANSWER_EASY.put(0, "Right answer0");
        ARCHITECTURE_RIGHT_ANSWER_EASY.put(1, "Right answer1");
        ARCHITECTURE_RIGHT_ANSWER_EASY.put(2, "Right answer2");
        ARCHITECTURE_RIGHT_ANSWER_EASY.put(3, "Right answer3");
        ARCHITECTURE_RIGHT_ANSWER_EASY.put(4, "Right answer4");
        ARCHITECTURE_RIGHT_ANSWER_EASY.put(5, "Right answer5");
    }

    private static final Map<Integer, String[]> ARCHITECTURE_WRONG_ANSWERS_EASY = new HashMap();
    static {
        // Probably need a more elegant way of dealing with this.
        String[] temp = {"Wrong answer 0", "wrong answer 1", "wrong answer 2", "wrong answer 3"};
        ARCHITECTURE_WRONG_ANSWERS_EASY.put(0, temp);
        ARCHITECTURE_WRONG_ANSWERS_EASY.put(1, temp);
        ARCHITECTURE_WRONG_ANSWERS_EASY.put(2, temp);
        ARCHITECTURE_WRONG_ANSWERS_EASY.put(3, temp);
        ARCHITECTURE_WRONG_ANSWERS_EASY.put(4, temp);
        ARCHITECTURE_WRONG_ANSWERS_EASY.put(5, temp);

    }

    private static final Map<Integer, String> ASSEMBLY_QS_EASY = new HashMap();
    static {
        ASSEMBLY_QS_EASY.put(0, "How many operands does sll take0?");
        ASSEMBLY_QS_EASY.put(1, "How many operands does sll take1?");
        ASSEMBLY_QS_EASY.put(2, "How many operands does sll take2?");
        ASSEMBLY_QS_EASY.put(3, "How many operands does sll take3?");
        ASSEMBLY_QS_EASY.put(4, "How many operands does sll take4?");
        ASSEMBLY_QS_EASY.put(5, "How many operands does sll take5?");
    }

    private static final Map<Integer, String> ASSEMBLY_RIGHT_ANSWER_EASY = new HashMap();
    static {
        ASSEMBLY_RIGHT_ANSWER_EASY.put(0, "Right answer0");
        ASSEMBLY_RIGHT_ANSWER_EASY.put(1, "Right answer1");
        ASSEMBLY_RIGHT_ANSWER_EASY.put(2, "Right answer2");
        ASSEMBLY_RIGHT_ANSWER_EASY.put(3, "Right answer3");
        ASSEMBLY_RIGHT_ANSWER_EASY.put(4, "Right answer4");
        ASSEMBLY_RIGHT_ANSWER_EASY.put(5, "Right answer5");
    }


    private static final Map<Integer, String[]> ASSEMBLY_WRONG_ANSWERS_EASY = new HashMap();
    static {
        // Probably need a more elegant way of dealing with this.
        String[] temp = {"Wrong answer 0", "wrong answer 1", "wrong answer 2", "wrong answer 3"};
        ASSEMBLY_WRONG_ANSWERS_EASY.put(0, temp);
        ASSEMBLY_WRONG_ANSWERS_EASY.put(1, temp);
        ASSEMBLY_WRONG_ANSWERS_EASY.put(2, temp);
        ASSEMBLY_WRONG_ANSWERS_EASY.put(3, temp);
        ASSEMBLY_WRONG_ANSWERS_EASY.put(4, temp);
        ASSEMBLY_WRONG_ANSWERS_EASY.put(5, temp);

    }


    public static String getQuestion(Theme theme, int questionNumber) {
        String question;
        switch (theme) {
            case ARCHITECTURE:
                question = ARCHITECTURE_QS_EASY.get(questionNumber);
                break;
            case ASSEMBLY:
                question = ASSEMBLY_QS_EASY.get(questionNumber);
                break;
            default:
                question = null;
        }
        return question;
    }

    public static String getPossibleAnswers(Theme theme, int questionNumber) {
        StringBuilder possibleAnswers = new StringBuilder();
        int correctAnswerPosition = (int)(Math.random() * MAX_ANSWER_OPTIONS);
        String rightAnswer;
        String[] wrongAnswers;

        if (theme == Theme.ARCHITECTURE) {
            rightAnswer = ARCHITECTURE_RIGHT_ANSWER_EASY.get(questionNumber);
            wrongAnswers = ARCHITECTURE_WRONG_ANSWERS_EASY.get(questionNumber);
            for (int i = 0; i < MAX_ANSWER_OPTIONS; ++i) {
                if (i == correctAnswerPosition)
                    possibleAnswers.append( rightAnswer+ "\n");
                else
                    possibleAnswers.append(wrongAnswers[i] + "\n");
            }
        }
        else if (theme == Theme.ASSEMBLY) {
            rightAnswer = ASSEMBLY_RIGHT_ANSWER_EASY.get(questionNumber);
            wrongAnswers = ASSEMBLY_WRONG_ANSWERS_EASY.get(questionNumber);
            for (int i = 0; i < MAX_ANSWER_OPTIONS; ++i) {
                if (i == correctAnswerPosition)
                    possibleAnswers.append(rightAnswer + "\n");
                else
                    possibleAnswers.append(wrongAnswers[i] + "\n");
            }
        }
    return possibleAnswers.toString();
    }


//    public static void main(String[] args) {
//        for (int i = 0; i < ARCHITECTURE_QS_EASY.size(); ++i)
//            System.out.println(ARCHITECTURE_QS_EASY.get(i));
//    }
}
