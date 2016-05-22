package Amazon.SDET;
import java.util.*;
public class subStringNonRepeated {

	public static void main(String []args){
		String s = "abababa";
		if(s==null)
			return;
		char[] inputs = s.toCharArray();
		String result ="";
		
		for(int i =0 ; i < inputs.length; i++)
		{
			if(result=="")
			{
				result = String.valueOf(inputs[i]);
			}
			else
			{
				if(inputs[i-1]!=inputs[i])
				{
					result+=String.valueOf(inputs[i]);
				}
			}
		}
		System.out.println(result);
	}

	void try1()
	{
		String s = "abcaaacccbiii";
		char[] inputs = s.toCharArray();
		Stack<Character> stack = new Stack<Character>();
		for (char input: inputs)
		{
			if(stack.isEmpty())
				stack.push(input);
			else if(stack.peek()!=input)
			{
				stack.push(input);
			}
		}
		String temp ="";
		while(!stack.isEmpty())
		{
			temp += String.valueOf(stack.pop());
		}
		char result[] = temp.toCharArray();
		for (int i=result.length-1;i>=0;i--)
			System.out.print(result[i]);

	}
}

