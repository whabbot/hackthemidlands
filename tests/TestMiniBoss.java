package tests;
import app.*;

public class TestMiniBoss {
    public static void main(String[] args) {
        MiniBoss alu = new MiniBoss(Theme.ASSEMBLY);
        alu.introduceSelf();
        for (int i = 0; i < MiniBoss.NUMBER_OF_QUESTIONS; ++i) {
            System.out.println(alu.askQuestion());
            System.out.println();
            System.out.println(alu.promptAnswer());
            System.out.println();

        }
//        alu.displayQsAndAs();

//        MiniBoss mips = new MiniBoss(Theme.ASSEMBLY);
//        mips.introduceSelf();
//        for (int i = 0; i < Question.MAX_ANSWER_OPTIONS; ++i) {
//            mips.askQuestion();
//            mips.promptAnswers();
//        }
    }
}
