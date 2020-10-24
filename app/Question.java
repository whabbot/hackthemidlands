package app;
import java.lang.reflect.Array;
import java.util.*;
/*
 * @author whabbot
 * 
 * A class for questions. Fields are:
 *      "theme" - the type of question - currently "architecture" or "assembly"
 *      "content" - the content of the question
 */

public class Question {




    private static final ArrayList<String> ASSEMBLY_QS_EASY = new ArrayList<>(Arrays.asList("What is a CPU0?",
            "What is a CPU1?",
            "What is a CPU2?",
            "What is a CPU3?",
            "What is a CPU4?",
            "What is a CPU5?"));

    private static final Map<String, String> ASSEMBLY_RIGHT_ANSWER_EASY = new HashMap();
    static {
        ASSEMBLY_RIGHT_ANSWER_EASY.put("What is a CPU0?", "Right answer0");
        ASSEMBLY_RIGHT_ANSWER_EASY.put("What is a CPU1?", "Right answer1");
        ASSEMBLY_RIGHT_ANSWER_EASY.put("What is a CPU2?", "Right answer2");
        ASSEMBLY_RIGHT_ANSWER_EASY.put("What is a CPU3?", "Right answer3");
        ASSEMBLY_RIGHT_ANSWER_EASY.put("What is a CPU4?", "Right answer4");
        ASSEMBLY_RIGHT_ANSWER_EASY.put("What is a CPU5?", "Right answer5");
        System.out.println(ASSEMBLY_RIGHT_ANSWER_EASY);
    };

    private static final Map<String, ArrayList<String>> ASSEMBLY_WRONG_ANSWERS_EASY = new HashMap();
    static {
        // Probably need a more elegant way of dealing with this.
        ArrayList<String> temp = new ArrayList();

        temp = new ArrayList<>(Arrays.asList("Wrong answer 00", "wrong answer 01", "wrong answer 02", "wrong answer 03"));
        ASSEMBLY_WRONG_ANSWERS_EASY.put("What is a CPU0?", temp);
        temp = new ArrayList<>(Arrays.asList("Wrong answer 10", "wrong answer 11", "wrong answer 12", "wrong answer 13"));
        ASSEMBLY_WRONG_ANSWERS_EASY.put("What is a CPU1?", temp);
        temp = new ArrayList<>(Arrays.asList("Wrong answer 20", "wrong answer 21", "wrong answer 22", "wrong answer 23"));
        ASSEMBLY_WRONG_ANSWERS_EASY.put("What is a CPU2?", temp);
        temp = new ArrayList<>(Arrays.asList("Wrong answer 30", "wrong answer 31", "wrong answer 32", "wrong answer 33"));
        ASSEMBLY_WRONG_ANSWERS_EASY.put("What is a CPU3?", temp);
        temp = new ArrayList<>(Arrays.asList("Wrong answer 40", "wrong answer 41", "wrong answer 42", "wrong answer 43"));
        ASSEMBLY_WRONG_ANSWERS_EASY.put("What is a CPU4?", temp);
        temp = new ArrayList<>(Arrays.asList("Wrong answer 50", "wrong answer 51", "wrong answer 52", "wrong answer 53"));
        ASSEMBLY_WRONG_ANSWERS_EASY.put("What is a CPU5?", temp);

    }

    // TODO: ASSEMBLY questions


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
            wrongAnswerForQuestion = (ArrayList<String>) ASSEMBLY_WRONG_ANSWERS_EASY.get(str);
            Collections.shuffle(wrongAnswerForQuestion);
            wrongAnswers.add(wrongAnswerForQuestion.subList(0, numberOfWrongAnswers + 1));

        }

        return Arrays.stream(wrongAnswers.toArray()).toArray(List[]::new);
    }

    public static String[] getRightAnswers(Theme theme, String[] questions) {
        ArrayList<String> rightAnswers = new ArrayList<>();

        for (String str: questions)
            rightAnswers.add(ASSEMBLY_RIGHT_ANSWER_EASY.get(str));
        return Arrays.stream(rightAnswers.toArray()).toArray(String[]::new);
    }

//    public static void main(String[] args) {
//        for (int i = 0; i < ARCHITECTURE_QS_EASY.size(); ++i)
//            System.out.println(ARCHITECTURE_QS_EASY.get(i));
//    }
}
