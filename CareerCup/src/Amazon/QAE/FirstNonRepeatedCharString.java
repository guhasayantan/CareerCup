package Amazon.QAE;

import java.util.*;

public class FirstNonRepeatedCharString {
	
	public static void main(String[] args) {
		String str = "Salesforce is the best company to work for";
		char[] chr = str.toLowerCase().toCharArray();
		
		LinkedHashMap<Character, Integer> linkmap= new LinkedHashMap<Character, Integer>();
		
		for(int i =0; i < chr.length; i++)
		{
			char position = chr[i];
			if(!linkmap.containsKey(position))
			{
				linkmap.put(position, 1);
			}
			else
			{
				linkmap.put(position, linkmap.get(position)+1);
			}
		}
		Set set= linkmap.entrySet();
		Iterator it= set.iterator();
		while(it.hasNext())
		{
			Map.Entry me = (Map.Entry)it.next();
			
			if(Integer.parseInt(me.getValue().toString()) == 1)
			{
				System.out.println(me.getKey());
				break;
			}
		}
	}

}
