package Amazon.QAE;

public class PrintSprialArray {

	public static void main(String[] args) {
		
			int[][] arr = new int [][] {{1, 2, 3, 4}, {12, 13, 14, 5}, {11, 16, 15, 6}, {10, 9, 8, 7}};
			printArrayInSpiral (arr);
		}

		private static void printArrayInSpiral(int[][] arr) {
			printArrayInSpiral(arr, 0);
		}

		private static void printArrayInSpiral(int[][] arr, int step) {
			if ( step > (arr[step].length - step - 1)) {
				return;
			}
			
			for (int i = step; i < arr[step].length - step - 1; i++) {
				System.out.print(arr[step][i]+"  ");
			}
			
			for (int i = step; i < (arr.length - step); i++) {
				System.out.print(arr[i][(arr[step].length - step - 1)]+"  ");
			}
			
			for (int i = arr.length - step -2; i >= step; i--) {
				System.out.print(arr[(arr.length - step -1)][i]+"  ");
			}
			
			for (int i = arr.length - step -2; i > step; i--) {
				System.out.print(arr[i][step]+"  ");
			}
			
			printArrayInSpiral(arr, step + 1);
		}

}
