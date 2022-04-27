package owlCoder;

import java.util.Scanner;

public class sumOfArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x[], n, sum=0, i;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		x = new int[n];
		for(i=0; i<n; i++)
		{
			x[i]=sc.nextInt();
			sum = sum + x[i];
		}
		for(int it:x)
		{
			System.out.print(it + " ");
		}
		
		System.out.println("The sum of elements in the array is " + sum);
	}

}
