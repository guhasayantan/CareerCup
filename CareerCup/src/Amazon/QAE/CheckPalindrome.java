package Amazon.QAE;
import java.util.*;
public class CheckPalindrome {

	public static void main(String[] args) {
		String input ="pyyp";
		TreeMap<Character, Integer> treemap = new TreeMap<Character, Integer>();
		char[] arr = input.toCharArray();
		for(int i=0; i<arr.length; i++)
		{
			if(!treemap.containsKey(arr[i]))
			{
				treemap.put(arr[i], 1);
			}
			else
			{
				treemap.put(arr[i], treemap.get(arr[i])+1);
			}
		}
		Set set = treemap.entrySet();
		Iterator it = set.iterator();
		int countone=0;
		int counteven=0;
		while(it.hasNext())
		{
			Map.Entry me = (Map.Entry)it.next();
			if(Integer.parseInt(me.getValue().toString())==1)
			{
				++countone;
			}
			if(Integer.parseInt(me.getValue().toString()) % 2==0 )
			{
				++counteven;
			}
		}
		if(countone==1 && counteven>0)
		{
			System.out.println("The string contain palindrome");
		}
		else
		{
			System.out.println("The string does not contain palindrome");
		}
	}

}
