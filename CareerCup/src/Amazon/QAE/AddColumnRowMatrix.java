package Amazon.QAE;

import java.util.*;
public class AddColumnRowMatrix {

	public static void main(String[] args) {
		int[][] matrix = 	{
								{2,3,8},
								{-1,3,9},
								{3,0,-4}
							};
		int[] sumrow = new int[matrix.length];
		int[] sumcol = new int[matrix[0].length];
		int sumi=0;
		for(int i=0; i<matrix.length; i++)
		{
			for(int j=0; j<matrix[i].length; j++)
			{
				sumi += matrix[i][j];
				sumcol[j] += matrix[i][j];
			}
			sumrow[i] = sumi;
			sumi=0;
		}
		System.out.println(Arrays.toString(sumrow));
		System.out.println(Arrays.toString(sumcol));
	}

}
