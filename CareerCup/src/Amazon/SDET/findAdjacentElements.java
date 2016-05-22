package Amazon.SDET;

public class findAdjacentElements {

	public static void main(String[] args) {
		int[] arr = {1,2,4,6,7,9,10,11};
		for(int i =1; i < arr.length; i++)
		{
			int dif = Math.abs(arr[i]-arr[i-1]);
			if(dif==1)
			{
				System.out.println("The two variables are : "+arr[i-1]+","+arr[i]);
			}
		}
	}

}
