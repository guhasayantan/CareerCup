//Print sum of all digit in a string

package Amazon;

public class SumOfNumbersString {

	public static void main(String[] args) {
		String input = "a3n5nhoibo9";
		char[] arr = input.toCharArray();
		int sum =0;
		for (int i=0; i < arr.length; i++)
		{
			char currentposition = arr[i];
			if(Character.isDigit(currentposition))
			{
				sum+=Character.getNumericValue(currentposition);
			}
		}
		System.out.println("The summation of all digit in a string:" + sum);

	}

}
