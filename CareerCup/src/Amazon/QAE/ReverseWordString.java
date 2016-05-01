package Amazon.QAE;

import java.util.*;

public class ReverseWordString {

	public static void main(String[] args) {
		String input="I am a human being";
		String[] words=input.split(" ");
		ArrayList<String> output= new ArrayList<String>();
		for (String word:words)
		{
			char[] letter =  word.toCharArray();
			for(int i=0, j=letter.length-1; i<j;i++,j--)
			{
				char temp=letter[i];
				letter[i] = letter[j];
				letter[j]=temp;				
			}
			for (char c : letter)
				System.out.print(c);
			System.out.print(" ");
		}
	}
}

