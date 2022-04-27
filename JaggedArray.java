package owlCoder;

import java.util.*;

public class JaggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x[][] = new int[5][];
		x[0] = new int[4];
		x[1] = new int[3];
		x[2] = new int[2];
		x[3] = new int[5];
		x[4] = new int[1];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<x.length; i++)
		{
			for(int j=0; j<x[i].length; j++)
			{
				x[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0; i<x.length; i++)
		{
			for(int j=0; j<x[i].length; j++)
			{
				System.out.print(x[i][j] + " ");
			}
			System.out.println();
		}
	}

}
