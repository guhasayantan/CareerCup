package Amazon.QAE;

import java.util.ArrayList;

public class AddTwoArrayList {

	public static void main(String[] args) {
		int[] arr1 = {1, 5, 6, 4};
		int[] arr2 = {2, 3, 5, 8, 1};
		int first, second;
		ArrayList<Integer> arrlist = new ArrayList<Integer>();
		
		int i =0, j = 0, sum;
		while(i < arr1.length && j < arr2.length)
		{
			
			sum= arr1[i] + arr2[i];
			if(sum<10)
			{
				arrlist.add(sum);
			}
			else
			{
				String s = Integer.toString(sum);
				for(int l =0; l < s.length(); l++)
				{
					arrlist.add(Integer.parseInt(s.substring(l, l+1)));
				}
			}
			i++;
			j++;
		}
		while(i< arr1.length)
		{
			arrlist.add(arr1[i]);
			i++;
		}
		while(i < arr2.length)
		{
			arrlist.add(arr2[i]);
			i++;
		}
		System.out.println(arrlist);
	}

}
