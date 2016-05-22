package Amazon.SDET;
/*
 Give this input: Sea!tle is a nice place. Work Hard! have Fun, make HIStory! 
display this output using any C or vb script: 
Seattle is a nice place. 
Work hard. 
Have fun. 
Make history.
 */
public class CheckPeriodCharacter {

	public static void main(String[] args) {
		String s = "Sea!tle is a nice place. Work Hard! have Fun, make HIStory!";
		String[] inputs = s.split(" ");
		for (String input: inputs)
		{
			char[] word = input.toCharArray();
			int len = word.length-1;
			String result="";
			
			if (word[len] == '.'||word[len]=='!'||word[len]=='.')
			{	
				String lastword= input.replace(word[len], '.');
				System.out.print(lastword);
				System.out.println();
			}	
			else
			{
				result += input + " " ;
				System.out.print(result);
			}
			result="";
		}

	}

}
