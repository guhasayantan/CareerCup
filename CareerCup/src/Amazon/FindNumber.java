package Amazon;
/*
 *An array consist of elements whose difference is positive or negative 1. 
 *I have to find the given elements without using linear search. 
 */
public class FindNumber {

	public static void main(String[] args) {
		int[] arr ={1,2,3,4,2,4,5,6,7};
		int find = 6;
		int length = arr.length -1;
		int i = find - arr[0];
		int index=0;
		while(index< length)
		{
			while(i--!=00)
				index++;
			if(arr[index]==find)
			{			
				System.out.println("The number if in position "+i);
				return;
			}
			else
			{
				i = Math.abs(arr[index] - find);
			}
		}

	}

}
