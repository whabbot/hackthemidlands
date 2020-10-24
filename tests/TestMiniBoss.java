package tests;
import app.*;

public class TestMiniBoss {
    public static void main(String[] args) {
        MiniBoss alu = new MiniBoss(Theme.ASSEMBLY);
        alu.introduceSelf();
        for (int i = 0; i < MiniBoss.NUMBER_OF_QUESTIONS; ++i) {
            alu.askQuestion();
            alu.promptAnswer();
        }

//        MiniBoss mips = new MiniBoss(Theme.ASSEMBLY);
//        mips.introduceSelf();
//        for (int i = 0; i < Question.MAX_ANSWER_OPTIONS; ++i) {
//            mips.askQuestion();
//            mips.promptAnswers();
//        }
    }
}
