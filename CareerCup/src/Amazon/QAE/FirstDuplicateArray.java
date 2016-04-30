package Amazon.QAE;
import java.util.*;
public class FirstDuplicateArray {

	public static void main(String[] args) {
		int[] array = new int[]{4,3,1,2,5,9,5,4};
		HashMap<Integer, Integer> hashmap = new HashMap<Integer, Integer>();
		for(int num : array)
		{
			if(!hashmap.containsKey(num))
			{
				hashmap.put(num, 1);
			}
			else
			{
				System.out.println("The first duplicate number is: "+ num);
				break;
			}
		}
	}

}
