package tests;
import app.*;

public class TestMiniBoss {
    public static void main(String[] args) {
        MiniBoss mips = new MiniBoss(Theme.ASSEMBLY);
        testingBosses(mips, mips.NUMBER_OF_QUESTIONS);
        MainBoss controlUnit = new MainBoss(Theme.ASSEMBLY);
        testingBosses(controlUnit, controlUnit.NUMBER_OF_QUESTIONS);


    }

    public static void testingBosses(Boss boss, int number) {
        boss.introduceSelf();
        for (int i = 0; i < number; ++i) {
            System.out.println(boss.askQuestion());
            System.out.println();
            System.out.println(boss.promptAnswer());
            System.out.println(boss.getRightAnswerIndex());
            System.out.println();
            
        }
    }



}
