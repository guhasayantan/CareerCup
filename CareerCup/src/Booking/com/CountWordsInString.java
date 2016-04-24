/*
 Given a stream of characters (e.g. acacabcatghhellomvnsdb) and a list of words 
 (e.g. ["aca","cat","hello","world"] ) 
 find and display count of each and every word once the stream ends.
 (Like : "aca" : 2 , "cat" : 1 , "hello" : 1 , "world" : 0 ).
 */

package Booking.com;
import java.util.*;

public class CountWordsInString {

	public static void main(String[] args)
	{
		String input = "acacabcatghhellomvnsdb";
		HashMap<String,Integer> hm= new HashMap<String,Integer>();
		String[] arr={"aca","cat","hello","world"};

		for (String word: arr)
		{
			int i = input.indexOf(word);
			if (i>=0)
				hm.put(word, 1);
			i = input.indexOf(word, i+1);
			while(i>=0)
			{
				hm.put(word, hm.get(word)+1);
				i=input.indexOf(word, i+1);
			}

		}
		for (Map.Entry m:hm.entrySet()) 
		{
            System.out.println(m.getKey()+":"+m.getValue());
        }
	}
}
