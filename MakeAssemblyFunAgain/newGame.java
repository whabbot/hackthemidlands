public class newGame
{
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

	public void asciiInitialPicture()
	{
		compPicture nGamePic = new compPicture();
		StringBuilder str = nGamePic.printComputerPicture();

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

	public void drawTextBoxTop()
	{
		int length = 80;

		System.out.print("|");
		for(int i=0; i<10; i++)
			System.out.print(" ");
		System.out.print("+");
		for(int i=0; i<length; i++)
			System.out.print("-");
		System.out.print("+");
		for(int i=0; i<10; i++)
			System.out.print(" ");
		System.out.println("|");
	}

	public void drawTextBoxBottom()
	{
		int length = 80;

		System.out.print("|");
		for(int i=0; i<10; i++)
			System.out.print(" ");
		System.out.print("+");
		for(int i=0; i<length; i++)
			System.out.print("-");
		System.out.print("+");
		for(int i=0; i<10; i++)
			System.out.print(" ");
		System.out.println("|");
	}

	public void introText()
	{
		StringBuilder iText = new StringBuilder();

		iText.append("Welcome to the game...");
		iText.append("abc");
		iText.append("The game where your choice matters!!");
		iText.append("abc");
		iText.append("Enter the world by pressing \"a\" or run away by pressing \"q\"");

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
		System.out.print("|");
		for(int i=0; i<=getLength+1; i++)
			System.out.print(" ");
		System.out.println("|");
	}	

	public void newGameScreen()
	{
		drawBoxTop();
		
		asciiInitialPicture();

		addSpace();
		
		drawTextBoxTop();
		
		introText();
		
		drawTextBoxBottom();
		
		drawBoxBottom();
	}
}
