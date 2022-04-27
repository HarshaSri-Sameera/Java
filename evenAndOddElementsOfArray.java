package owlCoder;

import java.util.Scanner;

public class evenAndOddElementsOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, arr[], even[], odd[];
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		arr = new int[n];
		even = new int[n];
		odd = new int[n];
		
		for(int i=0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}
		int j = 0, k = 0;
		for(int i=0; i<n; i++)
		{
			if(arr[i] % 2 == 0)
			{
				even[j++] = arr[i];
			}
			else
			{
				odd[k++] = arr[i];
			}
		}
		
		System.out.println("The Even array elements are: ");
		for(int i=0;i<j;i++)
		{
			System.out.print(even[i] + " ");
		}
		
		System.out.println();
		
		System.out.println("The odd array elements are: ");
		for(int i=0;i<k;i++)
		{
			System.out.print(odd[i] + " ");
		}
	}

}
