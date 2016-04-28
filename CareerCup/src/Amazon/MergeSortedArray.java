package Amazon;

public class MergeSortedArray {

	public static void main(String[] args) {
		int[] a=new int[]{7,10,11,20,0,0,0};//0 at the end should be assumed as empty space
		int[] b = new int[]{1,3,7};
		int[] c = new int[10];
		int n=a.length;
		int m=b.length;
		int i = n-m-1;
		int j = m-1;
		int k = n-1;
		while(i>=0 && j>=0 && k>=0)
		{
			if(a[i] > b[j])
			{
				c[k] = a[i];
				i--;
			}
			else
			{
				c[k] = b[j];
				j--;
			}
			k--;
		}
		if(i<0)
		{
			while(j>=0 && k>=0)
			{
				c[k] = b[j];
				k--;
				j--;
			}
		}
		else if(j<0)
		{
			while(i>=0 && k>=0)
			{
				c[k] = a[i];
				k--;
				i--;
			}
		}

		for(int p=0; p< c.length; p++)
		{
			System.out.print(c[p]+ " ");
		}
	}

}
