package Amazon.QAE;

import java.util.*;

public class PossibleNoInArraysSum {

	public static void main(String[] args) {
		int[] array = {0, 1, 2, 3, 4, 5};
		int n =4;
		TreeMap<Integer, Integer> hashmap = new TreeMap<Integer, Integer>();
		for(int i=0; i< array.length; i++)
		{
			if(!(hashmap.containsKey(array[i])&&hashmap.containsValue(n-array[i]))&&!(hashmap.containsKey(n-array[i])&&hashmap.containsValue(array[i])))
				hashmap.put(array[i], n-array[i]);
		}
		for(int i=0; i< array.length; i++)
		{
			if(hashmap.containsValue(array[i]))
				System.out.println(array[i]+","+(n-array[i]));
		}
	}

}
