package Amazon.SDET;

/*

If in a relation there are multiple duplicate rows . Your task is to delete one duplicate row. 

a1 a2 
1 3 
1 3 
2 4 
3 5 
3 5 
3 5 
after deletion 
a1 a2 
1 3 
2 4 
3 5 
3 5 

 */
import java.util.*;
public class RemoveDupliacteRows {

	public static void main(String[] args) {
		int[] a1 = {1,1,2,3,3,3};
		int[] a2 = {3,3,4,5,5,5};
		HashSet<String> hashset = new HashSet<String>();
		boolean flag = false;
		for (int i=0; i< a1.length; i++){
			String a1a2 = String.valueOf(a1[i])+ String.valueOf(a2[i]);
			if(!hashset.contains(a1a2) && flag ==false)
			{
				hashset.add(a1a2);
				flag = true;
				
			}
			else 
			{
				System.out.println(a1a2);
			}
		}
	}

}
