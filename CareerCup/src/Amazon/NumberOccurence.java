package Amazon;

public class NumberOccurence {

	public static void main(String[] args) {
		int num=7;
		int[] arr= {1,2,3,4,5,5,6,7};
		int first=-1, last=-1;
		boolean visited = false;
		for(int i =0; i < arr.length ; i++)
		{
			if(arr[i]==num && visited==false)
			{
				first =i;
				last =i;
				visited = true;
			}
			else if(arr[i]==num && visited==true)
			{
				last = i;
			}
		}
		System.out.println("First occurence: " + first );
		System.out.println("Last occurence: " + last );
	}

}
