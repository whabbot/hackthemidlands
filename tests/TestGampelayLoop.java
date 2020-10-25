package tests;
import app.*;
import java.util.Scanner;

public class TestGampelayLoop {

    public static void main(String[] args) {
        MiniBoss alu = new MiniBoss(Theme.ASSEMBLY);
        int score;
        int rightAnswerIndex;
        char rightAnswerLetter;
        String[] answers;
        Scanner input = new Scanner(System.in);
        char userResponse;
        
        System.out.println("Welcome to MakeAssemblyFunAgain!");
        System.out.println("You're walking down the road one night when a MIPS R4000 ALU walks up to you.");
        System.out.println("It asks you a series of questions...\n");
        
        System.out.println(MiniBoss.image);
        
        score = 0;
        for (int i = 0; i < MiniBoss.NUMBER_OF_QUESTIONS; ++i) {
            System.out.println(alu.askQuestion());
            answers = alu.promptAnswer().toString().split("abc", 0);
            for (int j = 0; j < answers.length; ++j) {
                System.out.println((char)(j + 65) + "      "+ answers[j]);
            }
            rightAnswerIndex = alu.getRightAnswerIndex();
            rightAnswerLetter = (char)(rightAnswerIndex + 65);
            System.out.println("How do you answer? (A/B/C/D)");
            userResponse = input.nextLine().charAt(0);
            if (Character.toUpperCase(userResponse) == rightAnswerLetter)
                score++;
        }
        System.out.println("\n\"Congratulations,\" it says. \"You scored " + score + " points.\"");
        System.out.println("The end.");
        input.close();
        
        
        

    }

}
