package Amazon;
import java.util.*;
public class MinimumDistanceTwoWords {

	public static void main(String[] args) {
		String str = "the brown quick frog quick the";
		String word1 = "the";
		String word2 = "quick";
		String[] words = str.split(" ");
		ArrayList< Integer> w1 = new ArrayList<Integer>();
		ArrayList< Integer> w2 = new ArrayList<Integer>();
		for(int i =0; i< words.length;i++)
		{
			if(words[i].contains(word1))
			{
				w1.add(i);
			}
			if(words[i].contains(word2))
			{
				w2.add(i);
			}
		}
		
		int k = 0;
		int l = 0;
		int dis = 0;
		int mindis=Integer.MAX_VALUE;
		while(w1.size() > k)
		{
			while(w2.size()> l)
			{
				dis = Math.abs(w2.get(k) - w1.get(l));
				if(dis<mindis)
					mindis = dis;
				l++;
			}
			k++;
		}
		System.out.println(mindis);
	}

}
