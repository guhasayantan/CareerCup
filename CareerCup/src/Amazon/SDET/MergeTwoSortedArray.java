package Amazon.SDET;
import java.util.*;
public class MergeTwoSortedArray {

	public static void main(String[] args) {
		int [] a = {1,3,4, 5,6,7,8}; 
		int [] b={4,6,7,8,9,10,11,12,13,14,15};
		int i =0, j = 0;
		ArrayList<Integer> al = new ArrayList<Integer>();
		while(i <  a.length && j < b.length)
		{
			if(a[i] < b[j])
			{
				al.add(a[i]);
				i++;
			}
			else
			{
				al.add(b[j]);
				j++;
			}
		}
		while(i<a.length)
		{
			al.add(a[i]);
			i++;
		}
		while(j<b.length)
		{
			al.add(b[j]);
			j++;
		}
		System.out.println("The sorted merge of two array is " + al);
	}

}
