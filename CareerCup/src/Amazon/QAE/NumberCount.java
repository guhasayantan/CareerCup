package Amazon.QAE;
import java.util.*;
public class NumberCount {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 5, 5, 6, 7, 7};
		TreeMap<Integer, Integer> treemap = new TreeMap<Integer, Integer>();
		
		for(int num: arr)
		{
			if(!treemap.containsKey(num))
			{
				treemap.put(num, 1);
			}
			else
			{
				treemap.put(num, treemap.get(num)+1);
			}
		}
		
		Set set = treemap.entrySet();
		Iterator it = set.iterator();
		while(it.hasNext())
		{
			Map.Entry me = (Map.Entry)it.next();
			if(Integer.parseInt(me.getValue().toString())>1)
				System.out.println(me.getKey() + " is repeated "+ me.getValue() + " times");
		}
	}

}
