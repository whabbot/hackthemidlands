import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class questionOptions
{
	private StringBuilder question = new StringBuilder();
	private List<String> options = Collections.emptyList();

	public void setQuestion(String question)
	{
		this.question.append(question);
		this.question.append("ab");
	}

	public StringBuilder getQuestion()
	{
		return question;
	}

	public void setOptions(List<String> options)
	{
		this.options = options;
	}

	public List<String> getOptions()
	{
		return options;
	}

	public void askQOpt()
	{
		questionArchitecture();
	}

	public void questionArchitecture()
	{
		String questionArray[] = {
			"Number of units in Von Neumann Architecture?",
			"The one that connects processor and memory are?",
			"Control Unit doesnot communicate with Input/Output interfaces",
			"Does Control Unit stores or process data?",
		};
		
		for(int i=0; i<(questionArray.length); i++)
		{
			setQuestion(questionArray[i]);
		}
	}
}
