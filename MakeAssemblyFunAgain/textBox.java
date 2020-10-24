public class textBox
{
	int getLength = 80;

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

	public void gettingQuestions()
	{
		questionOptions qOpt = new questionOptions();
		qOpt.askQOpt();

		StringBuilder str = new StringBuilder();
		str = qOpt.getQuestion();

		String[] lines = str.toString().split("ab");

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

	public void printTextBox()
	{
		drawBoxTop();
		drawBoxBottom();
	}
}
