package Amazon.QAE;
import java.util.*;
public class ReverseRemoveDuplicate {

	public static void main(String[] args) {
		int num = 2452;
		int rev=0;
		boolean[] used = {false, false, false, false, false, false, false, false, false};
		while(num>0)
		{
			int digit = num%10;
			if(!used[digit])
			{
				rev = 10*rev+digit;
				used[digit]= true;
			}
			num/=10;
		}
		System.out.println(rev);
	}

}
