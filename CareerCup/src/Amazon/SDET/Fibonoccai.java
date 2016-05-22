package Amazon.SDET;

import java.util.ArrayList;

public class Fibonoccai {

	public static void main(String[] args) {

		ArrayList<Integer> result = fibIteration(40);
		System.out.print(result);
		System.out.print(fibReccursion(40));
		
	}
	public static ArrayList<Integer> fibIteration(int n)
	{
		int f1 =0;
		int f2 =1;
		int fib =0;
		ArrayList<Integer> al = new ArrayList<>();
		while (fib<n)
		{			
			al.add(fib);
			fib = f1 + f2;
			f1=f2;
			f2= fib;
		}
		return al;
	}

	public static int fibReccursion(int n)
	{
		if (n <2)
			return n;
		return fibReccursion(n-1) + fibReccursion(n-2);
	}
}
