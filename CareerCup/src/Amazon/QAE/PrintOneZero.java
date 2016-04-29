package Amazon.QAE;

public class PrintOneZero {

	public static void main(String[] args) {
		int[] arr ={1,1,0,1,0,0,0};
		int[][] output = new int[10][10];
		int count0 = 0, count1=0;
		for(int i=0; i < arr.length; i++)
		{
			if(arr[i]==0)
				count0++;
			if(arr[i]==1)
				count1++;
			for(int j=0; j < count0; j++)
			{
				output[i][j]=0;
			}
			for(int j=count0; j < count1+count0; j++)
			{
				output[i][j]=1;
			}
		}
		for(int i=0; i < arr.length; i++)
		{
			for(int j=0; j < i+1; j++)
			{
				System.out.print(output[i][j]);
			}
			System.out.println(" ");
		}
	}

}
