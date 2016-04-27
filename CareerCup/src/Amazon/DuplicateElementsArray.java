package Amazon;

public class DuplicateElementsArray {

	public static void main(String[] args) {
		int[] arr = {5,3,4,6,7,5,3,2,1};
		int[] temp = new int[10];
		for(int i=0; i<temp.length ; i++)
		{
			temp[i]=0;
		}
		for(int j =0; j<arr.length; j++)
		{
			if(temp[arr[j]]==0)
				temp[arr[j]]=1;
			else
			{
				temp[arr[j]]++;
			}
		}
		
		for(int k=0; k<temp.length; k++)
		{
			if(temp[k]>1)
				System.out.println("The number is "+ k + " and duplicate count is "+temp[k]);
		}

	}

}
