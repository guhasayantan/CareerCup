package Amazon.QAE;

public class ReplaceCharFromString {

	public static void main(String[] args) {
		
		String s1= "abcedfgchf";
		String s2= "xyz";
		char c = 'c';
		
		char[] s = s1.toCharArray();
		String output = "";
		for (int i =0; i < s.length; i++)
		{
			if(s[i]==c)
			{
				output = output + s2;
			}
			else
			{
				output = output + String.valueOf(s[i]);
			}
		}
		System.out.println(output);
	}

}
