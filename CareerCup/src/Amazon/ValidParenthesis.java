package Amazon;

public class ValidParenthesis {

	public static void main(String[] args) {
		String paren = "(())())";
		int count=0;
		for(int i = 0; i<paren.length(); i++)
		{
			if(paren.charAt(i)=='(')
				++count;
			else if(paren.charAt(i)==')')
			{
				if(count==0)
					System.out.println("False");
				--count;
			}
		}
		if(count==0)
			System.out.println("True");
	}

}
