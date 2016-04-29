package Amazon.QAE;
import java.util.*;
public class ReverseAString {

	public static void main(String[] args) {
		String str = "This is a test";
		String[] temp=str.split(" ");
		Stack<String> stack=new Stack<String>();
		for(int i=0; i< temp.length; i++)
		{
			stack.push(temp[i]);
		}
		while(!stack.isEmpty())
		{
			System.out.print(stack.pop() + " ");
		}

	}

}
