/*

Find the anagrams from a list of strings 
Input : {"tea", "ate", "eat", "apple", "java", "vaja", "cut", "utc"} 
Output : {"tea", "ate", "eat","java", "vaja", "cut", "utc"}
 
*/

package Twitter;

import java.util.Arrays;
import java.util.HashSet;

public class AnagramsStringList {

	public static void main(String[] args) {
		String[] input = new String[]{"tea", "ate", "eat", "apple", "java", "vaja", "cut", "utc"}; 
		int i =0;
		int j =0;
		
		HashSet<String> outputlist = new HashSet<String>();
		
		for(; i < input.length ; i++)
		{
			for(j = i +1 ; j < input.length ; j++)
			{
				if(checkAnagrams(input[i], input[j]))
				{
					outputlist.add(input[i]);
					outputlist.add(input[j]);
					
				}
			}
		}
		
		
		System.out.println(outputlist);
	}
	
	public static boolean checkAnagrams(String a, String b)
	{
		char[] x= a.toLowerCase().toCharArray();
		char[] y= b.toLowerCase().toCharArray(); 
		Arrays.sort(x);
		Arrays.sort(y);
		return Arrays.equals(x,y);
	}

}
