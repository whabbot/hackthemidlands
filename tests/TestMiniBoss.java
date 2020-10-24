package tests;
import app.*;

public class TestMiniBoss {
    public static void main(String[] args) {
        miniBoss alu = new miniBoss(Theme.ARCHITECTURE);
        alu.introduceSelf();
        for (int i = 0; i < Question.MAX_ANSWER_OPTIONS; ++i) {
            alu.askQuestion();
            alu.promptAnswers();
        }

        miniBoss mips = new miniBoss(Theme.ASSEMBLY);
        mips.introduceSelf();
        for (int i = 0; i < Question.MAX_ANSWER_OPTIONS; ++i) {
            mips.askQuestion();
            mips.promptAnswers();
        }
    }
}
