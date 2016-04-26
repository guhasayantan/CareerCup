package Amazon;

public class ReverseString {

	public static void main(String[] args) {
		String input = "This is an example";
		String[] words = input.split(" ");
		
		for(String word: words)
		{
			char[] a= word.toCharArray();
			int left, right =0;
			right = a.length -1;
			for(left =0; left< right;left++, right--)
			{
				char temp= a[left];
				a[left]=a[right];
				a[right]=temp;
			}
			for(char c:a)
			{
				System.out.print(c);
			}
			System.out.print(" ");
			
		}
	}

}
