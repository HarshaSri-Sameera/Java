package owlCoder;

import java.util.Scanner;

public class DiagonalDifference {

	public static void main(String[] args) {
		
		int arr[][], row, col, ldia = 0, rdia = 0;
		Scanner sc = new Scanner(System.in);
		row = sc.nextInt();
		col = sc.nextInt();
		arr = new int[row][col];
		
		// reading the 2d array elements
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<col; j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<col; j++)
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		// left diagonal sum
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				if(i==j)
					ldia = ldia + arr[i][j];
				if(i+j == col-1)             // Diagonal elements only exists for square matrices, so either take row-1 or col-1.
					rdia = rdia + arr[i][j];
			}
		}
		
		System.out.println("The abs of left and right diagonal elements is " + Math.abs(ldia-rdia));
		sc.close();
	}
}
