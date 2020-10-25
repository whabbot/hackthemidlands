import java.util.Scanner;
import app.*;

public class textBox
{
	Scanner scan = new Scanner(System.in);
	int getLength = 80;
	int healDec = 0;
	int healBossDec = 0;
	MakeAssemblyFunAgain healthBar = new MakeAssemblyFunAgain();
	MiniBoss mips = new MiniBoss(Theme.ASSEMBLY);
	MainBoss controlUnit = new MainBoss(Theme.ASSEMBLY);
	int numOfRight = 0, numOfQue = 0;

	public void drawBoxTop()
	{
		System.out.print("|");
		for(int i=0; i<10; i++)
			System.out.print(" ");
		System.out.print("+");
		for(int i=0; i<getLength; i++)
			System.out.print("-");
		System.out.print("+");
		for(int i=0; i<10; i++)
			System.out.print(" ");
		System.out.println("|");
	}

	public void drawBoxBottom()
	{
		System.out.print("|");
		for(int i=0; i<10; i++)
			System.out.print(" ");
		System.out.print("+");
		for(int i=0; i<getLength; i++)
			System.out.print("-");
		System.out.print("+");
		for(int i=0; i<10; i++)
			System.out.print(" ");
		System.out.println("|");
	}

	public void introAskQue()
	{
		StringBuilder iText = new StringBuilder();

		iText.append("Answer the question to defeat the enemy");
		iText.append("abc");
		iText.append("Or die like an idiot");

		String[] lines = iText.toString().split("abc");

		for(String s: lines)
		{
			int length = 100;
			int space = 20;

			System.out.print("|");

			while(space-- > 0)
			{
				System.out.print(" ");
				if(space == 10)
					System.out.print("|");
			}

			space = length - s.length() - 20;
			System.out.print(s);
			while(space > 0)
			{
				System.out.print(" ");
				if(space == 11)
					System.out.print("|");
				space--;
			}
			System.out.println("|");
		}
	}

	public void addSpace()
	{
		int spaces = getLength;
		System.out.print("|");
		while(spaces-- > 0)
		{
			System.out.print(" ");
			if(spaces == 70)
				System.out.print("|");
		}
		while(spaces < 19)
		{
			System.out.print(" ");
			if(spaces == 8)
				System.out.print("|");
			spaces++;
		}
		System.out.println("|");
	}

	public void defeatTheEnemy()
	{
		healthBar.addEmptySpace();
		healthBar.drawBoxTop();
		drawBoxTop();
		StringBuilder iText = new StringBuilder();

		iText.append("You are one of a kind...");
		iText.append("abc");
		iText.append("The one with wisdom and wits...");
		iText.append("abc");
		iText.append("With which you have defeated the enemy");

		String[] lines = iText.toString().split("abc");

		for(String s: lines)
		{
			int length = 100;
			int space = 20;

			System.out.print("|");

			while(space-- > 0)
			{
				System.out.print(" ");
				if(space == 10)
					System.out.print("|");
			}

			space = length - s.length() - 20;
			System.out.print(s);
			while(space > 0)
			{
				System.out.print(" ");
				if(space == 11)
					System.out.print("|");
				space--;
			}
			System.out.println("|");
		}
		drawBoxBottom();
		healthBar.drawBoxBottom();
	}

	public void defeatThePlayer()
	{
		healthBar.addEmptySpace();
		healthBar.drawBoxTop();
		drawBoxTop();
		StringBuilder iText = new StringBuilder();

		iText.append("You are one of a kind...");
		iText.append("abc");
		iText.append("The one with no wisdom and wits...");
		iText.append("abc");
		iText.append("With which you have defeated yourself");

		String[] lines = iText.toString().split("abc");

		for(String s: lines)
		{
			int length = 100;
			int space = 20;

			System.out.print("|");

			while(space-- > 0)
			{
				System.out.print(" ");
				if(space == 10)
					System.out.print("|");
			}

			space = length - s.length() - 20;
			System.out.print(s);
			while(space > 0)
			{
				System.out.print(" ");
				if(space == 11)
					System.out.print("|");
				space--;
			}
			System.out.println("|");
		}
		drawBoxBottom();
		healthBar.drawBoxBottom();
	}

	public void checkAnswer()
	{
		int choice = scan.nextInt();
		int rightChoice = controlUnit.getRightAnswerIndex()+1;

		if(choice == rightChoice)
		{
			numOfRight++;
			healBossDec += 3;
			numOfQue++;
			if(numOfRight == 3)
			{
				defeatTheEnemy();
			}
		}			
		else
		{
			healDec += 3;
			numOfQue++;
		}
	}

	public void gettingQuestions()
	{

		healthBar.drawBossHealthBar(healBossDec);
		healthBar.drawHealthBar(healDec);

		introAskQue();

		addSpace();
		addSpace();

		StringBuilder iText = new StringBuilder();

		iText.append(controlUnit.askQuestion());

		String[] lines = iText.toString().split("abc",0);

		for(String s: lines)
		{
			int length = 100;
			int space = 20;

			System.out.print("|");

			while(space-- > 0)
			{
				System.out.print(" ");
				if(space == 10)
					System.out.print("|");
			}

			space = length - s.length() - 20;
			System.out.print(s);
			while(space > 0)
			{
				System.out.print(" ");
				if(space == 11)
					System.out.print("|");
				space--;
			}
			System.out.println("|");
		}

		StringBuilder str = new StringBuilder();
		str = controlUnit.promptAnswer();

		lines = str.toString().split("abc");
		int i = 0;

		for(String s: lines)
		{
			int length = 100;
			int space = 20;

			System.out.print("|");

			while(space-- > 0)
			{
				System.out.print(" ");
				if(space == 10)
					System.out.print("|");
			}

			space = length - s.length() - 23;
			System.out.print(++i + ". " + s);
			while(space > 0)
			{
				System.out.print(" ");
				if(space == 11)
					System.out.print("|");
				space--;
			}
			System.out.println("|");
		}

		
	}

	public void printTextBox()
	{
		int queI = 3;
		int i = 0;

		while(queI-- > 0)
		{
			if(i >= 1)
			{
				healthBar.addEmptySpace();
				healthBar.drawBoxTop();
				healthBar.asciiPicture();
				drawBoxTop();
				gettingQuestions();
				drawBoxBottom();
				healthBar.drawBoxBottom();
				checkAnswer();
			}
			else
			{
				drawBoxTop();
				gettingQuestions();
				drawBoxBottom();
				healthBar.drawBoxBottom();
				checkAnswer();
			}
			i++;
		}
	}
}
