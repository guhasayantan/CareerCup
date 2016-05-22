package Amazon.SDET;

public class SumEqualCheck {

	public static void main(String[] args) {
		System.out.println("Check is the sum of the equal part of the number is "+ checkEqualSum("678876"));

	}
	public static boolean checkEqualSum(String s)
	{
		int len = s.length();
		if(len%2!=0)
		{
			return false;
		}
		else
		{
			int sum1 =0 , sum2 =0;
			char[] digits = s.toCharArray();
			for (int i =0; i < len/2; i++)
			{
				sum1 += Integer.valueOf(digits[i]);
			}
			for (int i =len/2; i < len; i++)
			{
				sum2 += Integer.valueOf(digits[i]);
			}
			if(sum1==sum2)
				return true;
			else
				return false;
		}
	}

}
