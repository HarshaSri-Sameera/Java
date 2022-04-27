package owlCoder;

import java.util.Scanner;

public class Arthemetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("Sum is " + (a+b));
		System.out.println("Sub is " + (a-b));
		System.out.println("Mul is " + (a*b));
		sc.close();
	}

}
