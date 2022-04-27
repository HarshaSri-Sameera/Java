package owlCoder;

import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int s, k, count = 0;
		s = sc.nextInt();
		k = sc.nextInt();
		sc.nextLine();
		int x[]; // declaring an array
		x = new int[s]; // initializing an array
		for(int i=0;i<s;i++)
		{
			x[i] = sc.nextInt();
			if(x[i]%k != 0)
				count++;
		}
		System.out.println("The count of numbers which are not divisible by " + k + " is: " + count);
	}

}
