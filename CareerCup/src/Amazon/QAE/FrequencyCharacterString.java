package Amazon.QAE;

//Find the frequency of character in string
import java.util.*;
public class FrequencyCharacterString {

	public static void main(String[] args) {
		String input = "abbcdc";
		TreeMap<Character, Integer> hash = new TreeMap<Character, Integer>();
		for(int i =0; i < input.length(); i++)
		{
			char position= input.charAt(i);
			if(!hash.containsKey(position))
			{
				hash.put(position, 1);
			}
			else
			{
				hash.put(position, hash.get(position)+1);
			}
		}
		
		Set set = hash.entrySet();
		Iterator it=set.iterator();
		while(it.hasNext())
		{
			Map.Entry me = (Map.Entry)it.next();
			System.out.println(me.getKey()+","+me.getValue());
		}
	}

}
