package Microsoft;

import java.util.Arrays;
import java.util.HashMap;

public class CountGroupFrequency {

	public static void main(String[] args) {
		int inputnumbers[] = {1,10,3,33};
		int count=0;
		HashMap<Integer, Boolean> ht = new HashMap<Integer, Boolean>();
		for(int numbers: inputnumbers)
		{
			int[] integers= findNumbers(numbers);
			int key = Arrays.hashCode(integers);
			if(!ht.containsKey(key))
			{
				ht.put(key,true);
				count++;
			}
		}
		System.out.println(count);
	}
	public static int[] findNumbers(int val)
	{
		int[] counts=new int[10];
		if(val==0)
		{
			counts[0]=1;
			return counts;
		}
		while(val!=0)
		{
			int rem=val%10;
			counts[rem]++;
			val/=10;
		}
		return counts;
	}
}
