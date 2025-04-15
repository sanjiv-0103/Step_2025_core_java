Import java.util.Scanner;
public class Copy2DTo1DArray {
	public static void main(String[] args) {

		int[][] twoDArray = {
		{1, 2, 3},
		{4, 5, 6},
		{7, 8, 9}
		};
		int rows = twoDArray.length;
		int cols = twoDArray[0].length;
		int[] oneDArray = new int[rows * cols];
		int index = 0;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				oneDArray[index++] = twoDArray[i][j];
			}
		}
		System.out.println("1D Array after copying elements from the 2D Array:");
		for (int i = 0; i < oneDArray.length; i++) {
			System.out.print(oneDArray[i] + " ");
		}
	}
}