import java.util.Scanner;

public class MakeAssemblyFunAgain
{
	Scanner scan = new Scanner(System.in);
	int getLength = 100;

	public void drawBoxTop()
	{
		System.out.print("+");
		for(int i=0; i<=getLength+1; i++)
			System.out.print("-");
		System.out.println("+");
	}

	public void drawBoxBottom()
	{
		System.out.print("+");
		for(int i=0; i<=getLength+1; i++)
			System.out.print("-");
		System.out.println("+");
	}

	public void asciiPicture()
	{
		pictureGraphic graphic = new pictureGraphic();
		StringBuilder str = graphic.icChip();

		String[] lines = str.toString().split("ab");

		for(String s: lines)
		{
			int space = getLength - s.length() + 2;
			System.out.print("|" + s);
			while(space > 0)
			{
				System.out.print(" ");
				space--;
			}
			System.out.println("|");
		}
	}

	public void drawHealthBar()
	{
		int spaces = getLength - 20;
		int i = 10;
		System.out.print("|");
		while(spaces-- > 0)
		{
			System.out.print(" ");
			if(spaces == 70)
				System.out.print("|");
		}
		while(i-- > 0)
			System.out.print("I");
		System.out.print("|");
		while(spaces < 9)
		{
			System.out.print(" ");
			spaces++;
		}
		System.out.println("|");
	}

	public void addSpace()
	{
		System.out.print("|");
		for(int i=0; i<=getLength+1; i++)
			System.out.print(" ");
		System.out.println("|");
	}

	public void addEmptySpace()
	{
		classEmptySpace eSpace = new classEmptySpace();
		eSpace.emptySpace();
	}

	public void startGame()
	{
		newGame nGame = new newGame();
		nGame.newGameScreen();
	}

	public void run()
	{
		startGame();

		String startExit = scan.nextLine();

		if(startExit.equals("a"))
		{
			addEmptySpace();

			textBox tBox = new textBox();

			drawBoxTop();

			asciiPicture();

			tBox.drawBoxTop();

			drawHealthBar();

			tBox.gettingQuestions();

			tBox.drawBoxBottom();

			drawBoxBottom();

		}
		else
			System.exit(0);
	}

	public static void main(String[] args)
	{
		new MakeAssemblyFunAgain().run();
	}
}
