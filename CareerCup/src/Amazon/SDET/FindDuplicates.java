package Amazon.SDET;
import java.util.*;
public class FindDuplicates {

	public static void main(String[] args) {
		int[] arr1 = {1,3,7,9, 10};
		int[] arr2 = {1,2,3,5,4,1,8,9,7};
		int[] arr3 = {1,3,5,7,9,2,1,4,6,5,8};
		HashSet<Integer> hs1 = new HashSet<Integer>();
		HashSet<Integer> hs2 = new HashSet<Integer>();
		int[] arr4 = new int[arr1.length];
		for (int i =0; i < arr1.length; i++)
		{
			hs1.add(arr1[i]);
		}
		int k =0;
		for(int i = 0 ; i < arr2.length; i++)
		{
			
			if(hs1.contains(arr2[i]))
			{
				arr4[k] =  arr2[i];
				k++;
			}
		}
		for (int i =0; i < arr3.length; i++)
		{
			hs2.add(arr3[i]);
		}
		for(int i = 0 ; i < arr4.length; i++)
		{
			if(!hs2.contains(arr4[i]))
			{
				System.out.println(arr4[i]+ " ");
			}
		}
	}

}
