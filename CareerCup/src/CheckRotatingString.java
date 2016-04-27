
public class CheckRotatingString {

	public static void main(String[] args) {
		String s1 = "amazon";
		String s2 = "azonam";
		//Solution 1
		String s3 = s1.substring(2) + s1.substring(0, 2);
		if(s3.equals(s2))
			System.out.println("True");
		else
			System.out.println("False");
		
		//Solution 2
		String s4 = s2 + s2;
		if(s4.contains(s1))
			System.out.println("True");
		else
			System.out.println("False");
	}

}
