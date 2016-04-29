package Amazon.QAE;

import java.awt.geom.CubicCurve2D;

public class LongestPositiveSequence {

	public static void main(String[] args) {
		int[] seq = {1,2,-3,2,3,4,-6,1,2,3,4,5,-8,5,6};
		int position=-1;
		int maxposition =-1;
		int maxlength=0;
		int length =0;
		boolean flag = false;
		for (int i=0; i < seq.length; i++)
		{
			if(seq[i]>=0)
			{
				if(flag==true)
				{
					length++;
				}
				else
				{
					position =i;
					flag = true;
					length =1;
				}
			}
			else
			{
				if(maxlength < length)
				{
					maxlength=length;
					maxposition = position;
				}
				flag =false;
			}
		}
		System.out.println("The longest sequence starts at"+maxposition);

	}

}
