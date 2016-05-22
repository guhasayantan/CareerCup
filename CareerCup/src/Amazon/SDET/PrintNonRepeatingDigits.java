package Amazon.SDET;
import java.util.*;
public class PrintNonRepeatingDigits {

	public static void main(String[] args) {
		int i = 43;
		boolean flag = false;
		while(i <= 4578)
		{
			HashSet<Character> hs = new HashSet<Character>();
			String num = String.valueOf(i);
			char[] digits = num.toCharArray();
			for(int j = 0 ;  j <  digits.length; j++)
			{
				if(!hs.contains(digits[j]))
				{
					hs.add(digits[j]);
					//System.out.print(num);
					flag = true;
				}
				else
				{
					flag = false;
				}
				
			}
			if(flag)
			{
				System.out.print(num);
			}
			System.out.println(" ");
			i++;
		}

	}

}
