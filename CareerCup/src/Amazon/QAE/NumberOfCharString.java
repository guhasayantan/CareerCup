package Amazon.QAE;
import java.util.*;
public class NumberOfCharString {

	public static void main(String[] args) {
		String string = "Test";
		char[] array = string.toLowerCase().toCharArray();
		TreeMap<Character, Integer> treemap= new TreeMap<Character, Integer>();
		for(char letter: array)
		{
			if(!treemap.containsKey(letter))
			{
				treemap.put(letter, 1);
			}
			else
			{
				treemap.put(letter, treemap.get(letter)+1);
			}
		}
		Set set = treemap.entrySet();
		Iterator it = set.iterator();
		while(it.hasNext())
		{
			Map.Entry me = (Map.Entry)it.next();
			System.out.println("The character "+me.getKey()+" has "+ me.getValue()+ " occurance");
		}

	}

}
